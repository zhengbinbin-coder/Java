import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Program: 20210201
 * Description:
 * Author: ZhengBinbin
 * Date: 2021-02-01 12:06
 */
public class TestDemo20210201_1 {

    /**
     * 调整数组使所有偶数位于奇数的前面
     * @param arr 需要调整的数组
     */
    public static void func(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            while(arr[left] % 2 == 0 && left < right) {
                ++left;
            }
            while(arr[right] % 2 != 0 && left < right) {
                --right;
            }
            if(left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        func(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序
     * @param arr 需要排序的数组
     */
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length-1; ++i) {
            boolean flag = true;
            for(int j = 0; j < arr.length-1-i; ++j) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag == true) {
                return;
            }
        }
    }

    public static void main6(String[] args) {
        int[] array = {45,12,78,89,56,67,23,34};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 判断数组是否为升序
     * @param arr 传入的数组
     * @return 是升序:返回true;不是升序:返回false
     */
    public static boolean isUp(int[] arr) {
        for(int i = 1; i < arr.length; ++i) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main5(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(isUp(arr));
    }

    public static void main4(String[] args) {
        int[] arr = new int[8888];
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = i;
        }

        // 使用Arrays.binarySearch方法在有序数组中查找指定元素,返回值是下标
        System.out.println(Arrays.binarySearch(arr,8887));

        // 使用Arrays.equals方法判断两个数组是否相同
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6};
        boolean flag = Arrays.equals(arr1,arr2);
        System.out.println(flag);

        // 使用Arrays.fill方法填充数组
        int[] arr3 = new int[10];
        Arrays.fill(arr3,6);
        Arrays.fill(arr3,2,5,8);
        System.out.println(Arrays.toString(arr3));
    }

    /**
     * 找出数组中最大的元素
     * @param arr 传入的数组
     * @return 返回数组的最大元素
     */
    public static int getMax(int[] arr) {
        int maxNum = arr[0];
        for(int i = 1; i < arr.length; ++i) {
            if(arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int a = getMax(array);
        System.out.println(a);
    }

    /**
     * Java中数组的拷贝有4种方式：
     * 1.for循环
     * 2.Arrays.copyOf()方法:底层仍然调用System.arraycopy方法
     * 3.System.arraycopy()方法:本地方法,底层由C/C++语言编写，速度快
     * 4.array.clone()方法:产生了这个对象的一个副本,这个方法是Object的克隆方法
     * Object是所有类的父类
     */
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6,7};

        // 使用Arrays.copyOf()方法拷贝
        int[] ret1 = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret1));

        // 使用System.arraycopy()方法拷贝
        int[] ret2 = new int[array.length];
        System.arraycopy(array,0,ret2,0,array.length);
        System.out.println(Arrays.toString(ret2));

        // 使用array.clone()方法拷贝数组
        int[] ret3 = array.clone();
        System.out.println(Arrays.toString(ret3));
    }

    /**
     * 实现数组的拷贝
     * @param array 需要拷贝的数组
     * @return 返回拷贝好的数组
     */
    public static int[] copyArray(int[] array) {
        int[] ret = new int[array.length];
        for(int i = 0; i < array.length; ++i) {
            ret[i] = array[i];
        }
        return ret;
    }
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ret = copyArray(arr);
        System.out.println(Arrays.toString(ret));
    }
}
