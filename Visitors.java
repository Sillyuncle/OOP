package oopHomeWorkDay02;

//判断游客年龄是否满足优惠标准

public class Visitors {
	public String name;
	public int age;
	public double price;
	
	
	public double price(){
		if(age<=18||age>=60){
			return  0;
		}
		return 20;
		
	}
	
	public String showInfo(){
		
			 return name+"的年龄是:"+this.age;
		
		}
	
}
