package question;

class MyDate {
	private int day;
	private int month;
	private int year;
	
	//getter,setter
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//생성자
	public MyDate() {}
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//메서드
	public boolean isValid2() {
		
		if(month<1 || month>12) {
			return false;
		}
		
		else {
			switch(month) {
			
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(day<1 || day>31) {
					return false;
				}
				else {
					return true;
				}
				
			case 4: case 6: case 9: case 11:
				if(day<1 || day>30) {
					return false;
				}
				else {
					return true;
				}
				
			case 2:
				if(year%4==0 && (year%400==0 || year%100!=0)) {
					if(day<1 || day>29) {
						return false;
					}
					else {
						return true;
					}
				}
				else {
					if(day<1 || day>28) {
						return false;
					}
					else {
						return true;
					}
				}
			}
			return false;
		}
	}
	public String isValid() {
		if(isValid2() == true) {
			return "유효한 날짜입니다.";
		}
		else {
			return "유효하지 않은 날짜입니다.";
		}
	}
		
			
}

