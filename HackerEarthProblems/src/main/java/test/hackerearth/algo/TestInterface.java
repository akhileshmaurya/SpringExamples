package test.hackerearth.algo;

class B extends Thread {
	@Override
	public void run() {
		synchronized (this) {
			try {
				wait(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}

public class TestInterface {
	
	public static void main(String[] args) {
		B b = new B();
		long start=System.currentTimeMillis();
		b.start();
		try {
			b.join(6000);
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		System.out.println(System.currentTimeMillis()-start);
	}
	
}
