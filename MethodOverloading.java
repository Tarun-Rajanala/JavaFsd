package phase1.javaFSD;


public class MethodOverloading {

	public int calculate(int a, int b) {
		System.out.println("the sum of"+a+"and"+b+"is:"+(a+b));
		return a+b;
		
	}
	public int calculate(int r) {
		System.out.println("Area of circle is:"+(3.14*r*r));
		int CircleArea=(int)(3.14*r*r);
		return CircleArea;
		
		
	}
	public int calculate(int x, float y) {
		System.out.println("Area of rectangle is:"+(x*y));
		int RectangleArea=(int)(x*y);
		return RectangleArea;
	}
	public int calculate(float s) {
		System.out.println("Area of square is:"+(s*s));
		int SquareArea=(int)(s*s);
		return SquareArea;
		
	}

	public static void main(String[] args) {
		MethodOverloading ob=new MethodOverloading();
		ob.calculate(4,3);
		ob.calculate(7);
		ob.calculate(4,6.7f);
		ob.calculate(5.7f);
		

	}

	}


