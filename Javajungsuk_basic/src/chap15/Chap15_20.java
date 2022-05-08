package chap15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Chap15_20 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Chap15_20.java");
			BufferedReader br = new BufferedReader(fr);//버퍼가 효율이 좋아지기때문에 사용해야한다.
			
			String line ="";
			for(int i=1; (line=br.readLine())!=null;i++) {
				if(line.indexOf(";")!=-1) //;를 포함한곳까지 출력
					System.out.println(i+" : "+line);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
