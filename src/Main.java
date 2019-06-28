import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		ComputerSet pcSet= new ComputerSet();
		NoteBook l1 = new NoteBook("T61","IBM","Intel酷睿2","2GB","160GB","14.1英寸","6芯");
        NoteBook l2 = new NoteBook("X60","IBM","Intel酷睿2","512MB","80GB","121英寸","6芯");
        Desktop d1 = new Desktop("530MT","戴尔","Intel酷睿2","512MB","80GB","19英寸","卧式");
        Desktop d2 = new Desktop("Lenovo5050","联想","AMD速龙64","1GB","160GB","22英寸","立式");
        pcSet.add(l1);
        pcSet.add(l2);
        pcSet.add(d1);
        pcSet.add(d2);
		Scanner sc=new Scanner(System.in);
		int op;
		while(true){
			System.out.println("请用户选择操作: 1: 查看电脑信息 2: 增加电脑信息 3: 删除电脑信息 4: 退出");
			op=sc.nextInt();
			switch(op){
				case 1:
					pcSet.show();
					break;
				case 2:
					Computer temp=null;
					System.out.println("请选择电脑类型");
					System.out.println("1.笔记本\t2.台式机");
					Scanner in =new Scanner(System.in);
					String[] s=new String[7];
					int choose=0;
					while(choose!=1&&choose!=2) {
						choose=in.nextInt();
						if (choose == 1||choose==2) {//LAPTOP

						} else {
							System.out.println("输入错误,请重新输入!");
						}
					}
					System.out.println("请输入型号名称");
					s[0]=in.next();

					System.out.println("请输入品牌名称");
					s[1]=in.next();

					System.out.println("请输入CPU");
					s[2]=in.next();

					System.out.println("请输入内存");
					s[3]=in.next();

					System.out.println("请输入硬盘");
					s[4]=in.next();

					System.out.println("请输入显示器");
					s[5]=in.next();

					if(choose==1){
						System.out.println("请输入电池芯片");
						s[6]=in.next();
					}
					else if(choose==2){
					System.out.println("请输入机箱类型: 1: 立式   2:卧式");
					int ch=0;
							ch=in.nextInt();
					while(ch!=1&&ch!=2){
						System.out.println("输入错误,请重新输入!");
						ch=in.nextInt();
					}
						if(ch==1){
							s[6]="立式";
						}
						else{
							s[6]="卧式";
						}
					}
					if(choose==2){//Desktop
						temp=new Desktop(s[0],s[1],s[2],s[3],s[4],s[5],s[6]);
					}
					else if(choose==1){
						temp=new NoteBook(s[0],s[1],s[2],s[3],s[4],s[5],s[6]);
					}
					pcSet.add(temp);
					break;
				case 3:
					System.out.println("请输入待删除的序号：");
					int times=0;
					while(true){
						int opp=sc.nextInt();
						if(opp<=0){
							System.out.println("输入有误！请重新输入：");
						}
						else{
							if(pcSet.delete(opp)){
								System.out.println("删除成功！");
								break;
							}
							else
								System.out.println("不存在，请重新输入:");
						}
						times++;
						if(times>=3){
							System.out.println("多次输入失败, 退出删除操作!");
							break;
						}
					}
					break;
				case 4:
					System.out.println("感谢使用!");
					System.exit(0);
				default:
					System.out.println("输入错误!");
			}
		}
	}
}
