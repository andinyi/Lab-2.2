
public abstract class Person {
	

		private String firstName;
		private String familyName;
		private int height;
		private String zodiacSign; 
		
		public Person(int height, String firstName, String familyName, String zodiacSign) {
			this.height = height;
			this.firstName = firstName;
			this.familyName = familyName;
			this.zodiacSign = zodiacSign;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getFamilyName() {
			return familyName;
		}
		
		public abstract String toString() {
			
		}
	}
