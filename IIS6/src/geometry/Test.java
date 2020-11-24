package geometry;

public class Test {

	public static void main(String[] args) {

		Point p = new Point();
		p.setX(10);
		p.setY(20);
		p.setSelected(true);

		System.out.println("X coordinate of point p is: " + p.getX() + '\n' + "Y coordinate of point p is: " + p.getY()
				+ '\n' + "Point p is selected: " + p.isSelected());

		double result = p.distance(50, 60);
		System.out.println("Distance between points is: " + result);

		Point p1 = new Point();
		p1.setX(15);
		p1.setY(27);
		p1.setSelected(true);

		// 1. Inicijalizovati x koordinatu tacke p
		// na vrednost y koordinate tacke p1
		
		p.setX(p1.getY());
		System.out.println("X of p = " + p.getX());

		// 2. Postaviti za pocetnu tacku linije l1 tacku p, a
		// za krajnju tacku linije l1 tacku p1
		
		Line l1 = new Line();
		l1.setStartPoint(p);
		l1.setEndPoint(p1);

		// 3. Postaviti y koordinatu krajnje tacke l1 na 23
		
		l1.getEndPoint().setY(23);
		System.out.println("Y of end point of l1 = " + l1.getEndPoint().getY());

		// 4. Inicijalizovati x koordinatu pocetne tacke linije l1
		// na vrednost y koordinate krajnje tacke linije l1
		
		l1.getStartPoint().setX(l1.getEndPoint().getY());
		System.out.println("X of start point of l1 = " + l1.getStartPoint().getX());

		// 5. Postaviti x koordinatu krajnje tacke l1 na vrednost
		// duzine linije l1 umanjene za vrednost zbira x i y
		// koordinate pocetne tacke linije l1
		
		l1.getEndPoint().setX((int) (l1.length() - (l1.getStartPoint().getX() + l1.getStartPoint().getY())));
		System.out.println("X of end point of l1 = " + l1.getEndPoint().getX());

		// 6. Postaviti x koordinatu tacke gore levo pravougaonika
		// r1 na vrednost 10 i y koordinatu na vrednost 15
		
		Rectangle r1 = new Rectangle();
		r1.setUpperLeftPoint(p);
		r1.getUpperLeftPoint().setX(10);
		r1.getUpperLeftPoint().setY(15);

		// 7. Postaviti centar kruga c1 na koordinate tacke
		// gore levo od r1
		
		Circle c1 = new Circle();
		c1.setRadius(20);
		c1.setCenter(r1.getUpperLeftPoint());

		// 8. Postaviti x koordinatu centra kruga c1 na vrednost razlike
		// povrsine pravougaonika r1 i y koordinate pocetne tacke linije l1
		
		r1.setHeight(20);
		r1.setWidth(30);
		c1.getCenter().setX(r1.area() - l1.getStartPoint().getY());
		System.out.println(c1.getCenter().getX());
		
		// testiranje konstruktora - vezbe 4
		Point p2 = new Point(10, 30);
		Point p3 = new Point(50, 40, true);
		Line l2 = new Line(new Point(10, 20), new Point(40, 50));
		Rectangle r2 = new Rectangle(p2, 40, 80);
		Rectangle r3 = new Rectangle(p2, 40, 80);
		
		// toString()
		System.out.println(p2.toString());
		System.out.println(p3);
		System.out.println(c1);
		System.out.println(r1);
		System.out.println(l2);
		
		// == i equals
		String s1 = new String("Hello World");
		String s2 = new String("Hello World");
		System.out.println(s1 == s2); // poredjenje po referenci u slucaju slozenih tipova
		System.out.println(s1.equals(s2)); // poredjenje po vrednosti u slucaju slozenih tipova
		
		int a = 1;
		int b = 1;
		System.out.println(a == b); // poredjenje po vrednosti u slucaju primitivnih tipova (x, y, width, height, radius, itd.)
		
		System.out.println(r1.equals(r2)); // false jer nemaju iste vrednosti obelezja
		System.out.println(r3.equals(r2)); // true jer imaju iste vrednosti obelezja
		System.out.println(r3.equals(c1)); // false jer nisu istog tipa
		
		Donut d = new Donut();
		d.setCenter(p2);
		d.setRadius(20);
		d.setInnerRadius(10);
		
		System.out.println(d);
		
		// dinamicko povezivanje
		Circle c2 = new Donut(new Point(100, 200), 100, 50);
		
		System.out.println(d.area());
		System.out.println(d.equals(new Donut(new Point(50, 70), 60, 30)));
		System.out.println(d.contains(p3));

	}

}
