package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Triangle extends Figure {

    private double vertice1;
    private double vertice2;
    private double vertice3;
    private double vertice4;

    public Triangle(double vertice1, double vertice2, double vertice3, double vertice4, double cx, double cy) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
        this.coordenaY = cy;
        this.coordenadaX = cx;
    }

    public double getVertice1() {
        return vertice1;
    }

    public void setVertice1(double vertice1) {
        this.vertice1 = vertice1;
    }

    public double getVertice2() {
        return vertice2;
    }

    public void setVertice2(double vertice2) {
        this.vertice2 = vertice2;
    }

    public double getVertice3() {
        return vertice3;
    }

    public void setVertice3(double vertice3) {
        this.vertice3 = vertice3;
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
        return "Triangle " + " con coordenadas (x,y) " + " (" + this.coordenadaX + "," + this.coordenaY + ") " + "y vertice 1 en=" + this.vertice1 + ", vertice 2 en =" + this.vertice2 + ", vertice 3 en=" + this.vertice3;
    }

    @Override
    public double calculaArea() {
        double lado1 = Math.sqrt(Math.pow((this.vertice1 - this.vertice3), 2) + Math.pow((this.vertice2 - this.vertice4), 2));
        double lado2 = Math.sqrt(Math.pow((this.vertice1 - this.coordenadaX), 2) + Math.pow((this.vertice2 - this.coordenaY), 2));
        double lado3 = Math.sqrt(Math.pow((this.vertice3 - this.coordenadaX), 2) + Math.pow((this.vertice4 - this.coordenaY), 2));
        double sp = (lado1+lado2+lado3)/2;
        double areaAux = Math.sqrt(sp *( (sp-lado1) * (sp - lado2) * (sp-lado3)));
        return areaAux;
    }
    
    @Override
    public void dibujar(Graphics cg){
        Graphics2D dg = (Graphics2D) cg;
        dg.draw(new Line2D.Double(this.vertice1,this.vertice2,this.vertice3,this.vertice4));
        dg.draw(new Line2D.Double(this.vertice1,this.vertice2,this.coordenadaX,this.coordenaY));
        dg.draw(new Line2D.Double(this.vertice3,this.vertice4,this.coordenadaX,this.coordenaY));
    }
}
