package structural.bridge.impl;

import structural.bridge.PenRefill;

public class BlackPenRefill implements PenRefill {
    @Override
    public String getColor() {
        return "黑色";
    }
}
