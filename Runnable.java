package com.briup.day1;

public class RunnableTest {
	public static void main(String[] args) {
		B a = new B();
		Thread thread = new Thread(a);
		thread.start();
		
		for(int i = 0;i < 1000;i++) {
			System.out.println("反受其咎");
		}
	}

}
class B implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i <= 1000;i++) {
			System.out.println("天予不取");
		}
		
	}
	
}
