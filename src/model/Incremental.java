package model;

import java.util.concurrent.TimeUnit;

public class Incremental {
	private static Incremental instance;
	private static int count = 0;
	private int numero;
	
	private Incremental() {
		numero = ++count;
	}
	
	public static Incremental getInstance() {
		if (instance == null) {
			synchronized (Incremental.class) {
				if (instance == null) {
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					instance = new Incremental();
				}
			}

//			try {
//				TimeUnit.SECONDS.sleep(2);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			instance = new Incremental();
		}
		return instance;
	}
	
	public String toString() {
		return "Incremental " + numero;
	}

}
