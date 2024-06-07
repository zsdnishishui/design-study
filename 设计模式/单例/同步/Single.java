package 单例.同步;

/**
 * 由于其他模式在并发的时候会出问题，所以利用volatile关键字，保证可见性
 */
public class Single {
    private static Single single;
    private Single(){

    }
    public synchronized static Single getSingle() {
        if (single == null){
            single = new Single();
        }
        return single;

    }
}
