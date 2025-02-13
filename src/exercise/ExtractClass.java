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
	class TelephoneNumber {
		private String officeAreaCode;
		private String officeNumber;
		
		public String getTelephoneNumber() {
            return "(" + this.officeAreaCode + ") " + this.officeNumber;
        }

		public String getOfficeAreaCode() {
			return officeAreaCode;
		}

		public void setOfficeAreaCode(String officeAreaCode) {
			this.officeAreaCode = officeAreaCode;
		}

		public String getOfficeNumber() {
			return officeNumber;
		}

		public void setOfficeNumber(String officeNumber) {
			this.officeNumber = officeNumber;
		}
	}
	
}