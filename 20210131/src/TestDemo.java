import java.util.Scanner;

/**
 * Create with IntelliJ IDEA
 * Program: 20210131
 * Description:
 * Author: ZhengBinbin
 * Date: 2021-01-31 00:01
 */
public class TestDemo {
    public static void main(String[] args) {

    }

    /**
     * Java的方法：对应c语言中的函数
     * 方法：一段代码，用来实现某个功能
     *
     * 语法：
     * public static 返回值 方法名(形式参数列表) {
     *      方法体;
     * }
     *
     * 方法名：Java中要采用小驼峰的形式
     *
     * public static：写的方法在main方法中进行了调用
     * 因为main方法是public static，所以它所调用的方法也必须是public static
     *
     * 返回值：可有可无，视具体需求而定
     *
     * 形参列表：形参是实参的一份临时拷贝
     *
     * 方法体：具体功能的实现逻辑代码
     */
    public static int maxNum(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println(maxNum(n1, n2));
    }

    /**
     * 判断一个十进制数字的二进制有几个1
     * 15:0000 1111
     */
    public static void main1(String[] args) {    //快捷键:psvm
        //System.out.println("hello");    //快捷键:sout

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;
        while(n != 0) {
            if((n&1) != 0) {
                count++;
            }
            n >>= 1;
        }
        System.out.println(count);
    }
}
