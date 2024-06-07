package 单例.懒汉方式;

public class Single {
    private static Single single;

    /**
     * private 是关键，不能让使用者自己new，自己初始化自己
     */
    private Single() {
        System.out.println("初始化");
    }

    public static Single getSingle() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        if (single == null) {
            single = new Single();
        }
        return single;

    }
}
