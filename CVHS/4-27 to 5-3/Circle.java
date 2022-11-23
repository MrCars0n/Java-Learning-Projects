// A class which can make circles!

// NOTE - you should compile but NOT run this file
// There's no main function here!

import java.awt.*;
import java.awt.geom.*;

public class Circle 
{
    // Variables in a class? WHOA - almost as if x, y, width, and height are ATTRIBUTES OF THE OBJECT!
    int x, y, width, height;

    // A constructor!
    public Circle(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    // What can a circle do? It can draw itself - almost as if this was a BEHAVIOR OF THE OBJECT!
    public void draw(Graphics g) 
    {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 10, 10);

        g2d.setColor(Color.GRAY);
        g2d.fill(circle);
    }
}