//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice59 {

	public static int compareArea(Circle c1, Circle c2) {
		if (c1.calcArea() > c2.calcArea())
			return 1;
		else if (c1.calcArea() < c2.calcArea())
			return -1;
		else
			return 0;
	}
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Shape info = new Shape();

		System.out.print("Shape ��ü ������ �Է��ϼ���.\n");
		System.out.print("x��ǥ : ");
		info.x = input.nextInt();
		System.out.print("y��ǥ : ");
		info.y = input.nextInt();
		
		System.out.print("\nù��° Circle ��ü ������ �Է��ϼ���.\n");
		System.out.print("x��ǥ : ");
		int x1 = input.nextInt();
		System.out.print("y��ǥ : ");
		int y1 = input.nextInt();
		System.out.print("������ : ");
		int r1 = input.nextInt();
		Circle c1 = new Circle(r1);
		c1.x = x1;
		c1.y = y1;
		
		System.out.print("\n�ι�° Circle ��ü ������ �Է��ϼ���.\n");
		System.out.print("x��ǥ : ");
		int x2 = input.nextInt();
		System.out.print("y��ǥ : ");
		int y2 = input.nextInt();
		System.out.print("������ : ");
		int r2 = input.nextInt();
		Circle c2 = new Circle(r2);
		c2.x = x2;
		c2.y = y2;
		
		System.out.println("\nShape ��ü �����Դϴ�.");
		System.out.println(info.print());
		System.out.println("ù��° Circle ��ü �����Դϴ�.");
		System.out.println(c1.draw());
		System.out.println("�ι�° Circle ��ü �����Դϴ�.");
		System.out.println(c2.draw());
		
		
		if (compareArea(c1, c2) == 1)
			System.out.print("\nù��° ���� ������ �� �н��ϴ�.");
		else if (compareArea(c1, c2) == -1)
			System.out.print("\n�ι�° ���� ������ �� �н��ϴ�.");
		else
			System.out.print("\n�� ���� ������ �����ϴ�.");
				
		input.close();
	}

}
