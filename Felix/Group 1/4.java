// Felix Angell - fa302

public class Main {

	public static void main(String[] args) {
		// this is the width and height of the square
		int size = BIO.getInt();
		
		// because were given one side its always a
		// square (i.e. equal sizes) and not a rectangle
		// so we can do a loop from w * w and then check
		// every w when we need to insert a new line
		for (int i = 0; i < size * size; i++) {
			// insert the newline every time we surpass
			// w amount of iterations
			if (i % size == 0) {
				System.out.println();
			}
			// otherwise we print a nice little asterisks
			System.out.print('*');
		}
	}
	
}


