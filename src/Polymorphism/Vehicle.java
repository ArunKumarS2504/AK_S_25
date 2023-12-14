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

	
}


