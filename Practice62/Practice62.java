//��ǻ���а� 20190975 ��ȿ��
public class Practice62 {

	public static void main(String[] args) {

		MaterialBox box1 = new MaterialBox(2, 3, 4, "wood");
		MaterialBox box2 = new MaterialBox(10, 5, 5, "paper");
		
		int volume1 = box1.getX() * box1.getY() * box1.getZ();
		double weight1 = volume1 * 1.1;
		
		System.out.println("box1�� �����Դϴ�.");
		System.out.println("����: "+box1.getX()+", ����: "+box1.getY()+", ����: "+box1.getZ()
							+"\n����: "+box1.getAttribute()+"\n����: "+volume1+"\n����: "+weight1);
		
		System.out.println();
				
		int volume2 = box2.getX() * box2.getY() * box2.getZ();
		double weight2 = volume2 * 1.1;
		
		System.out.println("box2�� �����Դϴ�.");
		System.out.println("����: "+box2.getX()+", ����: "+box2.getY()+", ����: "+box2.getZ()
							+"\n����: "+box2.getAttribute()+"\n����: "+volume2+"\n����: "+weight2);
	}

}
