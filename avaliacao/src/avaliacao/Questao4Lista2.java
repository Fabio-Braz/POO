package avaliacao;

import java.util.Random;
import java.util.Scanner;

public class Questao4Lista2 {
	public static void main(String[] args) {
		Random random = new Random();
		int array[] = new int[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println("Array normal: " + array[i]);
		}
		System.out.println("INVERS�O!");
		for(int i = array.length-1; i >= 0 ; i--) {
			System.out.println("Array invertido: " + array[i]);
		}
	}
}
