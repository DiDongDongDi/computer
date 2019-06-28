public abstract class Computer{
	Computer(){
		
	}
	Computer(String name, String brand, String cpu, String memory, String hardDisk, String monitor){
		this.name=name;
		this.brand=brand;
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
		this.monitor=monitor;
	}
	private String name;
	private String brand;
	private String cpu;
	private String memory;
	private String hardDisk;
	private String monitor;
	public void setName(String name){
		this.name=name;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public void setCpu(String cpu){
		this.cpu=cpu;
	}
	public void setMemory(String memory){
		this.memory=memory;
	}
	public void setHardDisk(String hardDisk){
		this.hardDisk=hardDisk;
	}
	public void setMonitor(String monitor){
		this.monitor=monitor;
	}
	public void set(String name, String brand, String cpu, String memory, String hardDisk, String monitor){
		this.name=name;
		this.brand=brand;
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
		this.monitor=monitor;
	}
	public String getName(){
		return name;
	}
	public String getBrand(){
		return brand;
	}
	public String getCpu(){
		return cpu;
	}
	public String getMemory(){
		return memory;
	}
	public String getHardDisk(){
		return hardDisk;
	}
	public String getMonitor(){
		return monitor;
	}
	public void show(){
		System.out.printf("%-10s     %-10s %-10s %-10s %-10s %-10s", getName(), getBrand(), getCpu(), getMemory(), getHardDisk(), getMonitor());
	}
}
