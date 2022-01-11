package TerminalQuestion;

import java.util.Random;

public class Sensor extends Thread {
	private Buffer buffer;
	public Sensor(Buffer buffer) {
		this.buffer=buffer;
	}
	@Override
	public void run() {
		Random random=new Random();
		while(true) {
			int n=random.nextInt();
			try {
				buffer.write(n);
				Thread.sleep(100);
				System.out.println("Access Granted !!! Writing on buffer successfull "+n);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
