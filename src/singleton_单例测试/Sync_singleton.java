package singleton_单例测试;

class Sync_singleton {
    private volatile static Sync_singleton object;
    private final static Object lockObj = new Object(); // Use for locking

    private Sync_singleton() {
        // Exists only to avoid instantiation.
    }

    public static Sync_singleton getInstance() {
        if (object != null) {
            return object;
        } else {
            // Start a synchronized block, only one thread can enter and stay in the block one at a time
            synchronized(lockObj) {
                if (object == null) {
                    object = new Sync_singleton();
                }
            } // End of synchronized block
            return object;
        }
    }
}