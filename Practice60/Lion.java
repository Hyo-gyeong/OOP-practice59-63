//컴퓨터학과 20190975 신효경
public class Lion extends Animal  {
	private int legs = 4;
	
	void roar()  { 
		System.out.println(": roar()가 호출되었음"); 
	}
	void roar2() {
		roar();
	}
	public String toString() {
		return "몸무게: "+getWeight()+"kg – 그림 설명: "+picture+"– 다리 : "+legs+"개";
	}
}
