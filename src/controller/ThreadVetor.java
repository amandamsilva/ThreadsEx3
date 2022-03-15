package controller;

public class ThreadVetor extends Thread {
	
	private int thread;
	
	public ThreadVetor(int thread, int vet[]) {
		this.thread = thread;
	}
	
	public void run(int vet[]) {
		tempo(vet);
		System.out.println(thread);
	}
	
	public void tempo(int[] vet) {
		int j = 0;
		if (thread == 1) {
			long tInicial = System.currentTimeMillis();
			for (int n: vet) {
				System.out.println(vet[j]);
			}
			long tFinal = System.currentTimeMillis();
			long tSegundos = (tFinal - tInicial)/1000;
			System.out.println(tSegundos);
		} else if (thread == 2) {
			long tInicial = System.currentTimeMillis();
			for (int i = 0 ; i < vet.length; i++) {
				System.out.println(vet[i]);
			}
			long tFinal = System.currentTimeMillis();
			long tSegundos = (tFinal - tInicial)/1000;
			System.out.println(tSegundos);
		}
	}

}
