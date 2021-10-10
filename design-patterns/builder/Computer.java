package builder;

import lombok.Getter;

@Getter
public class Computer {

    private String ram;
    private String processor;
    private Double price;

    private Computer(Builder Builder){
        this.ram = Builder.ram;
        this.processor = Builder.processor;
        this.price = Builder.price;
    }

    public static class Builder{

        private String ram;
        private String processor;
        private Double price;

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }
}
