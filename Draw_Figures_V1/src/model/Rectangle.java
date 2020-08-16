package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Figure {

    private double base;
    private double altura;

    public Rectangle(double base, double altura, double cx, double cy) {
        this.base = base;
        this.altura = altura;
        this.coordenaY = cy;
        this.coordenadaX = cx;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
        return "Rectangle{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double calculaArea() {
        double areaAux = this.base * this.altura;
        return areaAux;
    }
    
    public void dibujar(Graphics cg){
        Graphics2D dg = (Graphics2D) cg;
        dg.draw(new Rectangle2D.Double(this.coordenadaX,this.coordenaY,this.base,this.altura));
    }
}
