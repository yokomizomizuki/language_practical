package src;

import java.util.Scanner;

public class SeventhProgram {
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("一つ目の引数：");
		int num1 = scanner.nextInt();
		
		System.out.println("二つ目の引数：");
		int num2 = scanner.nextInt();
		
		int result = add(num1,num2);
		
		System.out.println("加算の結果：" + result);
		
		scanner.close();
	}

}