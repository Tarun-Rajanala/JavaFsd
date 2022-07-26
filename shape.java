package phase1.javaFSD;


public class shape {

	int length;
	int breadth;
	float radius;
	public shape(){
		
	}
	public shape(float r) {
		radius=r;
		
	}
	public shape(int l,int b) {
		length=l;
		breadth=b;
	}
	public shape(int s) {
		length=s;
		
	}
	void displayDefault() {
		System.out.println("This is default");
	}
	void displayCircle() {
		System.out.println("Area of circle is: "+(3.14*radius*radius));
	}
	void displayRectangle() {
		System.out.println("Area of Rectangle is: "+(length*breadth));
	}
	void displaySquare() {
		System.out.println("Area of Square is: "+(length*length));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape dflt=new shape();
		shape Circle=new shape(5.7f);
		shape Rectangle=new shape(6,8);
		shape Square=new shape(9);
		dflt.displayDefault();
		Circle.displayCircle();
		Rectangle.displayRectangle();
		Square.displaySquare();

	}

}
