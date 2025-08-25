package src;


public class SeventhProgram {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ 

            // コマンドライン引数を整数に変換
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // 加算結果を表示
            int result = num1 + num2;
            System.out.println("一つ目の引数：" + num1);
    		System.out.println("二つ目の引数：" + num2);
    		System.out.println("加算の結果：" + result);
       
	}

}