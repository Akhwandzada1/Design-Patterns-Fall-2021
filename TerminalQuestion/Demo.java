package TerminalQuestion;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		Buffer buffer=new Buffer();
		Processor processor=new Processor(buffer);
		Sensor sensor=new Sensor(buffer);
		sensor.start();
		processor.start();
		

	}

}
