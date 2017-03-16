package br.com.alura.runner;

import java.util.Random;

public class TestaRandom {

	public static void main(String[] args) {

		for (int i = 0; i < 49; i++) {
			System.out.println(new Random().nextDouble());
		}

	}

}
