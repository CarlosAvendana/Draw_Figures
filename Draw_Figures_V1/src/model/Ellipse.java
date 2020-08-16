package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Ellipse extends Figure {

    private double radioMenor;
    private double radioMayor;

    public Ellipse(double radioMenor, double radioMayor, double cx, double cy) {
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
        return "Ellipse{" + "radioMenor=" + radioMenor + ", radioMayor=" + radioMayor + '}';
    }

    @Override
    public double calculaArea() {
        double areaAux = Math.PI * this.radioMayor * this.radioMenor;
        return areaAux;
    }
    
    @Override
    public void dibujar(Graphics cg){
        Graphics2D gd = (Graphics2D) cg;
        gd.draw(new Ellipse2D.Double(this.coordenadaX,this.coordenaY,2 * this.radioMenor, 2 * this.radioMayor));
    }
}
