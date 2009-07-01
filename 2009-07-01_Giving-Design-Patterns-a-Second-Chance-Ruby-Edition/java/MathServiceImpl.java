public class MathServiceImpl implements MathService {
	public void add(int x, int y) {
		System.out.println("Result ("+x+ " + "+y+"): " + (x + y));
	}
	
	public void subtract(int x, int y) {
		System.out.println("Result ("+x+ " - "+y+"): " + (x - y));
	}	
}