//컴퓨터학과 20190975 신효경
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
			return "가로: "+getX()+"cm\n세로: "+getY()+"cm\n높이: "+getZ()+"cm\n"
					+ "지금 박스는 비어 있습니다.";
		}
		else {
			return "가로: "+getX()+"cm\n세로: "+getY()+"cm\n높이: "+getZ()+"cm\n"
					+ "지금 박스에는 물건이 들어 있습니다.";
		}
	}
}
