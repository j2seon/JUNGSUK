package chap11;

import java.util.HashSet;
import java.util.Objects;

public class Chap11_24 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(new String ("abc"));
		set.add(new String ("abc"));
		set.add(new person("dd", 12));
		set.add(new person("ss", 22));
		set.add(new person("dd", 12));
		
		System.out.println(set);
		
	}
}
class person{
	String name;
	int age;

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof person) {
			person p = (person)obj;
			return name.equals(p.name) && age==p.age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,age); 
	}

	@Override
	public String toString() {
		return name +":"+age;
	}
	
	
	
	
	
}