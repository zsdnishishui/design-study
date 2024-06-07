package 单例.同步;

public class Test {
    public static void main(String[] args) {
        Single single = Single.getSingle();
        Single single2 = Single.getSingle();
        System.out.println(single);
        System.out.println(single2);
    }
}