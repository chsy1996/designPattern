package structural.bridge.impl;

import structural.bridge.PenRefill;

public class RedPenRefill implements PenRefill {
    @Override
    public String getColor() {
        return "红色";
    }
}
