package lianxi.Readily;

import lianxi.Sell;

public class SellTest {
    public static void main(String[] args) {
        Sell s1 = new Sell("窗口一");
        Sell s2 = new Sell("窗口二");
        Sell s3 = new Sell();
        s3.setName("窗口三");
        s1.start();
        s2.start();
        s3.start();
    }
}
