package src;

public class SeventhProgram {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int result = add(3,5,6,8);
		System.out.println(result);
		
	}
	
	public static int add(int num1, int num2, int... rest) {
		return num1 + num2;
	}

}
