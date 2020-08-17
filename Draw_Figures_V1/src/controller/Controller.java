package controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import model.Figure;
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

    public ArrayList<Figure> getFiguras() {
        return this.m.getFiguras();
    }
    
    public void dibujarFigura(String comando, JTextArea muestraMensajePantalla) {
        this.m.dibujarFigura(comando, muestraMensajePantalla);
    }
}
