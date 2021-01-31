/**
 * Create with IntelliJ IDEA
 * Program: 20210131
 * Description:
 * Author: ZhengBinbin
 * Date: 2021-01-31 14:45
 */
public class TestDemo2 {
    /**
     * 斐波那契数列
     */
    public static int fib(int n) {
        if(n==0 || n==1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int ret = fib(n);
        System.out.println(ret);
    }

    /**
     * 方法的递归：
     */
    public static int fac(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n*fac(n-1);
        }
    }
    public static void main2(String[] args) {
        int a = 5;
        int ret = fac(a);
        System.out.println(ret);
    }

    /**
     * 方法的重载(overload):
     * 构成重载的条件：方法名相同、返回值不做要求、参数列表必须不同、在同一个类中
     */
    public static int sum(int a, int b) {
        return a+b;
    }
    public static double sum(double a, double b) {
        return a+b;
    }

    public static void main1(String[] args) {
        //System.out.println("hello world");
        int x1 = 1;
        int y1 = 2;
        System.out.println(sum(x1,y1));

        double x2 = 1.1;
        double y2 = 2.3;
        System.out.println(sum(x2,y2));
    }
}
