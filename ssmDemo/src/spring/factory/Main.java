package spring.factory;

public class Main {
	public static void main(String[] args) {
		InterfaceColor red = new ColorFactory("Red").getColorInstance();
		red.fill();
	}
}
