package oopHomeWorkDay02;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import sun.net.www.content.text.plain;
import sun.print.resources.serviceui;

public class MyTestors {	

	
	@Test//���ѡ��һ����Ʒ������۸���о���

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
				System.out.println("���´��������꣬�´������ɣ�");
				break;
			}
			System.out.println("�ٲ�һ�ΰɣ���ʣ"+count+"�λ���");
			
		} while (true);
	}
	
	@Test//�������ؼӷ�������
	public void test7(){
		Scanner input=new Scanner(System.in);
		Caculator calculator=new Caculator();
		System.out.println(calculator.add(1,23 ));		//�������������
		System.out.println(calculator.add(1,1 ,22.4 )); //�������������
	}
	
	
	@Test// ����5�������ߵĳɼ�  ���ƽ��ֵ ���ֵ

	public void test6(){
		Players caculator=new Players();
		Scanner input=new Scanner(System.in);
		Players[] scoresArr=new Players[5];
		
		System.out.println("������5�������ߵĳɼ�");
		for (int i = 0; i < scoresArr.length; i++) {
			scoresArr[i]=new Players();
			scoresArr[i].score=input.nextDouble();
		}
		
		System.out.println("ƽ��ֵ:"+caculator.avg(scoresArr));//����:��ƽ��ֵ
		System.out.println("���ֵ:"+caculator.max(scoresArr));//����:�����ֵ
	
	}
	

	@Test// ���ѧԱ�ɼ�С�� 60 �������2��
	public void test5(){
		Scanner input=new Scanner(System.in);
		ScoreMag mag=new ScoreMag();
		Students[]  stuArr=new Students[3];
		//����ѧ����Ϣ
		for (int i = 0; i < stuArr.length; i++) {
			stuArr[i]=new Students();
			System.out.print("������ѧ������:");
			stuArr[i].name=input.next();
			System.out.print("������ѧ���ɼ�");
			stuArr[i].score=input.nextInt();
		}
		mag.print(stuArr);
		//�����޸�
		mag.updateScore(stuArr);
		System.out.println("�޸ĺ�ĳɼ�Ϊ��");
		mag.print(stuArr);
		
	}
	@Test//ָ�������� ����ѧ������
	public void test4(){
		StudentsMag p=new StudentsMag();
		Scanner input=new Scanner(System.in);
		StudentsMag[] stuArr=new StudentsMag[5];
		//����������飬����ѧ����Ϣ
		for (int i = 0; i < stuArr.length; i++) {
			StudentsMag v=new StudentsMag();
			System.out.print("������ѧ������:");
			v.name=input.next();
			stuArr[i]=v;
		}
		p.print(stuArr);	//���������ѧ����Ϣ
		//ָ���������ѧ������
		System.out.print("�����뿪ʼ���ҵ�λ�ã�");
		int startIndex=input.nextInt();
		System.out.print("������������ҵ�λ�ã�");
		int endIdex=input.nextInt();
		System.out.println("������Ҫ���ҵ�����:");
		String searchName=input.next();
		p.find(searchName, startIndex, endIdex, stuArr);
	}
	@Test//����ˮ������ �õ�ˮ��֭  ������ե֭��
	public void test3(){
		Scanner input=new Scanner(System.in);
		Jucer fruits=new Jucer();
		System.out.println("Ҫե��ˮ��:");
		String fruit=input.next();
		System.out.println(fruits.jucer(fruit));
	}

	@Test//�޸�����  ͨ����¼�����ж��Ƿ��ܽ��������޸ģ��ٸ����û��������޸�����
	public void test1() {
		PassWordMag login=new PassWordMag();
		Scanner input=new Scanner(System.in);
		
		System.out.print("�������û���:");
		String name=input.next();
		System.out.println(" ");
		System.out.print("����������:");
		String passWord=input.next();
		
		if (login.login(name, passWord)) {
			System.out.print("������������:");
			String newPassWord=input.next();
			System.out.println("�޸�����ɹ���������Ϊ:"+newPassWord);
		}else{
			System.out.println("�û����������������������룡");
		}
	}
	@Test  //��¼5���ο͵���Ϣ���������Ʊ��
	public void test() {
		Scanner input=new Scanner(System.in);
		Visitors[] vsArr=new Visitors[5];
		double sum=0;
			for (int i = 0; i < vsArr.length; i++) {
				vsArr[i]=new Visitors();
				
				System.out.println("������������");
				String name = input.next();
				vsArr[i].name=name;
				
				System.out.println("���������䣺");
				vsArr[i].age = input.nextInt();
				vsArr[i].price=vsArr[i].price();  //Ҫ�øö��������÷���
				sum+=vsArr[i].price;
			}
			
			System.out.println("����\t����\tƱ��");
			for (int j = 0; j < vsArr.length; j++) {
				System.out.println(vsArr[j].name+"\t"+vsArr[j].age+"\t"+vsArr[j].price);
			}
			System.out.println("��Ʊ�ۣ�"+sum);	
	}
	@Test  //�÷����ж��ο������Ƿ�����Ż����������ݲ�ͬ���������ο���Ҫ֧������Ʊ
	public void test2() {
		Visitors vs=new Visitors();
		Scanner input=new Scanner(System.in);
		Visitors[] vsArr=new Visitors[5];
		double sum=0;
			for (int i = 0; i < vsArr.length; i++) {
				vsArr[i]=new Visitors();
				
				System.out.println("������������");
				String name = input.next();
				vsArr[i].name=name;
				
				System.out.println("���������䣺");
				vsArr[i].age = input.nextInt();
				vsArr[i].price=vsArr[i].price();  //Ҫ�øö��������÷���
				sum+=vsArr[i].price;
			}
			
			System.out.println("����\t����\tƱ��");
			for (int j = 0; j < vsArr.length; j++) {
				System.out.println(vsArr[j].name+"\t"+vsArr[j].age+"\t"+vsArr[j].price);
			}
			System.out.println("��Ʊ�ۣ�"+sum);	
	}

}

