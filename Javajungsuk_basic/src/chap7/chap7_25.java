package chap7;


interface Parseable{
	public abstract void parse(String fileName); //구문작업을 수행한다.
}

class ParserManager{
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLparser();
		}else {
			Parseable p = new HTMLparser();
			return p;
		}
	}
} 

class XMLparser implements Parseable{//xml로 변환되는 클래스

	public void parse(String fileName) {
		System.out.println(fileName +  " - XML parsing completed");
	}
}

class HTMLparser implements Parseable{ //Html로 변환되는 
	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing completed");
	}
}

public class Chap7_25 {
	public static void main(String[] args) {
		Parseable p = ParserManager.getParser("XML"); // ParserManager의 getParser의 반환 타입이 인터페이스룰 구현하는 클래스!
						// new XMLparser과 같은의미이다.
		p.parse("document.xml");
		p = ParserManager.getParser("HTML");
		p.parse("document.Html");
	
		
		
		
	}

}
