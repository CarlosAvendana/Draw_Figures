package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Square extends Figure {

    private double logintudLado;

    public Square(double logintudLado, double cx, double cy) {
        this.logintudLado = logintudLado;
        this.coordenaY = cy;
        this.coordenadaX = cx;
    }

    public double getLogintudLado() {
        return logintudLado;
    }

    public void setLogintudLado(double logintudLado) {
        this.logintudLado = logintudLado;
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
        return "square " + " con coordenadas (x,y) " + " (" + this.coordenadaX + "," + this.coordenaY + ") " + ", longitud de lado= " + this.logintudLado +" y area= "+this.area+ ".";

    }

    @Override
    public void calculaArea() {
        double areaAux = Math.pow(this.logintudLado, 2);
        this.area =  areaAux;
    }
    
    @Override
    public void dibujar(Graphics cg){
        Graphics2D dg = (Graphics2D) cg;
        dg.draw(new Rectangle2D.Double(this.coordenadaX,this.coordenaY,this.logintudLado,this.logintudLado));
    }
    
    @Override
    public boolean puntoEnFigura(double xp, double yp){
        double lado = this.logintudLado / 2;
        double xcentro = this.coordenadaX + lado;
        double ycentro = this.coordenaY - lado;
        return (Math.abs(xp - xcentro) < lado && Math.abs(yp - ycentro) < lado);
    }
}
