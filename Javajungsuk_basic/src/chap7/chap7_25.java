package chap7;


interface Parseable{
	public abstract void parse(String fileName); //�����۾��� �����Ѵ�.
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

class XMLparser implements Parseable{//xml�� ��ȯ�Ǵ� Ŭ����

	public void parse(String fileName) {
		System.out.println(fileName +  " - XML parsing completed");
	}
}

class HTMLparser implements Parseable{ //Html�� ��ȯ�Ǵ� 
	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing completed");
	}
}

public class chap7_25 {
	public static void main(String[] args) {
		Parseable p = ParserManager.getParser("XML"); // ParserManager�� getParser�� ��ȯ Ÿ���� �������̽��� �����ϴ� Ŭ����!
						// new XMLparser�� �����ǹ��̴�.
		p.parse("document.xml");
		p = ParserManager.getParser("HTML");
		p.parse("document.Html");
	
		
		
		
	}

}