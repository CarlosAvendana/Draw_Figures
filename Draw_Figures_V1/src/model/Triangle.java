package model;

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
        return "Triangle{" + "vertice1= (" + vertice1 + ", " + vertice2 + "), vertice2= (" + vertice3 + ", " + vertice4 + "), vertice3= (" + coordenadaX + ", " + coordenaY + ")}";
    }

    @Override
    public double calculaArea() {
        return super.calculaArea();
    }
}
