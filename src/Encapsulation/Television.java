package Encapsulation;

public class Television{
	
	private String Brand;
	private String model;
	private int Screensize;
	private int volume;
	
	
	public Television(String Brand, String model, int Screensize,int volume){
		
		this.Brand=Brand;
		this.model=model;
		this.Screensize=Screensize;
		this.volume=volume;
	}
	
	public String getBrand() {
		return Brand;
	}
	
	public String getmodel() {
		return model;
	}
	
	public int Screensize() {
		return Screensize;
	}
	
	public int volume() {
		return volume;
	}
	
	public void turnOn() {
        System.out.println("The television is now ON.");
    }

    public void turnOff() {
        System.out.println("The television is now OFF.");
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume increased to " + volume);
        } else {
            System.out.println("Volume is already at maximum.");
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume decreased to " + volume);
        } else {
            System.out.println("Volume is already at minimum.");
        }
    }
    
    public class main {
    	public static void main(String arg[]) {
    		
    		Television myTv = new Television("Sony","S2",55, 34);
    		
    		
    		myTv.turnOn();
    		myTv.increaseVolume();
    		myTv.decreaseVolume();
    		myTv.turnOff();
    	}
    	
    	
    }
}

	