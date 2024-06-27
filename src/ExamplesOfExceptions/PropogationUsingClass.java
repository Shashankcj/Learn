package ExamplesOfExceptions;

public class PropogationUsingClass {

	public static void main(String[] args) throws Exception{
		try {
		First f=new First();
		f.a();
		
		
		}
		
		catch (Exception e) {
			System.out.println(e);
			
			Second s=new Second();
			s.a();
		}
	}

}
