package ExamplesOfMultitreading;

public class Example3 {

	public static void main(String[] args) {
		Program p=new Program();
		p.setName("number");
		p.start();
		
		
		
		
		
	}

}




class Character 
{


		
}

class Program extends Thread{

	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("number"))
			number();
		else
			character();
		
	}
	
	public void number() {

		System.out.println("Number printing started");
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("Number printing is ended");
		
		
	}
	public void character() {
		System.out.println("Character printing started");
		for(int i=0;i<=10;i++) {
			System.out.println((char)i);
		}
		System.out.println("Character printing is ended");	
		
	}
}
