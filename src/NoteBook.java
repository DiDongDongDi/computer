
import java.util.*;
public class NoteBook extends Computer {
    private String battery;
    public NoteBook(){}
    public NoteBook(String name, String brand, String cpu, String memory,String hardDisk, String monitor,String battery)
    {
        super(name,brand,cpu,memory,hardDisk,monitor);
        this.battery=battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    /*@Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public void setCpu(String cpu) {
        super.setCpu(cpu);
    }

    @Override
    public void setHardDisk(String hardDisk) {
        super.setHardDisk(hardDisk);
    }

    @Override
    public void setMemory(String memory) {
        super.setMemory(memory);
    }

    @Override
    public void setMonitor(String monitor) {
        super.setMonitor(monitor);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void set(String name, String brand, String cpu, String memory, String hardDisk, String monitor) {
        super.set(name, brand, cpu, memory, hardDisk, monitor);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getCpu() {
        return super.getCpu();
    }

    @Override
    public String getHardDisk() {
        return super.getHardDisk();
    }

    @Override
    public String getMemory() {
        return super.getMemory();
    }

    @Override
    public String getMonitor() {
        return super.getMonitor();
    }

    @Override
    public String getName() {
        return super.getName();
    }*/

    @Override
    public void show() {
        super.show();
        System.out.printf("   %-10s\n", getBattery());
    }
}
