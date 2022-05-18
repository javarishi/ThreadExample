package com.h2kinfosys.executor;

public class ThreadTask implements Runnable {
	
	private String threadNumber;
	
	public ThreadTask(String taskNumber) {
		this.threadNumber =  taskNumber;
	}

	@Override
	public void run() {
		
		System.out.println("Task Number :: " 
		+ this.threadNumber + " Thread :: " + Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		processDBCall();
	}

	public synchronized String processDBCall() {
		return System.currentTimeMillis() + Thread.currentThread().getName(); 
	}

}
