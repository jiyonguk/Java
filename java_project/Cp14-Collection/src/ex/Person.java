package ex;

import java.util.Iterator;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person o) {

		int result = 0;

//		if (this.age > o.age) {
//			result = 10000;
//		} else if (this.age < o.age) {
//			result = -10000;
//		} else {
//			result = 0;
//		}
		
		result = (this.age-o.age)*-1;
		return result;
	}
	
	void showData(){
		System.out.printf("%s %d \n",this.name,this.age);
	}

	public static void main(String[] args) {

		TreeSet<Person> tree = new TreeSet<>();
		
		tree.add(new Person("son", 27));
		tree.add(new Person("king", 30));
		tree.add(new Person("lee", 23));
		tree.add(new Person("park", 21));
		
		Iterator<Person> itr = tree.iterator();
		
		while(itr.hasNext()) {
			itr.next().showData();
		}
	}
}
