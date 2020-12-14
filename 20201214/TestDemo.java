

/*
 * date：2020-12-14
 * author：zhengbinbin
 * describe：一个java文件里只能有一个public类,并且这个类的类名要与文件名相同
 *
 */
 
public class TestDemo {
	public static void main(String[] args) {
		double a = 12.34;
		System.out.println(a);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		// float f1 = 12.3;			// 会编译出错，java不允许将double类型的数据赋值给float类型的变量
		float f2 = 12.3f;	
		System.out.println(f2);		// 可以通过编译
		
		// java中char类型占两个字节(0~65535)，char类型所对应的包装类为Character
		// java支持Unicode字符集(其中包含了ascii字符集)，可以表示比ascii更多的字符
		char ch1 = 'a';
		char ch2 = 97;		// 这里的97的ascii码对应'a'
		char ch3 = '郑';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		// System.out.println(Character.MAX_VALUE);		// 貌似不能这么用
		// System.out.println(Character.MIN_VALUE);
		
		// java中的数据类型：byte,占一个字节
		byte b1 = 12;
		byte b2 = 21;
		System.out.println(b1 + " " + b2);
		System.out.println(Byte.MAX_VALUE);		// 127
		System.out.println(Byte.MIN_VALUE);		// -128
		
		// short类型占两个字节
		short sh1 = 12;
		System.out.println(Short.MAX_VALUE);		// 32767
		System.out.println(Short.MIN_VALUE);		// -32768
		
		// 在Java中bool类型没有明确大小,且只有两个取值(true和false),没有c语言中的0为假1为真的说法
		boolean flag = true;
		
		String s1 = "hello";
		System.out.println(s1);		
		
		// 整形提升：小于4个字节的数据在进行运算的时候，会发生整型提升，将其转换为整型类型再进行运算
		byte by1 = 10;
		byte by2 = 20;
		// byte by3 = by1 + by2;		// 编译报错，运算时先将by1和by2提升为了整形再相加，得到一个整型数字，再赋值给byte类型的变量by3时就会报错
		byte by3 = (byte)(by1 + by2);	// 将by1和by2相加得到的整型数字进行强制类型转换为byte类型，再进行赋值就不会报错
		System.out.println(by3);
		
		// 常量：字面常量、被final修饰的变量
		// 常量的变量名一般使用大写字母表示，无法修改(只能被初始化一次)
		final int MAXNUM = 10;
		// MAXNUM = 999;	// 报错
		System.out.println(MAXNUM);
		
		// 隐式类型转换：将小范围数据类型赋值给大范围数据类型时，会默认发生隐式类型转换
		int a1 = 10;
		double d1 = a1;	// 赋值时a1发生了隐式类型转换
		
		// 显式类型转换：将大范围数据类型赋值给小范围数据类型时，会报错，需要进行显式的类型转换
		double d2 = 10;
		// int a2 = d2;		// 报错
		int a2 = (int)d2;	// 进行显式的强制类型转换后不报错
		
		// int和String之间的相互转换
		
		// int->String
		int i = 10;
		// 方法一：给int类型的变量后面拼接空字符串
		String str1 = i + "";
		// 方法二：调用String类的valueOf方法
		String str2 = String.valueOf(i);
		
		// int->String
		String str = "100";		
		// 调用Integer类的parseInt方法
		int num = Integer.parseInt(str);	// 这个方法要谨慎使用，因为传进来的str可能不是一个可以转换为整型数字的字符串
	}
	
	// main函数的参数String[] args是什么？
	// 运行时命令行参数，使用java filename命令去运行时，后面所输入的一个或多个字符串会存放到String类型的数组args中
	/*
	public static void main(String[] args) {
		for(int i = 0; i < args.length; ++i) {
			System.out.println(args[i]);	// 什么都没输出,若在运行命令后输入字符串参数数组,则会将此数组输出
		}
		System.out.println("hello");
	}
	*/
	
	public static void Test1(String[] args) {
		System.out.println("hello java");	// 打印hello java并换行
		System.out.print("hello java");		// 打印hello java但不换行
		
		int a = 10;
		System.out.println(a);		// 打印a并换行
		System.out.print(a);		// 打印a但不换行
		
		System.out.println(Integer.MAX_VALUE);		// 打印整形最大值
		System.out.println(Integer.MIN_VALUE);		// 打印整形最小值	
		
		int b;
		//print(b);		// 局部变量b未初始化，不能使用，若使用会报错
		
		long num = 10L;
		System.out.println(num);
		
		System.out.println("long类型的最大值：" + Long.MAX_VALUE);	// 加号作用是拼接字符串
		System.out.println("long类型的最小值：" + Long.MIN_VALUE);
		
		System.out.println("hello" + 10);			// 若拼接的部分含有字符串，则会将所有部分都转换成字符串进行拼接，因此输出hello10
		System.out.println(10 + 20);				// 输出30
		System.out.println("hello" + 10 + 20);		// 输出hello1020
		System.out.println("hello" + (10 + 20));	// 有括号时会先对括号里的代码进行执行，因此输出hello30
	}
}