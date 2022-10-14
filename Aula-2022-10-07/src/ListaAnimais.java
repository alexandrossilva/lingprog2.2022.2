import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListaAnimais {

	public static void main(String[] args) {
		final int QTD = 3;
		Scanner scanner = new Scanner(System.in);
		
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		
		for (int i = 1; i <= QTD; i++) {
			System.out.print("Animal " + i + ": ");
			String animal = scanner.nextLine();
			l1.add(animal);
		}
		
		Iterator<String> iterador = l1.iterator();
		
		while (iterador.hasNext()) {
			String animal = iterador.next();
			if (animal.length() >= 5) {
				iterador.remove();
				l2.add(animal);
			}
		}
		
		System.out.println("Lista 1: " + l1);
		System.out.println("Lista 2: " + l2);

		scanner.close();
	}

}
