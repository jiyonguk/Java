package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//List<E> -> ArrayList<E>
		//List<E> : 저장 순서를 가진다. 데이터의 중복 저장가능
		//순서 -> 일괄처리(반복적인 동일한 작업을 빠르게 처리)
		
		//ArrayList 인스턴스 생성 : Integer 타입의 객체만 저장
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		//인스턴스 생성시에 자료형 생략가능
		//ArrayList<Integer> list = new ArrayList<>();
		
		//다형성
		//List<Integer> list = new ArrayList<>();
		
		//List<E> 정의된 메서드 : add(E),remove(index),size(),get(index)
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(10);

		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(3));

		list.remove(3);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		Random rand = new Random();
//		for (int i = 0; i<6;i++ ) {
//			
//			list.add(new Integer(rand.nextInt(45)));
//			
//			System.out.println(list.get(i));
//		}
	}

}
