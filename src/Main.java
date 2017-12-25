import java.util.stream.Stream;

public class Main {

	
	private static void printSquares(final Figure... figures) {
        Stream.of(figures).forEach(f ->
                System.out.printf("%s square = %f%n", f.toString(), f.square()));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printSquares(new Rectangle(3, 4), new Circle(2));	
		
		

	}

}
