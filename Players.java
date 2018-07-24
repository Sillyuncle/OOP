package oopHomeWorkDay02;

public class Players {
	public String name;
	public double score;
	
	public double avg(Players[] scoresArr){
		double sum=0;
		double avg=0;
		for (int i = 0; i < scoresArr.length; i++) {
			sum+=scoresArr[i].score;
		}
		avg=sum/scoresArr.length;
		return avg;
	}
	
	public double max(Players[] scoresArr ){
		double max=0;
		for (int i = 0; i < scoresArr.length; i++) {
			if (i==0) {
				max=scoresArr[i].score;
			}
			if (max<scoresArr[i].score) {
				max=scoresArr[i].score;
			}
		}
		return max;
	}
}
