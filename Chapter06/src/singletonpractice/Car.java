package singletonpractice;

public class Car {

	int carNumber;
	private static int serialNum = 10000;

	public Car() {
		serialNum++;
		carNumber = serialNum;
	}

	public int getCarNum() {
		return carNumber;
	}
}
