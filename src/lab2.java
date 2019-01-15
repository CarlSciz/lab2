import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		double length;
		double width;
		double area;
		double perimeter;
		String cont = "y";
		int i = 0; 
		
		Scanner scnr = new Scanner(System.in);
		
		while (cont.charAt(0) == 'y'|| cont.charAt(0) == 'Y') {
		i += 1;
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		System.out.println("Enter Length");
		length = scnr.nextDouble();
		
		System.out.println("Enter Width");
		width = scnr.nextDouble();
		scnr.nextLine();
		
		area = length*width;
		perimeter = 2 * (length + width);
		System.out.println("Area " + area);
		System.out.println("Perimeter " + perimeter);
		
		System.out.print("Continue? (y/n)");
		cont = scnr.nextLine();
		}
		scnr.close();
	}

}
