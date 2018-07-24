package oopHomeWorkDay02;

public class StudentsMag {
	public String name;
	//print
	public void print(StudentsMag[] name){
		for (StudentsMag i : name) {
			System.out.print(i.name+"\t");
		}
	}
	
	public void find(String stu,int startIndex,int endIdex,StudentsMag[] stuArr){
		for (int i = startIndex-1; i <= endIdex-1; i++) {
			if (stu.equals(stuArr[i].name)) {
				System.out.println("找到了！");
				return;
			}
		}
		System.out.println("没找到！");
		
	}
}
