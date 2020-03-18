package object;

class MyDate {
	

	int day;
	int month;
	int year;

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date1 = (MyDate)obj;
			if(date1.day == this.day && date1.month == this.month && date1.year == this.year) {
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	@Override
	public int hashCode() {
		return day*1000000+month*10000+year;
	}





	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
}

