package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public Drawing() {
		setBackground(Color.WHITE);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Drawing");
		frame.setSize(800, 600);
		Drawing drawing = new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g) {
		
		Point p = new Point(50, 60, false, Color.RED);
		p.draw(g);
		
		Line l = new Line(new Point(300, 250), new Point(340, 210), true, Color.MAGENTA);
		l.draw(g);
		
		Circle c = new Circle(new Point(450, 120), 40, true, Color.BLACK, Color.RED);
		c.draw(g);
		
		Rectangle r = new Rectangle(new Point(300, 300), 120, 170, true, Color.RED, Color.YELLOW);
		r.draw(g);
		
		Donut d = new Donut(new Point(520, 400), 50, 30, false, Color.RED, Color.GREEN);
		d.draw(g);
		
		
	}
	
}
