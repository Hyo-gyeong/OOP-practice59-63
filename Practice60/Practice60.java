//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice60 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Animal 객체 animal을 생성합니다.");
		Animal animal = new Animal();
		System.out.print("사진에 추가할 문장을 입력하세요: ");
		animal.picture = input.next();
		System.out.print("몸무게를 입력하세요: ");
		animal.setWeight(input.nextDouble());
		animal.eat();
		System.out.println();
		
		System.out.println("\nLion 객체 buba를 생성합니다.");
		Lion buba = new Lion();
		System.out.print("사진에 추가할 문장을 입력하세요: ");
		buba.picture = input.next();
		System.out.print("몸무게를 입력하세요: ");
		buba.setWeight(input.nextDouble());
		animal.eat();
		buba.roar2();
		
		System.out.println("\nEagle 객체 paco를 생성합니다.");
		Eagle paco = new Eagle();
		System.out.print("사진에 추가할 문장을 입력하세요: ");
		paco.picture = input.next();
		System.out.print("몸무게를 입력하세요: ");
		paco.setWeight(input.nextDouble());
		animal.sleep();
		paco.fly2();
		
		
		System.out.println("\nAnimal 객체 animal의 정보입니다.");
		System.out.println(animal.toString());
		System.out.println("Lion 객체 buba의 정보입니다.");
		System.out.println(buba.toString());
		System.out.println("Eagle 객체 paco의 정보입니다.");
		System.out.println(paco.toString());
		
		input.close();
	}

}
