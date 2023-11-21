package Encapsulation;

public class SetGet {
	
	int val;
    String str;
    float f;
    
    
    public void setval(int val) {
		this.val=val;
    }
    public void setstr(String str) {
    	this.str=str;
    }
    
    public int getval() {
    	return val;
    }
    public String getstr() {
    	return str;
    }
    
    public static void main(String arg[]) {
    	
    	SetGet Obj = new SetGet();
    	Obj.setstr("AK");
    	Obj.setval(25);
    	System.out.println(Obj.getval());
    	System.out.println(Obj.getstr());
    	
    	
    	
    	
    }
   

}
