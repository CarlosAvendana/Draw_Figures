package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFile {

    private ArrayList<Figure> listaFiguras;
    private String path;
    private String allData;
    private String[] separados;
    private int contadorFiguras;

    public ReadFile(String path) {
        listaFiguras = new ArrayList<Figure>();
        this.path = path;
        allData = this.allData();
        this.separa();
        this.analizaDatos();
    }

    public ArrayList<Figure> getListaFiguras() {
        return listaFiguras;
    }

    public String allData() {

        try (Scanner scanner = new Scanner(new File(this.path));) {
            scanner.useDelimiter("\\A");
            this.allData = scanner.next();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.allData;
    }

    public void analizaDatos() {

        double x, y, l, r, b, h, x2, y2, x3, y3, rme, rma, width, height;
        for (int i = 0; i < this.separados.length; i++) {
            if ("circle".equals(separados[i])) {
                x = Double.parseDouble(separados[i + 1]);
                y = Double.parseDouble(separados[i + 2]);
                r = Double.parseDouble(separados[i + 3]);
                this.insertCirle(r, x, y);
            }
            if ("donut".equals(separados[i])) {
                rme = Double.parseDouble(separados[i + 3]);
                rma = Double.parseDouble(separados[i + 4]);
                x = Double.parseDouble(separados[i + 1]);
                y = Double.parseDouble(separados[i + 2]);
                this.insertDonut(rme, rma, x, y);
            }
            if ("ellipse".equals(separados[i])) {
                x = Double.parseDouble(separados[i + 1]);
                y = Double.parseDouble(separados[i + 2]);
                width = Double.parseDouble(separados[i + 3]);
                height = Double.parseDouble(separados[i + 4]);
                this.insertEllipse(width, height, x, y);
            }
            if ("rectangle".equals(separados[i])) {
                x = Double.parseDouble(separados[i + 1]);
                y = Double.parseDouble(separados[i + 2]);
                b = Double.parseDouble(separados[i + 3]);
                h = Double.parseDouble(separados[i + 4]);
                this.insertRectangle(b, h, x, y);
            }
            if ("square".equals(separados[i])) {
                x = Double.parseDouble(separados[i + 1]);
                y = Double.parseDouble(separados[i + 2]);
                l = Double.parseDouble(separados[i + 3]);
                this.insertSquare(l, x, y);
            }
            if ("triangle".equals(separados[i])) {
                x = Double.parseDouble(separados[i + 1]);
                y = Double.parseDouble(separados[i + 2]);
                x2 = Double.parseDouble(separados[i + 3]);
                y2 = Double.parseDouble(separados[i + 4]);
                x3 = Double.parseDouble(separados[i + 5]);
                y3 = Double.parseDouble(separados[i + 6]);
                this.insertTriangle(x, y, x2, y2, x3, y3);
            }
        }

    }

    public void separa() {
        String[] commands = this.allData.split("\\s+");
        separados = commands;
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
}
