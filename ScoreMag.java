package oopHomeWorkDay02;
//�����ѧԱ��������60 ����ѧԱ�ĳɼ����2��
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
			System.out.println(stuArr[i].name+"�ĳɼ�Ϊ:"+stuArr[i].score);
		}
	}
}
