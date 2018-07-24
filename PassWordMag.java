package oopHomeWorkDay02;

//µÇÂ¼¹¦ÄÜ

public class PassWordMag {
	public String passWord="111111";
	public boolean login(String userName,String passWord){
		return userName.equals("admin1")&&passWord.equals(this.passWord);
	}
}
