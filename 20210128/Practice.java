import java.util.Scanner;
import java.util.Random;

public class Practice{
	
	/**
	 * 打印1-100之中的素数(素数：只能被1和它本身整除)
	 */
	 
	public static void main(String[] args) {
		
		for(int i = 1; i < 100; ++i) {
			boolean flag = true;
			/*for(int j = 2; j < i; ++j) {*/
			/*for(int j = 2; j <= i/2; ++j) {*/
			for(int j = 2; j <= (int)Math.sqrt(i); ++j) {
				if(i % j == 0) {
					flag = false;
				}
			}
			if(flag == true) {
				System.out.println(i + "是素数");
			} else {
				System.out.println(i + "不是素数");
			}
		}
	}
	
	
	/**
	 * 猜数字
	 */
	
	public static void swwafafa(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 生成一个Random类的对象，命名为random
		Random random = new Random();
		// 调用生成的random对象的nextInt方法,随机生成一个范围在[0,100)的整型数字，赋给randNum变量
		int randNum = random.nextInt(100);
		
		// 生成随机数范围:[100,200)
		int randNum1 = random.nextInt(100)+100;
		
		//System.out.println(randNum);
		
		while(true) {
			System.out.println("请输入要猜的数字：");
			int num = scan.nextInt();
			if(num < randNum1) {
				System.out.println("猜小了!");
			} else if(num > randNum1) {
				System.out.println("猜大了!");
			} else {
				System.out.println("猜对了!");
				break;
			}
		}
	}
}
