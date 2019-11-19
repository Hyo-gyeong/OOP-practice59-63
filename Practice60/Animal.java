//컴퓨터학과 20190975 신효경
public class Animal  { 
	
	private double weight; 
	String picture; 
	
	private String printMsg()  { return ("eat()가 호출되었음"); } 
	
	void eat()  {
		String msg = printMsg(); 
		System.out.print(msg); 
	} 
	
	void sleep()  { 
		System.out.print("sleep()가 호출되었음");
	}
	
	public void setWeight(double w) { this.weight = w; }
	public double getWeight() { return weight; }
	
	public String toString() {
		return "몸무게: "+weight+"kg – 그림 설명: "+picture;
	}
} 