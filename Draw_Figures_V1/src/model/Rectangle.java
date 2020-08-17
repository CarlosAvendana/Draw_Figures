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
        return "rectangle " + " con coordenadas (x,y) " + " (" + this.coordenadaX + "," + this.coordenaY + ") " + ", base= " + base + ", altura= " + altura + " y area= " + this.area + ".";

    }

    @Override
    public void calculaArea() {
        double areaAux = this.base * this.altura;
        this.area = areaAux;
    }

    @Override
    public void dibujar(Graphics cg) {
        Graphics2D dg = (Graphics2D) cg;
        dg.draw(new Rectangle2D.Double(this.coordenadaX, this.coordenaY, this.base, this.altura));
    }

    @Override
    public boolean puntoEnFigura(double xp, double yp) {
        boolean aux = false;
        double x2 = this.coordenadaX + this.base;
        double y2 = this.coordenaY + this.altura;
        double areaT1 = 0.0;
        double areaT2 = 0.0;
        double areaT3 = 0.0;
        double areaT4 = 0.0;

        double lado1 = Math.sqrt(Math.pow((xp - this.coordenadaX), 2) + Math.pow((yp - this.coordenaY), 2));
        double lado2 = Math.sqrt(Math.pow((xp - this.coordenadaX), 2) + Math.pow((yp - y2), 2));
        double lado3 = Math.sqrt(Math.pow((this.coordenadaX - this.coordenadaX), 2) + Math.pow((this.coordenaY - y2), 2));
        double sp = (lado1 + lado2 + lado3) / 2;
        areaT1 = Math.sqrt(sp * ((sp - lado1) * (sp - lado2) * (sp - lado3)));

        lado1 = Math.sqrt(Math.pow((xp - x2), 2) + Math.pow((yp - y2), 2));
        lado2 = Math.sqrt(Math.pow((xp - x2), 2) + Math.pow((yp - this.coordenaY), 2));
        lado3 = Math.sqrt(Math.pow((x2 - x2), 2) + Math.pow((y2 - this.coordenaY), 2));
        sp = (lado1 + lado2 + lado3) / 2;
        areaT2 = Math.sqrt(sp * ((sp - lado1) * (sp - lado2) * (sp - lado3)));

        lado1 = Math.sqrt(Math.pow((xp - this.coordenadaX), 2) + Math.pow((yp - this.coordenaY), 2));
        lado2 = Math.sqrt(Math.pow((xp - x2), 2) + Math.pow((yp - this.coordenaY), 2));
        lado3 = Math.sqrt(Math.pow((this.coordenadaX - x2), 2) + Math.pow((this.coordenaY - this.coordenaY), 2));
        sp = (lado1 + lado2 + lado3) / 2;
        areaT3 = Math.sqrt(sp * ((sp - lado1) * (sp - lado2) * (sp - lado3)));

        lado1 = Math.sqrt(Math.pow((xp - this.coordenadaX), 2) + Math.pow((yp - this.coordenaY), 2));
        lado2 = Math.sqrt(Math.pow((xp - x2), 2) + Math.pow((yp - y2), 2));
        lado3 = Math.sqrt(Math.pow((this.coordenadaX - x2), 2) + Math.pow((y2 - y2), 2));
        sp = (lado1 + lado2 + lado3) / 2;
        areaT4 = Math.sqrt(sp * ((sp - lado1) * (sp - lado2) * (sp - lado3)));

        return ((areaT1 + areaT2 + areaT3 + areaT4) == this.area);
    }
}
