package com.h2kinfosys.sample;

public class ExampleThread {

	public static void main(String[] args) throws InterruptedException {
		Task task = new Task();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);
		Thread t4 = new Thread(task);
		
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		t4.setName("daemon");
		t4.setDaemon(true);
		
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();

		System.out.println("This is executed after all threads " + Thread.currentThread().getName());
	}

}
