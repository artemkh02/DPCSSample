public class FractionRunner {
	
	public static void main(String[] args) {
		Fraction f = new Fraction();


		System.out.println(f.getNum()+"/"+f.getDen());
		
		f.reduce();
		System.out.println(f.getNum()+"/"+f.getDen());
		System.out.println(f.getNum()+"/"+f.getDen());
	}

}
