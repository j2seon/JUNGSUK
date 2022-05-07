package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit3{
	String name;
	int weight;
	public Fruit3(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	public String toString() {
		return name+"("+weight+")";
	}
}


class Apple3 extends Fruit3{
	public Apple3(String name, int weight) {
		super(name, weight);
	}
}

class Grape3 extends Fruit3{
	public Grape3(String name, int weight) {
		super(name, weight);
	}
}

class ApppleComp implements Comparator<Apple3>{
	public int compare(Apple3 o1, Apple3 o2) {
		return o2.weight-o1.weight; 
	}
}
class GrapeComp implements Comparator<Grape3>{
	public int compare(Grape3 o1, Grape3 o2) {
		return o2.weight-o1.weight;
	}
}




class Fruit3Comp implements Comparator<Fruit3>{ 
	public int compare(Fruit3 o1, Fruit3 o2) { //o1-o2하면 낮은거부터나옴 
			if(o1.weight<o2.weight) {
			 return -1;
			}else if(o1.weight==o2.weight){
				return 0;
			}else {
				return 1;
			}
	}
}


class Juicer1{
	static Juice makeJuice(FruitBox3<? extends Fruit3> fruitbox3) {
		String temp="";
		for(int i=0; i<fruitbox3.size(); i++) 
			temp+=(Fruit2)(fruitbox3.get(i))+" ";
		return new Juice(temp);
	}
}



public class Chap12_4 {
	public static void main(String[] args) {
		
		FruitBox3<Apple3> applebox = new FruitBox3<Apple3>();
		FruitBox3<Grape3> grapebox = new FruitBox3<Grape3>();
		
		applebox.add(new Apple3("a1",400));
		applebox.add(new Apple3("a1",200));
		applebox.add(new Apple3("a1",300));
		
		grapebox.add(new Grape3("g1", 400));
		grapebox.add(new Grape3("g1", 100));
		grapebox.add(new Grape3("g1", 300));
		
		
		Collections.sort(applebox.getList(), new ApppleComp());
		Collections.sort(grapebox.getList(), new GrapeComp());
		System.out.println(applebox);
		System.out.println(grapebox);
		
		//apple과 grape 가 Fruit3Comp 들어갈수 있는 이유는 와일드카드!
		Collections.sort(applebox.getList(), new Fruit3Comp()); 
		Collections.sort(grapebox.getList(), new Fruit3Comp());
		System.out.println(applebox);
		System.out.println(grapebox);
		
		
		
		box3 box3 =null;
		box3<Object> obj =null;
		box3 = (box3)obj; //가능은하지만 경고발생!
		obj = (box3<Object>)box3;
		
		box3<? extends Object> b1 = new box3<String>(); //가능! 제한이 obj타입이라서 
		
		
		
	}
}




class box3<T>{
	ArrayList<T> arr = new ArrayList<T>();
	void add(T t) {
		arr.add(t);
	}
	T get(int i) {
		return arr.get(i);
	}
	ArrayList<T>getList(){return arr;}
	
	int size() {
		return arr.size();
	}
	public String toString() {
		return arr.toString();
	}
}
class FruitBox3<T extends Fruit3>extends box3{};
