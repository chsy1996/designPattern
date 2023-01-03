package structural.bridge;

import structural.bridge.impl.BlackPenRefill;
import structural.bridge.impl.RainBowPenRefill;
import structural.bridge.impl.RedPenRefill;

public class Client {
    public static void main(String[] args) {
        Pen pen1 = new LargeSizePen(new RedPenRefill());
        pen1.write("Hello World!");

        Pen pen2 = new LargeSizePen(new BlackPenRefill());
        pen2.write("Hello World!");

        Pen pen3 = new SmallSizePen(new RedPenRefill());
        pen3.write("Hello World!");

        Pen pen4 = new SmallSizePen(new RainBowPenRefill());
        pen4.write("Hello World!");
    }
}
