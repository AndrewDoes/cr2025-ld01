package exercise;
public class ExtractClass {
// todo extract class TelephoneNumber from class Person
	class Person {
	  private String name;
	  private TelephoneNumber phoneNum = new TelephoneNumber();
	public TelephoneNumber getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(TelephoneNumber phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(String name) {
		return this.name;
	}
	}
}