// A class which can make stars!

// NOTE - you should compile but NOT run this file
// There's no main function here!

import java.awt.*;
import java.awt.geom.*;

public class Star 
{
    // Variables in a class? WHOA - almost as if x, y, width, and height are ATTRIBUTES OF THE OBJECT!
    int x, y, width, height;

    // A constructor!
    public Star(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

     // What can a star do? It can draw itself - almost as if this was a BEHAVIOR OF THE OBJECT!
    public void draw(Graphics g) 
    {
        // It's hard to draw a star. These are the (x,y) coordinates of the star's vertices
        int xPoints[] = {9, 15, 0, 18, 3};
        int yPoints[] = {0, 18, 6, 6, 18};

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();

        // Connect the dots to make the star!
        star.moveTo(xPoints[0] + x, yPoints[0] + y);
        
        for (int i = 1; i < xPoints.length; i++) 
        {
            star.lineTo(xPoints[i] + x, yPoints[i] + y);
        }
        star.closePath();

        g2d.setColor(Color.YELLOW);
        g2d.fill(star);
    }
}