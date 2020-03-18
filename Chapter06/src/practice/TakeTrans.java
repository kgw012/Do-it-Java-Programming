package practice;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentKim = new Student("±è±æ¿õ", 100000);
		Bus bus1227 = new Bus(1227);
		Subway subway7 = new Subway(7);

		studentKim.takeBus(bus1227);
		studentKim.showInfo();
		bus1227.showInfo();
		subway7.showInfo();

	}

}
