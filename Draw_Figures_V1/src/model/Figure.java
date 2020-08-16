package model;

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

    public double calculaArea() {
        return area;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

}
