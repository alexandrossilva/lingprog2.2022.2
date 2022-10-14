package atividade3;

public class Main {

	public static void main(String[] args) {
		
		
		triangular r1 = new triangular( 0, 100 );
		
		System.out.println(201.0 / 2);
		
		Thread t1 = new Thread(r1);
		
		t1.start();
		
		

		
	}

}
