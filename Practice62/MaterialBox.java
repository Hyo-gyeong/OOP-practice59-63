//컴퓨터학과 20190975 신효경
public class MaterialBox extends Box{
	private String attribute;
	
	public void setAttribute(String material) { this.attribute = material; }
	public String getAttribute () { return attribute; }
	
	public MaterialBox (int x, int y, int z, String a) { //생성자(constructor반환'타입' 없음
		this.setX(x);
		this.setY(y);
		this.setZ(z);
		this.attribute = a;
	}
}
