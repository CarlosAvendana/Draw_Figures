package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFile {

    private ArrayList<Figure> figureList;
    private String path;
    private String allData;
    private int contadorFiguras;

    public ReadFile(String path) {
        this.path = path;
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

    public void separa() {
        String[] commands = this.allData.split("\\s+");
        for (int i = 0; i < commands.length; i++) {

        }
    }

    public void insertCirle(String r, String cx, String cy) {
        Circle c = new Circle(Double.parseDouble(r), Double.parseDouble(cx), Double.parseDouble(cy));
        this.figureList.add(c);
        this.contadorFiguras++;
    }

    public void insertDonut(String radioMenor, String radioMayor, String cx, String cy) {
        Donut d = new Donut(Double.parseDouble(radioMenor), Double.parseDouble(radioMayor),
                Double.parseDouble(cx),
                Double.parseDouble(cy)
        );
        this.figureList.add(d);
        this.contadorFiguras++;
    }

    public void insertEllipse(String radioMenor, String radioMayor, String cx, String cy) {
        Ellipse e = new Ellipse(Double.parseDouble(radioMenor), Double.parseDouble(radioMayor), Double.parseDouble(cx), Double.parseDouble(cy));
        this.figureList.add(e);
        this.contadorFiguras++;
    }

    public void insertRectangle(String base, String altura, String cx, String cy) {
        Rectangle r = new Rectangle(Double.parseDouble(base), Double.parseDouble(altura), Double.parseDouble(cx), Double.parseDouble(cy));
        this.figureList.add(r);
        this.contadorFiguras++;
    }

    public void insertTriangle(String vertice1, String vertice2, String vertice3, String cx, String cy) {
        Triangle t = new Triangle(Double.parseDouble(vertice1), Double.parseDouble(vertice2), Double.parseDouble(vertice3), Double.parseDouble(cx), Double.parseDouble(cy));
        this.figureList.add(t);
        this.contadorFiguras++;
    }

    public void insertSquare(String logintudLado, String cx, String cy) {
        Square s = new Square(Double.parseDouble(logintudLado), Double.parseDouble(cx), Double.parseDouble(cy));
        this.figureList.add(s);
        this.contadorFiguras++;
    }

}
