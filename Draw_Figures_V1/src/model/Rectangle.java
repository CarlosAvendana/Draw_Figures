package model;

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
        return "rectangle " + " con coordenadas (x,y) " + " (" + this.coordenadaX + "," + this.coordenaY + ") " + "y base= " + base + ", y altura= " + altura + ".";

    }

    @Override
    public double calculaArea() {
        return super.calculaArea(); //To change body of generated methods, choose Tools | Templates.
    }
}
