package com.h2kinfosys.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutor {
	
	private static int N = 6;

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(N);
		
		for(int j=0; j < 20; j++) {
			ThreadTask task = new ThreadTask("TN_"+j);
			service.execute(task);
		}
		
		service.shutdown();
	}

}
