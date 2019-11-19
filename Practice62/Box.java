//��ǻ���а� 20190975 ��ȿ��
public class Box {
	private int x;
	private int y;
	private int z;
	private boolean empty;
	
	public void fillBox() {empty = false;}
	public void emptyBox() {empty = true;}
	
	public void setX(int x) {this.x = x;}
	public int getX() {	return x;}
	
	public void setY(int y) {this.y = y;}
	public int getY() {	return y;}
	
	public void setZ(int z) {this.z = z;}
	public int getZ() {	return z;}
	
	public Box() {
		this(0, 0, 0);
		emptyBox();
	}
	 public Box(int x, int y, int z) {
		 this.x = x;
		 this.y = y;
		 this.z = z;
		 emptyBox();
	 }
	 
	public String toString() {
		
		if (empty == true) {
			return "����: "+getX()+"cm\n����: "+getY()+"cm\n����: "+getZ()+"cm\n"
					+ "���� �ڽ��� ��� �ֽ��ϴ�.";
		}
		else {
			return "����: "+getX()+"cm\n����: "+getY()+"cm\n����: "+getZ()+"cm\n"
					+ "���� �ڽ����� ������ ��� �ֽ��ϴ�.";
		}
	}
}
