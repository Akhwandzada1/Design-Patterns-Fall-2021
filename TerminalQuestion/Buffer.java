package TerminalQuestion;

import java.util.concurrent.Semaphore;

public class Buffer {
	int[] sensorArray=new int[1];
	Semaphore write=new Semaphore(1);
	Semaphore read=new Semaphore(0);	
	public Buffer() {
		
	}
	public void write(int data) throws InterruptedException {
		write.acquire();
		sensorArray[0]=data;
		read.release();
	}
	public int read() throws InterruptedException {
		read.acquire();
		int data=sensorArray[0];
		write.release();
		return data;
	}
}