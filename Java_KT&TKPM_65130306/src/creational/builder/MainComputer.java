package creational.builder;

public class MainComputer {
    public static void main(String[] args){
        Computer computer = new Computer.Builder()
                .buildCPU("Intel ultra i9 2026")
                .buildRAM("64GB DDR6 8200MHZ")
                .buildStorage("5TB NVME")
                .buildScreen("4k 24inches LG")
                .build();
        System.out.println(computer.toString());
    }
}
