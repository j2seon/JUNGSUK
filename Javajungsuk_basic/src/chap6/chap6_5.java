package chap6;


class Cars{
	int door=5;
	Engine e = new Engine(); //참조형 초기화 new로 만들지않으면 null 값이 부여된다. 그냥 참조변수만 있는것.객체를 넣어주는 것이 초기화임!
}

class Engine{}


public class chap6_5 {
	//간단초기화 대입연산자이용
		static int arr[] = new int[10];
		
		//내가 arr에 난수로 수를 채워넣고싶어 //복잡초기화
		static {
			for (int i=0; i<arr.length ;i++) {
				arr[i]=(int)(Math.random()*10)+1;
			}
		}
		
	public static void main(String[] args) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		
		//지역변수는 수동초기화 해야한다. 메서드안의 변수가 빈번한게 생성되었다가 없어졌다하기때문에 지정을 안하면 효율이 떨어진다.
		//1. 자동초기화 0 
		//2. 간단초기화 =
		//3. 복잡초기화 {},static{}-cv, 생성자(보통생성자로)-iv 

	
		//클래스 변수(cv)는 클래스가 처음로딩될때 초기화 >먼저 일어남!!! 순서 : cv > iv / 자동 > 간단 > 복잡
		//인스턴스 변수(iv)는 인스턴스가 생성될때마다 초기화된다 Car car= new Car();
		
	}

}
