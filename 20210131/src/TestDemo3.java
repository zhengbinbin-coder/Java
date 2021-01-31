/**
 * Create with IntelliJ IDEA
 * Program: 20210131
 * Description:
 * Author: ZhengBinbin
 * Date: 2021-01-31 20:25
 */
public class TestDemo3 {
    /**
     * 打印挪动轨迹函数：从pos1位置挪动到pos2位置
     * @param pos1 位置1
     * @param pos2 位置2
     */
    public static void move(char pos1, char pos2) {
        System.out.print(pos1 + "->" + pos2 + "  ");
    }

    /**
     * 汉诺塔问题
     * @param n 盘子数量
     * @param pos1 起始位置
     * @param pos2 可借助的位置
     * @param pos3 最终位置
     */
    public static void hanoi(int n, char pos1, char pos2, char pos3) {
        if(n==1) {
            move(pos1,pos3);
        } else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
        // 假设只有一个盘子,给出ABC三个位置
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
    }
}
