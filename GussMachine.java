package oopHomeWorkDay02;

public class GussMachine {
	public String goodsName;
	public int goodsPrice;
	

	public void initial(){
		int randomNum=(int)(Math.random()*10);
		switch (randomNum) {
		case 0:
			System.out.println("��²⡰ps4 pro���ļ۸�");
			this.goodsPrice=2000;
			break;
		case 1:
			System.out.println("��²⡰�ֶ������ļ۸�");
			this.goodsPrice=3032;
			break;
		case 2:
			System.out.println("��²⡰�ǰ塱�ļ۸�");
			this.goodsPrice=203;
			break;
		case 3:
			System.out.println("��²⡰SSD���ļ۸�");
			this.goodsPrice=455;
			break;
		case 4:
			System.out.println("��²⡰�εΡ��ļ۸�");
			this.goodsPrice=20;
			break;
		case 5:
			System.out.println("��²⡰���ȡ��ļ۸�");
			this.goodsPrice=24;
			break;
		case 6:
			System.out.println("��²⡰�綯�����ļ۸�");
			this.goodsPrice=2590;
			break;
		case 7:
			System.out.println("��²⡰���󡱵ļ۸�");
			this.goodsPrice=5;
			break;
		case 8:
			System.out.println("��²⡰����ӡ��ļ۸�");
			this.goodsPrice=20000;
			break;
		case 9:
			System.out.println("��²⡰����綯�����ļ۸�");
			this.goodsPrice=3400;
			break;

		default:
			break;
		}
	}
	
	boolean isTrue=false;
	public void guess(int num){
		
		if(num==goodsPrice){
			System.out.println("�¶��ˣ�");
			isTrue=true;
		}else if (num>goodsPrice) {
			System.out.println("��С�㣡");
		}else{
			System.out.println("�ٴ�㣡");
		}
	}
}
