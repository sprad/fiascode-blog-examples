public class MathServiceDriver {
	public static void main(String[] args) {
		MathService ms = new MathServiceProxy(new MathServiceImpl());		
		ms.add(1, 2);
		ms.subtract(4, 3);
	}
}