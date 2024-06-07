package 单例.枚举方式;

public class Test {
    public static void main(String[] args) {
        Single single = Single.One;
        Single single2 = Single.One;
        System.out.println(single);
        System.out.println(single2);
    }
}