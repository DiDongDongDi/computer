public class Desktop extends Computer{
    private String computerCase;

    Desktop(String name, String brand, String cpu, String memory, String hardDisk, String monitor,String choose) {
        super(name,brand, cpu, memory, hardDisk, monitor);

        computerCase=choose;

    }

    public String getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(String computerCase) {
        this.computerCase = computerCase;
    }

    public void show(){
        super.show();
        System.out.printf("%10s\n", getComputerCase());
    }
}
