package oopHomeWorkDay02;

//��¼����

public class PassWordMag {
	public String passWord="111111";
	public boolean login(String userName,String passWord){
		return userName.equals("admin1")&&passWord.equals(this.passWord);
	}
}
