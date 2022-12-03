package creational.construct.extension;

public class Phone {

    private String name;

    private String screen;

    private String cpu;

    private String mainBoard;

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", screen='" + screen + '\'' +
                ", cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }

    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.name = builder.name;
        this.screen = builder.screen;
        this.mainBoard = builder.mainBoard;
    }

    public static final class Builder {

        private String name;

        private String screen;

        private String cpu;

        private String mainBoard;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder mainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}
