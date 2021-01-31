import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Program: 20210131
 * Description:
 * Author: ZhengBinbin
 * Date: 2021-01-31 20:56
 */
public class TestDemo4 {
    /**
     * 数组
     * Java中的数组存放在堆上(c语言中的数组存放在栈上)
     */

    /**
     * 实现toString
     * @param arr 传入的整型数组
     * @return 返回整型数组转换得到的字符串
     */
    public static String myToString(int[] arr) {
        String ret = "[";
        for(int i = 0; i < arr.length-1; ++i) {
            ret = ret + arr[i];
            ret = ret + ", ";
        }
        ret = ret + arr[arr.length-1];
        ret = ret + "]";
        return ret;
    }

    public static void main(String[] args) {
        /**
         * Arrays工具类方法演示
         */
        int[] arr = {15,55,23,47,89,12,5,63};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(myToString(arr));
    }

    /**
     * 将传入数组的元素扩大为2倍(Java中数组类型可以作为方法的返回值类型)
     * @param arr 传入的数组
     * @return 返回新创建的数组
     */
    public static int[] func(int[] arr) {
        int[] tmp = new int[arr.length];
        for(int i = 0; i < arr.length; ++i) {
            tmp[i] = 2 * arr[i];
        }
        return tmp;
    }

    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = func(array);            // 用ret接收array数组扩大两倍后的数组
        String str = Arrays.toString(ret);  // 将ret数组转换为字符串，赋给str;Arrays是操作数组的工具类
        System.out.println(str);
    }
    public static void main2(String[] args) {
        int[] arr = null;   // arr此时引用的是一个空对象
    }

    /**
     * 数组进行参数传递
     * @param arr 传进来的数组
     */
    public static void printArray(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};   // 若初始化则不能在[]里指定数组的大小
        int[] array1 = new int[]{1,2,3,4,5};    // 若初始化则不能在[]里指定数组的大小
        int[] array2 = new int[5];              //array2里存放的是5个0

        int len = array.length;     // array的length属性
        int len1 = array1.length;
        int len2 = array2.length;
        System.out.println(len);
        System.out.println(len1);
        System.out.println(len2);

        /**
         * 用for循环遍历array数组
         */
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        /**
         * 用foreach遍历array1数组,java中的foreach和C++中的范围for用法基本相同
         */
        for (int e : array1) {
            System.out.print(e + " ");
        }
        System.out.println();

        // 用自己写的打印函数遍历打印数组
        printArray(array1);
        System.out.println();

        // 使用java工具包自带的方法打印数组,Arrays是操作数组的工具类
        int[] array3 = {1,2,3,4,5,6};
        String str = Arrays.toString(array3);    // 将数组转换成字符串,赋给String类型的对象str
        System.out.println(str);
    }
}
