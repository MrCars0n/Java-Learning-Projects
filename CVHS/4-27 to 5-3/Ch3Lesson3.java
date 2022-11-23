// Mr. Ensminger
// Week of April 27th - May 3rd
// Chapter 3 - Lesson 3

// This file must be in the same directory as circle.java and star.java
// You should have them all open at the same time, compile all three, but RUN THIS ONE ONLY

// Let's have *more* fun with swing... and graphics!

// Once again, this is for "entertainment purposes" only
// You won't need to know this stuff for future programs
// I just thought you all could use a "fun" interlude before we move on to other stuff next week

// Just look over this code, see what it looks like, try to understand how it works, and enjoy!

import java.awt.*;       // awt, again - used for graphics!
import java.util.*;      // used for lists - remember them from Python?
import javax.swing.*;    // used for all the GUI stuff, like labels and buttons, anything beginning with "J"

public class Ch3Lesson3 extends JPanel 
{
    // A list of objects, huh? Neat!
    private ArrayList<Object> shapes = new ArrayList<>();
    private Random random = new Random();

    public Ch3Lesson3(int i, String shape) 
    {
        // In Java, constants are in all caps, so BLACK is a constant in the Color class
        // Feel free to try some others!
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(400, 400));

        // A wild switch-case appears!
        switch (shape) 
        {
            case "Circles":
                for (int j = 0; j < i; j++) 
                {
                    addCircle(390, 390);
                }
                break;
            case "Stars":
                for (int j = 0; j < i; j++) 
                {
                    addStar(380, 380);
                }
                break;
            case "Both":
                int mid = i / 2;
                for (int j = 0; j < mid; j++) 
                {
                    addCircle(390, 390);
                }
                for (int j = mid; j < i; j++) 
                {
                    addStar(380, 380);
                }
                break;
        }
    }

    // This function "paints" your shapes onto the form - it *must* be called paintComponent
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        for (Object s : shapes) 
        {
            if (s instanceof Circle) 
            {
                ((Circle) s).draw(g);
            } 
            else if (s instanceof Star) 
            {
                ((Star) s).draw(g);
            }
        }
    }

    public void addCircle(int maxX, int maxY) 
    {
        shapes.add(new Circle(random.nextInt(maxX), random.nextInt(maxY)));
        repaint();
    }

    public void addStar(int maxX, int maxY) 
    {
        shapes.add(new Star(random.nextInt(maxX), random.nextInt(maxY)));
        repaint();
    }

    // And the main function is all the way down here!
    public static void main(String[] args) 
    {

        String shapeAmount = JOptionPane.showInputDialog(null,
                "How many shapes?", "Random Shapes...", JOptionPane.PLAIN_MESSAGE);
        
        int amount = Integer.parseInt(shapeAmount);

        String shapes[] = {"Stars", "Circles", "Both"};
        String shape = (String) JOptionPane.showInputDialog(null,
                "Pick the shape you want", "Random Shapes...",
                JOptionPane.PLAIN_MESSAGE, null, shapes, shapes[0]);

        JFrame frame = new JFrame();
        frame.add(new Ch3Lesson3(amount, shape));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}