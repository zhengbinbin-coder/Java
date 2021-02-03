import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Program: DataStructure_myArrayList
 * Description:
 * Author: ZhengBinbin
 * Date: 2021-02-01 22:29
 */
public class MyArrayList {
    public int[] elem;  // 数组
    public int size;    // 有效数据个数
    public static final int initCapacity = 10;  // 初始容量

    public MyArrayList() {
        this.elem = new int[initCapacity];
        this.size = 0;
    }

    // 判断顺序表是否满了
    private boolean isFull() {
        return this.elem.length == this.size;
    }

    // 判断顺序表是否为空
    private boolean isEmpty() {
        return this.size == 0;
    }

    // 打印顺序表
    public void display() {
        for(int i = 0; i < this.size; ++i) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        // 先判断是否已经满了
        if(isFull()) {
            // 若已满,扩容为2倍并拷贝原数组元素到新数组
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        // 判断下标是否合法
        if(pos < 0 || pos > this.size) {
            throw new RuntimeException("pos下标不合法!");
        }
        // 将pos位置开始的数据整体向后挪动一个位置
        for (int i = this.size-1; i >= pos; --i) {
            this.elem[i+1] = this.elem[i];
        }
        // 插入数据
        this.elem[pos] = data;
        // 有效数据+1
        this.size++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        // 遍历查找是否有要找的数据
        for(int i = 0; i < this.size; ++i) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        // 遍历查找要找的数据
        for(int i = 0; i < this.size; ++i) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        // 顺序表是否为空
        if(isEmpty()) {
            throw new RuntimeException("顺序表为空!");   // 手动抛出异常
        }
        // 判断pos合法性
        if(pos < 0 || pos >= this.size) {
            throw new RuntimeException("pos下标不合法!");
        }
        // return pos位置的数据
        return this.elem[pos];
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos < 0 || pos >= this.size) {
            throw new RuntimeException("pos下标不合法!");
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        // 找要删的key在不在顺序表中,若存在则记录其下标
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("顺序表中不存在要删除的数字!");
        } else {
            // 若找到了要删除的元素,将其后的元素向前挪动一个位置
            for (int i = index + 1; i < this.size; ++i) {
                this.elem[i-1] = this.elem[i];
            }
            // 将有效数据个数-1
            --this.size;
        }
    }

    // 获取顺序表长度
    public int size() {
        return this.size;
    }

    // 清空顺序表
    public void clear() {
        this.size = 0;
    }
}
