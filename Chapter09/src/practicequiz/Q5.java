package practicequiz;

import java.util.ArrayList;

public class Q5 {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		for(Car car : carList) {
			car.run();
			System.out.println("============================");
		}
	}
}
