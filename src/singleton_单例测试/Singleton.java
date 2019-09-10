package singleton_单例测试;

public class Singleton {
    private static Singleton object;
    private Singleton(){

    };

    public static Singleton getInstance() {
        if (object == null) {
            object = new Singleton(); // Create the object for the first and last time
        }
        return object;
    }


}
