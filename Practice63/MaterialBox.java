//��ǻ���а� 20190975 ��ȿ��
public class MaterialBox extends Box{
	private String attribute;
	
	public void setAttribute(String material) { this.attribute = material; }
	public String getAttribute () { return attribute; }
	
	public MaterialBox (int x, int y, int z, String a) { //������(constructor��ȯ'Ÿ��' ����
		this.setX(x);
		this.setY(y);
		this.setZ(z);
		this.attribute = a;
	}
	
	public void printInfo() {
		System.out.println("����: "+getX()+", ����: "+getY()+", ����: "+getZ()
		+"\n����: "+getAttribute()+"\n����: "+getVolume()+"\n����: "+getWeight());
	}
}
