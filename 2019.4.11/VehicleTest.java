package java0410;

public class VehicleTest {
	
	public static void main(String[] args) {
		Vehicle car = new Vehicle(100,1000);
		car.move();
		System.out.println("�����ٶ�Ϊ��"+car.speed+",�������Ϊ��"+car.size);
		System.out.println("�����ٶ�Ϊ��"+car.setSpeed(200));
	}
	
	
}
