package oopHomeWorkDay02;

//�ж��ο������Ƿ������Żݱ�׼

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
		
			 return name+"��������:"+this.age;
		
		}
	
}
