package builder;

public class Test {

    public static void main(String args[]){

        Computer computer = new Computer.Builder()
                            .setPrice(1000.89)
                            .setProcessor("intel")
                            .setRam("16GB")
                .build();

        System.out.println(computer.getPrice());

        Computer computer1 = new Computer.Builder()
                .setPrice(1000.89)
                .setProcessor("intel")
                .build();

        System.out.println(computer1.getRam());
    }
}
