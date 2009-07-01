public class MathServiceProxy implements MathService {
	private MathService delegate;
	
	public MathServiceProxy(MathService ms){
		this.delegate = ms; 
	}

	public void add(int x, int y) {
		System.out.println("Call made to the add method");
		delegate.add(x, y);
	}
	
	public void subtract(int x, int y) {
		System.out.println("Call made to the subtract method");
		delegate.subtract(x, y);
	}	
}