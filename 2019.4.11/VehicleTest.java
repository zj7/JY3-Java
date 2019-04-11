package java0410;

public class VehicleTest {
	
	public static void main(String[] args) {
		Vehicle car = new Vehicle(100,1000);
		car.move();
		System.out.println("车的速度为："+car.speed+",车的体积为："+car.size);
		System.out.println("车的速度为："+car.setSpeed(200));
	}
	
	
}
