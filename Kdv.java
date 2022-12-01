import java.util.Scanner;

public class Kdv {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double result;
		double input;
		
		System.out.println("Fiyat giriniz");
		input = scanner.nextDouble();
		
		if (input > 0 && input <= 1000) {
			result = input +(input * 18/100);
			System.out.println(result);
		}
		else {
			result = input +(input * 6/100);
			System.out.println(result);
		}
		
	}
}
