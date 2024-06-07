package 单例.饿汉方式;

public class Test {
    public static void main(String[] args) {
//        Single sigle = Single.getSingle();
//        Single sigle2 = Single.getSingle();
//        System.out.println(sigle);
//        System.out.println(sigle2);
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                    Single sigle = Single.getSingle();
//                    System.out.println(sigle);
            }).start();

        }
    }
}