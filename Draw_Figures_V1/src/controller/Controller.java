package controller;

import java.awt.Graphics;
import javax.swing.JTextArea;
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
//
//    public void dibujarFigura(Graphics pg, String c) {
//        this.m.dibujarFigura(pg, c);
//    }

    public void dibujarFigura(Graphics graphics, String comando, JTextArea muestraMensajePantalla) {
        this.m.dibujarFigura(graphics, comando, muestraMensajePantalla);
    }
}
