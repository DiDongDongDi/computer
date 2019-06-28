public class ComputerSet{
	Computer[] arr;
	int num;
	ComputerSet(){
		arr=new Computer[100];
		num=0;
	}
	public void show(){
		System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "序号", "型号名称", "品牌", "CPU", "内存", "硬盘", "显示器", "电池芯片", "机箱类型");
		for(int i=0;i<num;++i){
			System.out.printf("%-10d", (i+1));
			arr[i].show();
		}
	}
	public boolean add(Computer pc){
		if(num>=100)
			return false;
		else{
			arr[num]=pc;
			num++;
			return true;
		}
	}
	public boolean delete(int pos){
		if(pos>num){
			return false;
		}
		else{
			int i=pos-1;
			int j=i+1;
			for(;j<num;++i,++j){
				arr[i]=arr[j];
			}
			num--;
			return true;
		}
	}
}
