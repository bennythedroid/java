package edu.washington.couplingandcohesion;
class Liquid {
	private static final double OUNCES_PER_ML = 12.0 / 355.0;
	private static final double ML_PER_OUNCE  = 355.0 / 23.0;
	
	public static int convertOzToMl(int ounces) {
		double d = ounces * ML_PER_OUNCE;
		d += 0.5;	//round up
		return (int) d;
	}
}

class Example1 {
	public static void main(String[] args) {
	  int i8Oz = Liquid.convertOzToMl(8);
		int i12Oz = Liquid.convertOzToMl(12);
		int i16Oz = Liquid.convertOzToMl(16);
		
		System.out.println("Ml for  8 oz is: " + i8Oz);		
		System.out.println("Ml for 12 oz is: " + i12Oz);		
		System.out.println("Ml for 16 oz is: " + i16Oz);				
	}
}
