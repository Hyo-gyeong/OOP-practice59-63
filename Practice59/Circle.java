//��ǻ���а� 20190975 ��ȿ��
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
		return print()+" ::  ������: "+radius+" :: ����: "+calcArea()+" :: �ѷ�: "+(2*3.14*radius);
	}
}