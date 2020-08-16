package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JTextArea;

public class Model {

    double totalAreaFiguras;
    ArrayList<Figure> listaFiguras;
    Graphics2D g;

    public Model() {
        this.totalAreaFiguras = 0.0;
        this.listaFiguras = new ArrayList<>();
        this.g = null;
    }
    //g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    public void dibujarFigura(Graphics pg, String command, JTextArea areaMensajes) {
        String[] arr = command.split(" ");
        Graphics2D g = (Graphics2D) pg;
        double x, y, l, r, b, h, x2, y2, x3, y3, rme, rma, width, height;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        switch (arr[0]) {
            case "circle":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                r = Double.parseDouble(arr[2]);
                g.draw(new Ellipse2D.Double(x - r / 2, y - r / 2, r, r));
                this.insertCirle(r, x, y);
                areaMensajes.setText("Figura" + this.listaFiguras.size() + "Circulo con area");
                break;
            case "square":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                l = Double.parseDouble(arr[3]);
                g.draw(new Rectangle2D.Double(x, y, l, l));
                this.insertSquare(l, x, y);
                break;
            case "rectangle":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                b = Double.parseDouble(arr[3]);
                h = Double.parseDouble(arr[4]);
                g.draw(new Rectangle2D.Double(x, y, b, h));
                this.insertRectangle(b, h, x, y);
                break;
            case "triangle":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                x2 = Double.parseDouble(arr[3]);
                y2 = Double.parseDouble(arr[4]);
                x3 = Double.parseDouble(arr[5]);
                y3 = Double.parseDouble(arr[6]);
                g.draw(new Line2D.Double(x, y, x2, y2));
                g.draw(new Line2D.Double(x, y, x3, y3));
                g.draw(new Line2D.Double(x2, y2, x3, y3));
                this.insertTriangle(x, y, x2, y2, x3, y3);
                break;
            case "donut":
                rme = Double.parseDouble(arr[3]);
                rma = Double.parseDouble(arr[4]);
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                g.draw(new Ellipse2D.Double(x - rme / 2, y - rme / 2, rme, rme));
                g.draw(new Ellipse2D.Double(x - rma / 2, y - rma / 2, rma, rma));
                this.insertDonut(rme, rma, x, y);
                break;
            case "ellipse":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                width = Double.parseDouble(arr[3]);
                height = Double.parseDouble(arr[4]);
                g.draw(new Ellipse2D.Double(x, y, width, height));
                this.insertEllipse(width, height, x, y);
                break;
            case "list\r\n":
                this.listarFiguras(areaMensajes);

                break;
            default:
                System.out.println("Error");
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

    public void listarFiguras(JTextArea area) {
        String f = "";

        if (this.listaFiguras.size() == 0) {
            area.setText("No hay figuras");
        } else {
            for (int i = 0; i < this.listaFiguras.size(); i++) {
                if (this.listaFiguras.get(i).getClass().getSimpleName().equals("Circle")) {
                    f += "Figura #" + i + " " + this.listaFiguras.get(i).getClass().getSimpleName() + " con coordenadas x,y" + "(" + this.listaFiguras.get(i).coordenadaX + "," + this.listaFiguras.get(i).coordenaY + ")" + "\n";
                }
                if (this.listaFiguras.get(i).getClass().getSimpleName().equals("Ellipse")) {
                    f += "Figura #" + i + " " + this.listaFiguras.get(i).getClass().getSimpleName() + " con coordenadas x,y" + "(" + this.listaFiguras.get(i).coordenadaX + "," + this.listaFiguras.get(i).coordenaY + ")" + "\n";
                }
                if (this.listaFiguras.get(i).getClass().getSimpleName().equals("Rectangle")) {
                    f += "Figura #" + i + " " + this.listaFiguras.get(i).getClass().getSimpleName() + " con coordenadas x,y" + "(" + this.listaFiguras.get(i).coordenadaX + "," + this.listaFiguras.get(i).coordenaY + ")" + "\n";
                }
                if (this.listaFiguras.get(i).getClass().getSimpleName().equals("Square")) {
                    f += "Figura #" + i + " " + this.listaFiguras.get(i).getClass().getSimpleName() + " con coordenadas x,y" + "(" + this.listaFiguras.get(i).coordenadaX + "," + this.listaFiguras.get(i).coordenaY + ")" + "\n";
                }
                if (this.listaFiguras.get(i).getClass().getSimpleName().equals("Triangle")) {
                    f += "Figura #" + i + " " + this.listaFiguras.get(i).getClass().getSimpleName() + " con coordenadas x,y" + "(" + this.listaFiguras.get(i).coordenadaX + "," + this.listaFiguras.get(i).coordenaY + ")" + "\n";
                }
                if (this.listaFiguras.get(i).getClass().getSimpleName().equals("Donut")) {
                    f += "Figura #" + i + " " + this.listaFiguras.get(i).getClass().getSimpleName() + " con coordenadas x,y" + "(" + this.listaFiguras.get(i).coordenadaX + "," + this.listaFiguras.get(i).coordenaY + ")" + "\n";
                }

            }//cierre del for 
            f += "Figuras en total:" + this.listaFiguras.size() + "\n";
            area.setText(f);
        }

    }

}
