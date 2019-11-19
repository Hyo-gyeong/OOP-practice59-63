//컴퓨터학과 20190975 신효경
public class Practice63 {

	public static void main(String[] args) {

		MaterialBox box1 = new MaterialBox(2, 3, 4, "wood");
		MaterialBox box2 = new MaterialBox(10, 5, 5, "paper");
		
		System.out.println("box1의 정보입니다.");
		box1.printInfo();
		
		System.out.println();
		
		System.out.println("box2의 정보입니다.");
		box2.printInfo();
	
	}

}
