/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circles.java;
import java.applet.*;
import javax.swing.*;
import java.awt.*;



/**
 *
 * @author Jay-Cee
 * This applet uses a recursive method to
 * draw concentric circles.
 */
public class Circles extends JApplet {

    /**
     *init method
     * 
     * 
     */
    
    public void init()
    {
        getContentPane().setBackground(Color.white);
        setLayout(new FlowLayout());
        
        // add label
    }
    
    /**
     * Paint method
     * @param g The applet's Graphics object.
     * @param args 
     */
    
    public void paint(Graphics g)
    {
        // Draw 10 concentric circles. The outermost
        // Cicles's enclosing rectangle should be at
        // (5,5) , and it should be 300 pizels wide
        // by 300 pixels high.
        drawCircles(g, 10 , 5, 300);
    }
    
    /*
    The drawCircles method draws concentric circles.
    @param g A Graphics object.
    @param n The number of circles to draw.
    @param topXY The top left coordinates of the
            outermost circle's enclosing rectangle.
    @size The width and height of the outermost circles enclosing rectangle.
    */
    
    private void drawCircles(Graphics g, int n, int topXY, int size)
    {
        if (n>0)
        {
            g.drawOval(topXY, topXY, size, size);
            drawCircles(g,n-1,topXY + 15, size - 30);
        }
    }
   
    
}
