//컴퓨터학과 20190975 신효경
 public class Eagle extends Animal  {
	 
	 private int wings = 2;
	 
	 void fly()  {
		 System.out.println(": fly()가 호출되었음"); 
	 }
	 void fly2() {
		 fly();
	 }
	 public String toString() {
			return "몸무게: "+getWeight()+"kg – 그림 설명: "+picture+"– 날개 : "+wings+"개";
	}
 }