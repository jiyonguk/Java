package ex;

import java.util.Scanner;

public class dungeon {
	
	int stage;
	Scanner sc;
	
	dungeon(int num){
		this.stage = num;
		sc = new Scanner(System.in);
	}
	
	void stage() {
		
		 
		
		//battle();
		
		stage = 0;
	}
	
	void stageChoice(){
		
		System.out.println("스테이지를 선택해주세요.");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		
		case 1:
		}
	
	}
	
	
	boolean revelCheck(){return false;}
}
