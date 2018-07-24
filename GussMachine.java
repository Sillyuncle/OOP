package oopHomeWorkDay02;

public class GussMachine {
	public String goodsName;
	public int goodsPrice;
	

	public void initial(){
		int randomNum=(int)(Math.random()*10);
		switch (randomNum) {
		case 0:
			System.out.println("请猜测“ps4 pro”的价格：");
			this.goodsPrice=2000;
			break;
		case 1:
			System.out.println("请猜测“手动阀”的价格：");
			this.goodsPrice=3032;
			break;
		case 2:
			System.out.println("请猜测“盖板”的价格：");
			this.goodsPrice=203;
			break;
		case 3:
			System.out.println("请猜测“SSD”的价格：");
			this.goodsPrice=455;
			break;
		case 4:
			System.out.println("请猜测“滴滴”的价格：");
			this.goodsPrice=20;
			break;
		case 5:
			System.out.println("请猜测“咖啡”的价格：");
			this.goodsPrice=24;
			break;
		case 6:
			System.out.println("请猜测“电动阀”的价格：");
			this.goodsPrice=2590;
			break;
		case 7:
			System.out.println("请猜测“大大大”的价格：");
			this.goodsPrice=5;
			break;
		case 8:
			System.out.println("请猜测“火箭队”的价格：");
			this.goodsPrice=20000;
			break;
		case 9:
			System.out.println("请猜测“悍马电动车”的价格：");
			this.goodsPrice=3400;
			break;

		default:
			break;
		}
	}
	
	boolean isTrue=false;
	public void guess(int num){
		
		if(num==goodsPrice){
			System.out.println("猜对了！");
			isTrue=true;
		}else if (num>goodsPrice) {
			System.out.println("再小点！");
		}else{
			System.out.println("再大点！");
		}
	}
}
