package app;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(new InputStreamReader(System.in));
		int n;
		System.out.print("Escribe el numero decimal que desea convertir a binario: ");
		n=keyBoard.nextInt();
		if (n>0) {
			System.out.println(Convert.toBinary(n));
		}else{
			System.out.println("000");
		}

	}

}
