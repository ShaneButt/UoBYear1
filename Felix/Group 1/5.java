// Felix Angell - fa302

public class Main {

	public static void main(String[] args) {
		// this is the width and height of the square
		int size = BIO.getInt();

		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				if (y == 0 || y == size - 1) {
					System.out.print('*');
				} 
				else {
					System.out.print(x == 0 || x == size - 1 ? '*' : '.');
				}
			}
			System.out.println();
		}
	}
	
}


