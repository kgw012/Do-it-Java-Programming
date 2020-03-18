package practicequiz;

import java.util.HashMap;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	public static CarFactory getInstance() {
		return instance;
	}
	
	HashMap<String, Car> hashMap = new HashMap<>();
	
	public Car createCar(String carName) {
		Car car = new Car(carName);
		if(hashMap.containsKey(carName)) {
			return hashMap.get(carName);
		}
		else hashMap.put(carName, car);
		return hashMap.get(carName);
	}
	
}