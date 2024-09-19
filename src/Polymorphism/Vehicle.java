package Polymorphism;

class Vehicle {
	
	public void Startengine() {
		
	}
	class Car extends Vehicle{
		@Override
		public void Startengine() {
			System.out.println("Engine Starts");
		}
	}
	
	class Sportscar extends Car{
		@Override
		public void Startengine() {
			System.out.println("Engine Stats in SportsCar");
		}
		
	}
	  public class finish{
	    public static void main(String[] args) {
	        Vehicle V3 = new Vehicle();
	        V3.Startengine();

	        Vehicle V2 = new Car();
	        V2.Startengine();

	        Vehicle V4 = new Sportscar();
	        V4.Startengine();
	    }
	}

}



