package oopsConcept;

public  class ExampleOfInterface implements Example ,Example1{

	public static void main(String[] args) {
		
		ExampleOfInterface eoi=new ExampleOfInterface();
		eoi.draw();
		eoi.run();
		eoi.talk();
	}

	@Override
	public void draw() {
		System.out.println("Drawing");
		
	}

	@Override
	public void run() {
		System.out.println("Running");
		
	}

	@Override
	public void talk() {
		System.out.println("Talking");
		
	}
	
	

}
