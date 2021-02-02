import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Program: 20210201
 * Description:
 * Author: ZhengBinbin
 * Date: 2021-02-01 14:25
 */
public class TestDemo20210201_2 {

    public static void main(String[] args) {
        // C语言中只指定列时,行可以自动推导;Java中不能只指定列,行必须指定且列不能自动推导
        int[][] arr = new int[3][];
        // Java中二维数组的每一行可单独指定列数,且数值可以不同
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[4];
        for (int i = 0; i < arr.length; ++i)
        {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 规则二维数组的打印
     */
    public static void main1(String[] args) {
        int[][] arr = {{1,2,3},{7,8,9}};

        for(int i = 0; i < arr.length; ++i)
        {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 将二维数组转换为字符串,结果为:转换为了二位数组的行数个地址
        System.out.println(Arrays.toString(arr));
        // 将二维数组深度转换为字符串
        System.out.println(Arrays.deepToString(arr));

        // 用foreach打印二维数组
        for (int[] tmp : arr) {
            for(int e : tmp) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
