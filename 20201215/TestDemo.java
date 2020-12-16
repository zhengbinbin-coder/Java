
import java.util.Scanner;


public class TestDemo {
	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 20;
		System.out.println(a1 == a2);
		System.out.println(a1 != a2);
		System.out.println(a1 < a2);
		System.out.println(a1 > a2);
		System.out.println(a1 <= a2);
		System.out.println(a1 >= a2);
		
		/*
		// Java中的输入(Scanner类)
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();		// 从键盘读入一个整形数据，赋给a
		System.out.println(a);
		
		String str = input.next();
		System.out.println(str);
		*/
		
		/*
		// 循环输入判断输入的年份是否为闰年
		Scanner scan = new Scanner(System.in);
		// 如何退出循环？1.ctrl+c直接中断程序;2.ctrl+d正常退出;3.输入不合规范的输入
		while(scan.hasNextInt()) {
			int year = scan.nextInt();
			if((year%4==0 && year%100!=0) || (year%400==0))	{
				System.out.println("闰年");
			} else {
				System.out.println("不是闰年");
			}
		}
		*/
		
		int a = 10;
		switch(a) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("1");
				break;
			default:
				System.out.println("默认数字：10");
				break;
		}
		
		// 求1! + 2! + 3! + 4! + 5!
		int num = 5;
		int sum = 0;
		while(num >= 1) {
			int n = 1;
			int result = 1;
			while (n <= num) {
				result *= n;
				n++;
			}
			num--;
			sum += result;
		}
		System.out.println(sum);
	}
}