package model;

import java.awt.Graphics;

public class Figure {

    protected int indentifier;
    protected double coordenadaX;
    protected double coordenaY;
    protected double area;

    @Override
    public String toString() {
        return "Figure{" + "indentifier=" + indentifier
                + ", coordenadaX=" + coordenadaX
                + ", coordenaY=" + coordenaY + '}';
    }

    public double calculaArea() {
        return area;
    }
    
    public void dibujar(Graphics g){
        
    }
}
