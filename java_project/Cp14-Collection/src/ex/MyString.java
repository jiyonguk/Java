package ex;

import java.util.Iterator;
import java.util.TreeSet;

public class MyString implements Comparable<MyString> {
	String str;

	public MyString(String str) {
		this.str = str;
	}

	public int getLength() {
		return str.length();

	}

	public int compareTo(MyString mStr) {

		int result = 0;

		if (getLength() > mStr.getLength()) {
			result = 1;
		} else if (getLength() < mStr.getLength()) {
			result = -1;
		}
			
		return result;
		
	}

	@Override
	public String toString() {
		return str;
	}
	
}

class ComparableMyString{
	public static void main(String[] args) {
		TreeSet<MyString> tSet = new TreeSet<MyString>();
		tSet.add(new MyString("Orange"));
		tSet.add(new MyString("Apple"));
		tSet.add(new MyString("Dog"));
		tSet.add(new MyString("Individual"));
		
		Iterator<MyString> itr = tSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}