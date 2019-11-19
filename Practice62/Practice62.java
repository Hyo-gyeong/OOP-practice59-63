//컴퓨터학과 20190975 신효경
public class Practice62 {

	public static void main(String[] args) {

		MaterialBox box1 = new MaterialBox(2, 3, 4, "wood");
		MaterialBox box2 = new MaterialBox(10, 5, 5, "paper");
		
		int volume1 = box1.getX() * box1.getY() * box1.getZ();
		double weight1 = volume1 * 1.1;
		
		System.out.println("box1의 정보입니다.");
		System.out.println("가로: "+box1.getX()+", 세로: "+box1.getY()+", 높이: "+box1.getZ()
							+"\n재질: "+box1.getAttribute()+"\n부피: "+volume1+"\n무게: "+weight1);
		
		System.out.println();
				
		int volume2 = box2.getX() * box2.getY() * box2.getZ();
		double weight2 = volume2 * 1.1;
		
		System.out.println("box2의 정보입니다.");
		System.out.println("가로: "+box2.getX()+", 세로: "+box2.getY()+", 높이: "+box2.getZ()
							+"\n재질: "+box2.getAttribute()+"\n부피: "+volume2+"\n무게: "+weight2);
	}

}
