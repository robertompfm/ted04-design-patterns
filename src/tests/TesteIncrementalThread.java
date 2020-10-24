package tests;

import model.Incremental;

public class TesteIncrementalThread extends Thread {
//	private Incremental inc = Incremental.getInstance();

	public void run() {
		
		try {
			Incremental inc = Incremental.getInstance();
			System.out.println("Thread " + Thread.currentThread().getId() + ": " + inc);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
