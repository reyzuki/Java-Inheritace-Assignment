
public class Q3 {
	static class Rectangle{
		int length, breadth;
		
		public Rectangle(int l, int b) {
			length = l;
			breadth = b;
		}
		
		public void printArea() {
			System.out.println(length * breadth);
		}
		
		public void printPerimeter() {
			System.out.println(2 * (length + breadth));
		}
	}
	
	static class Square extends Rectangle{
		int side;
		public Square(int s) {
			super(s,s);
		}
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(3,5);
		r.printArea();
		r.printPerimeter();
		
		Square s = new Square(4);
		s.printArea();
		s.printPerimeter();
		

}
	}
