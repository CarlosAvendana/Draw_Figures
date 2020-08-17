package controller;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JTextArea;
import model.Figure;
import model.Model;

/**
 *
 * @author ESCINF
 */
public class Controller {

    private Model m;

    public Controller() {
        this.m = new Model();
    }

    public void setListaFiguras(ArrayList<Figure> listaFiguras) {
        m.setListaFiguras(listaFiguras);
    }
//
//    public void dibujarFigura(Graphics pg, String c) {
//        this.m.dibujarFigura(pg, c);
//    }

    public void dibujarFigura(Graphics graphics, String comando, JTextArea muestraMensajePantalla) {
        this.m.dibujarFigura(graphics, comando, muestraMensajePantalla);
    }
}
