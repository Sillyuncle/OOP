package oopHomeWorkDay02;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import sun.net.www.content.text.plain;
import sun.print.resources.serviceui;

public class MyTestors {	

	
	@Test//随机选中一个商品，对其价格进行竞猜

	public void test8(){
		Scanner input=new Scanner(System.in);
		GussMachine guess=new GussMachine();
		guess.initial();
		
		int count=4;
		do {
			int price = input.nextInt();
			guess.guess(price);
			if (guess.isTrue) {
				break;
			}
			count--;
			if (count==0) {
				System.out.println("竞猜次数已用完，下次再来吧！");
				break;
			}
			System.out.println("再猜一次吧！还剩"+count+"次机会");
			
		} while (true);
	}
	
	@Test//方法重载加法计算器
	public void test7(){
		Scanner input=new Scanner(System.in);
		Caculator calculator=new Caculator();
		System.out.println(calculator.add(1,23 ));		//两个整型数相加
		System.out.println(calculator.add(1,1 ,22.4 )); //三个浮点数相加
	}
	
	
	@Test// 输入5名参赛者的成绩  求出平均值 最大值

	public void test6(){
		Players caculator=new Players();
		Scanner input=new Scanner(System.in);
		Players[] scoresArr=new Players[5];
		
		System.out.println("请输入5名参赛者的成绩");
		for (int i = 0; i < scoresArr.length; i++) {
			scoresArr[i]=new Players();
			scoresArr[i].score=input.nextDouble();
		}
		
		System.out.println("平均值:"+caculator.avg(scoresArr));//方法:求平均值
		System.out.println("最大值:"+caculator.max(scoresArr));//方法:求最大值
	
	}
	

	@Test// 如果学员成绩小于 60 集体提高2分
	public void test5(){
		Scanner input=new Scanner(System.in);
		ScoreMag mag=new ScoreMag();
		Students[]  stuArr=new Students[3];
		//储存学生信息
		for (int i = 0; i < stuArr.length; i++) {
			stuArr[i]=new Students();
			System.out.print("请输入学生姓名:");
			stuArr[i].name=input.next();
			System.out.print("请输入学生成绩");
			stuArr[i].score=input.nextInt();
		}
		mag.print(stuArr);
		//进行修改
		mag.updateScore(stuArr);
		System.out.println("修改后的成绩为：");
		mag.print(stuArr);
		
	}
	@Test//指定区间内 查找学生姓名
	public void test4(){
		StudentsMag p=new StudentsMag();
		Scanner input=new Scanner(System.in);
		StudentsMag[] stuArr=new StudentsMag[5];
		//构造对象数组，储存学生信息
		for (int i = 0; i < stuArr.length; i++) {
			StudentsMag v=new StudentsMag();
			System.out.print("请输入学生姓名:");
			v.name=input.next();
			stuArr[i]=v;
		}
		p.print(stuArr);	//方法：输出学生信息
		//指定区间查找学生姓名
		System.out.print("请输入开始查找的位置：");
		int startIndex=input.nextInt();
		System.out.print("请输入结束查找的位置：");
		int endIdex=input.nextInt();
		System.out.println("请输入要查找的名字:");
		String searchName=input.next();
		p.find(searchName, startIndex, endIdex, stuArr);
	}
	@Test//输入水果名称 得到水果汁  方法：榨汁机
	public void test3(){
		Scanner input=new Scanner(System.in);
		Jucer fruits=new Jucer();
		System.out.println("要榨的水果:");
		String fruit=input.next();
		System.out.println(fruits.jucer(fruit));
	}

	@Test//修改密码  通过登录方法判断是否能进行密码修改，再根据用户交互来修改密码
	public void test1() {
		PassWordMag login=new PassWordMag();
		Scanner input=new Scanner(System.in);
		
		System.out.print("请输入用户名:");
		String name=input.next();
		System.out.println(" ");
		System.out.print("请输入密码:");
		String passWord=input.next();
		
		if (login.login(name, passWord)) {
			System.out.print("请输入新密码:");
			String newPassWord=input.next();
			System.out.println("修改密码成功，新密码为:"+newPassWord);
		}else{
			System.out.println("用户名或密码有误，请重新输入！");
		}
	}
	@Test  //记录5名游客的信息，并输出总票价
	public void test() {
		Scanner input=new Scanner(System.in);
		Visitors[] vsArr=new Visitors[5];
		double sum=0;
			for (int i = 0; i < vsArr.length; i++) {
				vsArr[i]=new Visitors();
				
				System.out.println("请输入姓名：");
				String name = input.next();
				vsArr[i].name=name;
				
				System.out.println("请输入年龄：");
				vsArr[i].age = input.nextInt();
				vsArr[i].price=vsArr[i].price();  //要用该对象来调用方法
				sum+=vsArr[i].price;
			}
			
			System.out.println("姓名\t年龄\t票价");
			for (int j = 0; j < vsArr.length; j++) {
				System.out.println(vsArr[j].name+"\t"+vsArr[j].age+"\t"+vsArr[j].price);
			}
			System.out.println("总票价："+sum);	
	}
	@Test  //用方法判断游客年龄是否符合优惠条件，根据不同的情况输出游客需要支付的门票
	public void test2() {
		Visitors vs=new Visitors();
		Scanner input=new Scanner(System.in);
		Visitors[] vsArr=new Visitors[5];
		double sum=0;
			for (int i = 0; i < vsArr.length; i++) {
				vsArr[i]=new Visitors();
				
				System.out.println("请输入姓名：");
				String name = input.next();
				vsArr[i].name=name;
				
				System.out.println("请输入年龄：");
				vsArr[i].age = input.nextInt();
				vsArr[i].price=vsArr[i].price();  //要用该对象来调用方法
				sum+=vsArr[i].price;
			}
			
			System.out.println("姓名\t年龄\t票价");
			for (int j = 0; j < vsArr.length; j++) {
				System.out.println(vsArr[j].name+"\t"+vsArr[j].age+"\t"+vsArr[j].price);
			}
			System.out.println("总票价："+sum);	
	}

}

