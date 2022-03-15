package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {

		int[] vet = new int[1000];

		for (int i = 0; i < 1000; i++) {
			vet[i] = (int) (Math.random() * 10) + 1;
		}
		
		for (int thread = 1; thread < 3; thread++) {
			Thread threads = new ThreadVetor(thread, vet);
			threads.start();
		}
		
		ThreadVetor v = new ThreadVetor(0, vet);
		v.tempo(vet);

	}

}
