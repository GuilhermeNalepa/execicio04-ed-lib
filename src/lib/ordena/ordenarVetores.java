package lib.ordena;

public class ordenarVetores {

	public ordenarVetores() {
		
		super();
	
	}

	public int[] mergeSort(int[] vt, int inicio, int fim) {
				
		if (inicio < fim) {
			
			int meio = (inicio + fim) / 2;
			
			mergeSort(vt, inicio, meio);
			mergeSort(vt, meio + 1, fim);
			intercala(vt, inicio, meio, fim);
		
		}
		
		return vt;
	}
	
	private void intercala (int[] vt, int inicio, int meio, int fim) {
		
		int aux[] = new int[vt.length];
		
		for(int i = inicio ; i <= fim; i++) {
		
			aux[i] = vt[i];
		
		}
		
		int esquerda = inicio;
		int direita = meio + 1;
		
		for(int i = inicio ; i <= fim ; i++) {
		
			if (esquerda > meio) {
			
				vt[i] = aux[direita];
				
				direita++;
			
			} else if (direita > fim) {
			
				vt[i] = aux[esquerda];
				esquerda++;
			
			} else if (aux[esquerda] < aux[direita]){
			
				vt[i] = aux[esquerda];
				
				esquerda++;
			
			} else {
			
				vt[i] = aux[direita];
				
				direita++;
			
			}
		}
		
	}
	
	
	public int[] bubbleSort(int[] vt) {
		
		int tamanho = vt.length;
		
		for (int i = 0; i < tamanho ; i++) {
			
			for (int j = 0 ; j < tamanho - 1 ; j++) {
				
				if (vt[j] > vt[j + 1]) {
					
					int aux = vt[j];
					vt[j] = vt[j + 1];
					vt[j + 1] = aux;
				
				}
			}
		}
		
		return vt;
	}
}