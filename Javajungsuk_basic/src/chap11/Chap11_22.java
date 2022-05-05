package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Chap11_22 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		int [][] p = new int [5][5];
		
		for(int i=0; set.size()<25; i++) {
			set.add((int)(Math.random()*50)+1+"");
		}
		
		Iterator it = set.iterator();
		
		for(int i=0; i<p.length;i++) {
			for(int j=0; j<p[i].length;j++) {
				p[i][j]=Integer.parseInt((String)it.next());  
				System.out.print((p[i][j]<10? "  ":" ")+p[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
