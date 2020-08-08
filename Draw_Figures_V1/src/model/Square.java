package model;

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
        return "Square{" + "logintudLado=" + logintudLado + '}';
    }

}
