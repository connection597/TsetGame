package tsetGame;

import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [ ]arr = {"고","기"};
		
		System.out.println("=====고기 게임 시작======");
		System.out.println("숫자를 입력 해주세요");
		int num = sc.nextInt();
		
		for(int i=0; i <num; i++) {
			System.out.println(arr[i%2]);
		}
	}

}
