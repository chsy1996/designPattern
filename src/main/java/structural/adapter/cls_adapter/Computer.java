package structural.adapter.cls_adapter;

import java.util.Objects;

public class Computer {

    public void readCard(SDCard sdCard) {
        if (Objects.nonNull(sdCard)) {
            sdCard.readSDCard();
        }
    }

}
