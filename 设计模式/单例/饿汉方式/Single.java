package 单例.饿汉方式;

public class Single {


    private static Single single = new Single();
    /**
     * private 是关键，不能让使用者自己new，自己初始化自己
     */
    private Single() {
        System.out.println("初始化");
    }

    public static Single getSingle() {
        return single;
    }
}
