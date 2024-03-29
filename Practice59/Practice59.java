//컴퓨터학과 20190975 신효경
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

		System.out.print("Shape 객체 정보를 입력하세요.\n");
		System.out.print("x좌표 : ");
		info.x = input.nextInt();
		System.out.print("y좌표 : ");
		info.y = input.nextInt();
		
		System.out.print("\n첫번째 Circle 객체 정보를 입력하세요.\n");
		System.out.print("x좌표 : ");
		int x1 = input.nextInt();
		System.out.print("y좌표 : ");
		int y1 = input.nextInt();
		System.out.print("반지름 : ");
		int r1 = input.nextInt();
		Circle c1 = new Circle(r1);
		c1.x = x1;
		c1.y = y1;
		
		System.out.print("\n두번째 Circle 객체 정보를 입력하세요.\n");
		System.out.print("x좌표 : ");
		int x2 = input.nextInt();
		System.out.print("y좌표 : ");
		int y2 = input.nextInt();
		System.out.print("반지름 : ");
		int r2 = input.nextInt();
		Circle c2 = new Circle(r2);
		c2.x = x2;
		c2.y = y2;
		
		System.out.println("\nShape 객체 정보입니다.");
		System.out.println(info.print());
		System.out.println("첫번째 Circle 객체 정보입니다.");
		System.out.println(c1.draw());
		System.out.println("두번째 Circle 객체 정보입니다.");
		System.out.println(c2.draw());
		
		
		if (compareArea(c1, c2) == 1)
			System.out.print("\n첫번째 원의 면적이 더 넓습니다.");
		else if (compareArea(c1, c2) == -1)
			System.out.print("\n두번째 원의 면적이 더 넓습니다.");
		else
			System.out.print("\n두 원의 면적이 같습니다.");
				
		input.close();
	}

}
