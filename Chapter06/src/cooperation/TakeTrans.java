package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);

		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();

		Subway subway2 = new Subway("2ȣ��");
		tomas.takeSubway(subway2);
		tomas.showInfo();
		subway2.showInfo();
	}

}