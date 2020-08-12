/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import model.Model;

/**
 *
 * @author ESCINF
 */
public class Controller {
    
    private Model m;
    public Controller(){
        this.m = new Model();
    }

    public void dibujarFigura(Graphics pg, String c) {
        this.m.dibujarFigura(pg,c);
    }
}
