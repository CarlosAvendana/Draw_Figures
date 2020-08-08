package model;

public class Figure {

    protected int indentifier;
    protected double coordenadaX;
    protected double coordenaY;

    @Override
    public String toString() {
        return "Figure{" + "indentifier=" + indentifier
                + ", coordenadaX=" + coordenadaX
                + ", coordenaY=" + coordenaY + '}';
    }

}
