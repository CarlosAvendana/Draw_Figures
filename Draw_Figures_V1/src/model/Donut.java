package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Donut extends Figure {

    private double radioMenor;
    private double radioMayor;

    public Donut(double radioMenor, double radioMayor, double cx, double cy) {
        this.radioMenor = radioMenor;
        this.radioMayor = radioMayor;
        this.coordenaY = cy;
        this.coordenadaX = cx;
    }

    public double getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }

    public double getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public int getIndentifier() {
        return indentifier;
    }

    public void setIndentifier(int indentifier) {
        this.indentifier = indentifier;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenaY() {
        return coordenaY;
    }

    public void setCoordenaY(double coordenaY) {
        this.coordenaY = coordenaY;
    }

    @Override
    public String toString() {

        return "Donut " + " con coordenadas (x,y) " + " (" + this.coordenadaX + "," + this.coordenaY + ") " + ", radio menor =" + radioMenor + ", radio mayor =" + this.radioMayor + " y area = " + this.area + ".";

    }

    @Override
    public void calculaArea() {
        double areaAux = Math.PI * (Math.pow(this.radioMayor, 2) - Math.pow(this.radioMenor, 2));
        this.area = areaAux;
    }

    @Override
    public void dibujar(Graphics cg) {
        Graphics2D gd = (Graphics2D) cg;
        gd.draw(new Ellipse2D.Double(this.coordenadaX - this.radioMenor,
                this.coordenaY - this.radioMenor,
                2*this.radioMenor,
                2*this.radioMenor));
        gd.draw(new Ellipse2D.Double(this.coordenadaX - this.radioMayor,
                this.coordenaY - this.radioMayor,
                2*this.radioMayor,
                2*this.radioMayor));
    }

    @Override
    public boolean puntoEnFigura(double xp, double yp) {
        boolean aux = false;
        if ((Math.pow((this.coordenadaX - xp), 2) + Math.pow((this.coordenaY - yp), 2) <= this.radioMayor) && (Math.pow((this.coordenadaX - xp), 2) + Math.pow((this.coordenaY - yp), 2) >= this.radioMenor)) {
            aux = true;
        }
        return aux;
    }
}
