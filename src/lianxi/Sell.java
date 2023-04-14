package lianxi;

public class Sell extends Thread {
    public Sell() {
    }

    public Sell(String name) {
        super(name);
    }

    static int ticks = 0;
    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
//            上锁
            synchronized (Sell.class) {//锁对象要表示唯一
                // 非静态调用当前文件synchronized (Sell.class)
                // ，静态调用字节码文件synchronized(obj)
                if (judge()) break;
            }
        }
    }


    //ctrl+alt+M生成同步方法
    private boolean judge() {
        if (ticks < 100) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticks++;
            System.out.println(getName() + ticks);
        } else {
            return true;
        }
        return false;
    }
}
