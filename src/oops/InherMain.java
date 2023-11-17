package oops;

public class InherMain {

	public static void main(String[] args) {
		
		ParEx exp=new ParEx(1);
		ParEx exp1=new ParEx("Ak");
		ChildEx childexp=new ChildEx();
		
		System.out.println("Print 1:"+exp.primenumber());
		System.out.println("Print 2:"+exp.test());
		System.out.println("Print 3:"+exp1.test());
		System.out.println("Print 4:"+childexp.test());

	}

}
