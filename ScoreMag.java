package oopHomeWorkDay02;
//如果有学员分数低于60 所有学员的成绩提高2分
public class ScoreMag {
	public void updateScore(Students[] name){
		boolean isUnder60=false;
		for (int i = 0; i < name.length; i++) {
			if (name[i].score<60) {
				isUnder60=true;
				break;
			}    
		}
		if (isUnder60) {
			for (int i = 0; i < name.length; i++) {
				name[i].score+=2;
			}
		}
	}
	
	//print
	public void print(Students[] stuArr){
		for (int i = 0; i < stuArr.length; i++) {
			System.out.println(stuArr[i].name+"的成绩为:"+stuArr[i].score);
		}
	}
}
