package ExamplesOfMultitreading;

public class Example2 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("Main");
		t.setPriority(1);
		System.out.println(t);
		One o=new One();
		Thread t1=new Thread(o);
		t1.start();

	}

}

class One implements Runnable{

	@Override
	public void run() {
		Thread t=Thread.currentThread();
		t.setName("One");
		t.setPriority(2);
		System.out.println(t);
		
	}
	
}
