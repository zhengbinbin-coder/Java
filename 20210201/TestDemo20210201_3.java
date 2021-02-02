/**
 * Create with IntelliJ IDEA
 * Program: 20210201
 * Description:
 * Author: ZhengBinbin
 * Date: 2021-02-01 16:43
 */

class Person {
    /**
     * 访问修饰限定符：
     * 在Java中什么都不写就是默认权限->包访问权限
     */
    // 字段->成员变量
    private String name;
    private int age;
    private static int size; // 静态成员变量

    // 按住Alt+Insert,为各个成员变量批量设置get和set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setSize(int size) {
        Person.size = size;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getSize() {
        return size;
    }

    // 按住Alt+Insert,选择生成toString方法
    @Override       // 这里重新实现了一下Object类的toString方法;@Override是注解,这个注解表示方法是重写的
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 按住Alt+Insert,选择生成构造方法,构造方法支持重载
    // this是什么？是对象吗？
    // this是当前对象的引用,不是对象,在构造函数完成后才产生了对象,而构造函数中使用了this

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 方法->行为
    public void eat() {
        System.out.println("eat()!");
    }

    public void sleep() {
        System.out.println("sleep()!");
    }
}
public class TestDemo20210201_3 {

    public static void main(String[] args) {
        // 匿名对象调用成员方法,只能使用一次,出了本行就销毁
        new Person().eat();
    }

    public static void main2(String[] args) {
        /*
        Person per = new Person();  // 当生成了有参构造函数时,编译器不再生成默认无参构造,这里报错,若要使用则要手动实现无参构造
        System.out.println(per.age);
        System.out.println(per.name);
        System.out.println(per.size);       // 此处不报错误，但是有警告
        System.out.println(Person.size);    // 访问静态成员变量时，直接使用类名去访问，不需要实例化对象
         */
    }

    public static void main1(String[] args) {
        // 通过关键字new实例化Person类对象
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
    }
}
