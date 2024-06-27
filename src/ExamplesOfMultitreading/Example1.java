package ExamplesOfMultitreading;

public class Example1 {

	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		System.out.println(t);
		First f=new First();
		f.start();

	}

}
class First extends Thread{
	
	public void run() {
		
		Thread t=Thread.currentThread();
		System.out.println(t);
		
	}
}
