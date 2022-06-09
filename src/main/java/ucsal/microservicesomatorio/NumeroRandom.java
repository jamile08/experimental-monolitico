package ucsal.microservicesomatorio;

import java.util.ArrayList;
import java.util.Random;

public class NumeroRandom {

	public static void main(String[] args) {

		ArrayList<Integer> list = getRandomNonRepeatingIntegers(100, 1, 10000);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println("******");
		System.out.println("tamanho:" + list.size());
	}

	public static int getRandomInt(int min, int max) {
		Random random = new Random();

		return random.nextInt((max - min) + 1) + min; 
	}

	public static ArrayList<Integer> getRandomNonRepeatingIntegers(int size, int min, int max) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		while (numbers.size() < size) {
			int random = getRandomInt(min, max);

			if (!numbers.contains(random)) {
				numbers.add(random);
			}
		}
		return numbers;
	}
}
