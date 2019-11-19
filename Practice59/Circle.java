//컴퓨터학과 20190975 신효경
public class Circle extends Shape {
	int radius;
	
	public Circle(int radius) 
	{ 
		this.radius = radius; 
		x = 0;
		y = 0;
	}
	double calcArea() {
		return 3.14 * radius * radius; 
	}
	String draw() {
		return print()+" ::  반지름: "+radius+" :: 면적: "+calcArea()+" :: 둘레: "+(2*3.14*radius);
	}
}