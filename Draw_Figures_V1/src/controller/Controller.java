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

/**
 *
 * @author ESCINF
 */
public class Controller {

    public static void dibujarFigura(Graphics pg, String c) {
        String[] arr = c.split(" ");
        Graphics2D g = (Graphics2D) pg;
        double x, y, l, r, b, h, x2, y2, x3, y3, rme, rma, d;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        switch (arr[0]) {
            case "circle":
                x = Double.parseDouble(arr[1]) - Double.parseDouble(arr[3]);
                y = Double.parseDouble(arr[2]) + Double.parseDouble(arr[3]);
                r = Double.parseDouble(arr[2]) * 2;
                g.draw(new Ellipse2D.Double(x, y, r, r));
                break;
            case "square":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                l = Double.parseDouble(arr[3]);
                g.draw(new Rectangle2D.Double(x, y, l, l));
                break;
            case "rectangle":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                b = Double.parseDouble(arr[3]);
                h = Double.parseDouble(arr[4]);
                g.draw(new Rectangle2D.Double(x, y, b, h));
                break;
            case "triangle":
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                x2 = Double.parseDouble(arr[3]);
                y2 = Double.parseDouble(arr[4]);
                x3 = Double.parseDouble(arr[5]);
                y3 = Double.parseDouble(arr[6]);
                g.draw(new Line2D.Double(x,y,x2,y2));
                g.draw(new Line2D.Double(x,y,x3,y3));
                g.draw(new Line2D.Double(x2,y2,x3,y3));
                break;
            case "donut":
                rme = Double.parseDouble(arr[3]);
                rma = Double.parseDouble(arr[4]);
                x = Double.parseDouble(arr[1]);
                y = Double.parseDouble(arr[2]);
                x2 = x - rme;
                y2 = y + rme;
                x3 = x - rma;
                y3 = y + rma;
                d = 2*rma;
                g.draw(new Ellipse2D.Double(x2,y2,2*rme,2*rme));
                g.draw(new Ellipse2D.Double(x3,y3,d,d));
                break;
            case "ellipse":
                
                break;
        }
    }
}
