package model;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class Model {

    double totalAreaFiguras;
    ArrayList<Figure> listaFiguras;
    Graphics2D g;
    
    public Model(){
        this.totalAreaFiguras = 0.0;
        this.listaFiguras = new ArrayList<>();
        this.g = null;
    }
    //g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    public void dibujarFigura(String command) {
        String[] arr = command.split(" ");
        double x, y, l, r, b, h, x2, y2, x3, y3, rme, rma, width, height;
        switch (arr[0]) {
            case "circle":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                r = Double.parseDouble(arr[3]);
                this.insertCirle(r, x, y);
                break;
            case "square":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                l = Double.parseDouble(arr[3]);
                this.insertSquare(l, x, y);
                break;
            case "rectangle":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                b = Double.parseDouble(arr[3]);
                h = Double.parseDouble(arr[4]);
                this.insertRectangle(b, h, x, y);
                break;
            case "triangle":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                x2 = Double.parseDouble(arr[3]);
                y2 = Double.parseDouble(arr[4]);
                x3 = Double.parseDouble(arr[5]);
                y3 = Double.parseDouble(arr[6]);
                this.insertTriangle(x,y,x2, y2,x3, y3);
                break;
            case "donut":
                rme = Double.parseDouble(arr[3]);
                rma = Double.parseDouble(arr[4]);
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                this.insertDonut(rme, rma, x, y);
                break;
            case "ellipse":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                width = Double.parseDouble(arr[3]);
                height = Double.parseDouble(arr[4]);
                this.insertEllipse(width, height, x, y);
                break;
        }
    }

    public void insertCirle(double r, double cx, double cy) {
        Circle c = new Circle(r, cx, cy);
        this.listaFiguras.add(c);
    }

    public void insertDonut(double radioMenor, double radioMayor, double cx, double cy) {
        Donut d = new Donut(radioMenor, radioMayor, cx, cy);
        this.listaFiguras.add(d);
    }

    public void insertEllipse(double radioMenor, double radioMayor, double cx, double cy) {
        Ellipse e = new Ellipse(radioMenor, radioMayor, cx, cy);
        this.listaFiguras.add(e);
    }

    public void insertRectangle(double base, double altura, double cx, double cy) {
        Rectangle r = new Rectangle(base, altura, cx, cy);
        this.listaFiguras.add(r);
    }

    public void insertTriangle(double vertice1, double vertice2, double vertice3, double vertice4, double vertice5, double vertice6) {
        Triangle t = new Triangle(vertice1, vertice2, vertice3, vertice4, vertice5, vertice6);
        this.listaFiguras.add(t);
    }

    public void insertSquare(double logintudLado, double cx, double cy) {
        Square s = new Square(logintudLado, cx, cy);
        this.listaFiguras.add(s);
    }

    public ArrayList<Figure> getFiguras() {
        return this.listaFiguras;
    }

}
