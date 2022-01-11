package TerminalQuestion;

public class Processor extends Thread {
	private Buffer buffer;
	int data=0;
	public Processor(Buffer buffer) {
		this.buffer=buffer;
	}
	@Override
	public void run() {
		
		while(true) {
			try {
				data=buffer.read();
				Thread.sleep(100);
				System.out.println("Access Granted!! Reading from buffer "+data);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}