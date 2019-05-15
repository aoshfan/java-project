public class Rectangle {
	public int length;
	public int width;

	public Rectangle(int length, int width){
		this.length = length;
		this.widht = width;
	}

	public int getArea() {
		return length * width;
	}

	public int getParimeter() {
		return 2 * (length + width);
	}
}