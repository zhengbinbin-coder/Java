
/**
 * author：zhengbinbin
 * date：2020-11-23
 * describe：如果一个类是public的，那么这个类的类名要和文件名相同，并且一个文件中只能有一个public类
 */

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("hello world");	// 打印字符串并换行
		
		int a = 10;
		System.out.print(a);	// 打印a 不换行
		System.out.println(a);	// 打印a并换行
		
		System.out.println(Integer.MAX_VALUE);	// 打印整形的最大值
		System.out.println(Integer.MIN_VALUE);	// 打印整形的最小值
		
		int b;
		//System.out.println(b);	// 局部变量b未初始化，不能使用，若使用会报错
	}
}