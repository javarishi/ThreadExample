package com.h2kinfosys.sample;

public class Task implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " This is executed by Multiple Threads " 
					+ Thread.currentThread().getName() );
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 */
		}
		processDBCall();
	}

	public  String processDBCall() {
		String newID = null;
		synchronized(this) {
			newID = System.currentTimeMillis() + Thread.currentThread().getName(); 
		}
		return newID;
	}
}
