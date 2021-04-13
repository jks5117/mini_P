package thread.basic;
class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("-");
		}
		System.out.println("[[[A스레드 run]]]");
	}
}
class B extends Thread{
	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("|");
		}
		System.out.println("[[[B스레드 run]]]");
		
	}
}

public class ThreadEx13 {
	static long startTime = 0;
	public static void mian(String args[]) {
		A th1 = new A();
		B th2 = new B();
		th1.start();
		th2.start();
		
		startTime = System.currentTimeMillis();
		/*
		try {
			th1.
			th2.
		} catch (InterruptedException e) {}
		*/
		System.out.print("소요시간:"+ (System.currentTimeMillis()- ThreadEx13.startTime));
	}
}
