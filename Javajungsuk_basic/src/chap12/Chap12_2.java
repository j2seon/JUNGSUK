package chap12;

import java.util.ArrayList;

interface Eatable1{}
class Fruit1 implements Eatable1{public String toString() {return "Fruit";}}
class Apple1 extends Fruit1 {public String toString() {return "Apple";}}
class Grape1 extends Fruit1 {public String toString() {return "Grape";}}
class toy1 {}
 
class Fruitbox1<T extends Fruit1> extends box1<T>{}

class box1<T>{
	ArrayList<T>list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}	
}

public class Chap12_2 {
	public static void main(String[] args) {
		Fruitbox1<Fruit1> fruitbox1 = new Fruitbox1();
		Fruitbox1<Apple1> applebox = new Fruitbox1();
		Fruitbox1<Grape1> Grapebox = new Fruitbox1();
		//Fruitbox1<Grape1> Grapebox = new Fruitbox1<Apple1>();타입불일치
		
		fruitbox1.add(new Fruit1());
		fruitbox1.add(new Apple1());
		fruitbox1.add(new Grape1());
		//applebox.add(new Grape1()); 에러
		applebox.add(new Apple1());
		Grapebox.add(new Grape1());
		
		System.out.println("fruitbox"+fruitbox1);
		System.out.println("applebox"+applebox);
		System.out.println("Grapebox"+Grapebox);
		
		
		
		
	}
}
