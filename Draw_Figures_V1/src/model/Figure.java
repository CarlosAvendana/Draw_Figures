package model;

import java.awt.Graphics;

public class Figure {

    protected int indentifier;
    protected double coordenadaX;
    protected double coordenaY;
    protected double area;
    protected String nombreFigura;

    @Override
    public String toString() {
        return "Figure{" + "indentifier=" + indentifier
                + ", coordenadaX=" + coordenadaX
                + ", coordenaY=" + coordenaY + '}';
    }
    
    public boolean puntoEnFigura(double xp, double yp){
        return true;
    }

    public void calculaArea() {
        
    }
    
    public void dibujar(Graphics g){
        
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

}
