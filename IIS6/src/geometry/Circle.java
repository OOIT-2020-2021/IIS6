package geometry;

import java.awt.Graphics;
import java.awt.Color;

public class Circle extends SurfaceShape {

	private Point center;
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		setSelected(selected);
	}
	
	public Circle(Point center, int radius, boolean selected, Color color) {
		this(center, radius, selected);
		setColor(color);
	}
	
	public Circle(Point center, int radius, boolean selected, Color color, Color innerColor) {
		this(center, radius, selected, color);
		setInnerColor(innerColor);
	}
	
	@Override
	public void fill(Graphics g) {
		g.setColor(getInnerColor());
		g.fillOval(this.center.getX() - this.radius + 1, this.center.getY() - this.radius + 1, this.radius*2 - 2, this.radius*2 - 2);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawOval(this.center.getX() - this.radius, this.center.getY() - this.radius, this.radius * 2, this.radius * 2);
		this.fill(g);
	}
	
	public double area() {
		return radius * radius * Math.PI;
	}
	
	public boolean contains(int x, int y) {
		return this.center.distance(x, y) <= this.radius;
	}
	
	public boolean contains(Point p) {
		return this.center.distance(p.getX(), p.getY()) <= this.radius;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle pomocni = (Circle) obj;
			if (this.center.equals(pomocni.getCenter()) &&
					this.radius == pomocni.getRadius()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Center=" + center + ", radius=" + radius;
	}

}
