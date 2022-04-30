package chap6;


class Product{
	static int count = 0; //생성된 인스턴스 수를 저장
	int num; //고유 번호 부여
	//왜 count가 static 인가? >>> 인스턴스 변수로 선언될 경우 생성자 호출마다 값이 count는 0으로 초기화된다 
	//따라서 개수를 샐수 없이 계속 1 이 나오게 된다. static은 인스턴스는 static을 쓸수 있기 때문에 
	//해당 인스턴스가 호출될 때마다 실행되는 초기화 블럭에 static의 값을 증가시킴으로써 count의 값이 증가할 수 있게 된다.
	
	
	{// 인스턴스 초기화!! 실행될때마다 count 를 하나씩 늘려주고 그걸 num에 대입
		++count;
		num=count;
	}

	public Product() {} //생략가능
	
}
public class chap6_29 {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("제품번호 : "+p1.num);
		System.out.println("제품번호 : "+p2.num);
		System.out.println("제품번호 : "+p3.num);
		System.out.println("총상품의 개수 : "+Product.count+"개입니다");
		
		
	}

}
