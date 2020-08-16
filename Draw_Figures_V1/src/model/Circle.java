package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle extends Figure {

    private double radio;

    public Circle(double radio, double cx, double cy) {
        this.radio = radio;
        this.coordenaY = cy;
        this.coordenadaX = cx;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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
        return "Circle " + " con coordenadas (x,y) " + " (" + this.coordenadaX + "," + this.coordenaY + ") " + "y radio=" + radio + ".";

    }

    @Override
    public double calculaArea() {
        double areaAux = Math.PI * Math.pow(this.radio, 2);
        return areaAux;
    }
    
    @Override
    public void dibujar(Graphics cg){
        Graphics2D gd = (Graphics2D) cg;
        gd.draw(new Ellipse2D.Double((this.coordenadaX - (this.radio/2)),(this.coordenaY - (this.radio/2)),2 * this.radio,2 * this.radio));
    }

    @Override
    public void setNombreFigura(String nombreFigura) {
        super.setNombreFigura(nombreFigura); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombreFigura() {
        return super.getNombreFigura(); //To change body of generated methods, choose Tools | Templates.
    }

}
