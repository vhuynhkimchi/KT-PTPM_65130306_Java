package creational.builder.A7;

public class MainComputer {
    public static void main(String[] args){
        Computer computer = new Computer.Builder()
                .buildCPU("Intel ultra i9 2026")
                .buildRAM("64GB DDR6 8200MHZ")
                .buildStorage("5TB NVME")
                .buildScreen("4k 24inches LG")
                .build();
        Computer computer1 = new Computer.Builder()
                .buildCPU("Cpu").buildRAM("128GB")
                        .build();
        System.out.println(computer.toString());
        System.out.println(computer1.toString());
    }
}
