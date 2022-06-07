package sequencia;

public class TestesSequenciaArray {

	public static void main(String[] args) throws SequenciaVaziaException {
		SequenciaArray sequencia0 = new SequenciaArray(2);
		System.out.println("Metodos de Vetor: ");
		sequencia0.insertAtRank(0, 10);
		sequencia0.insertAtRank(1, 20);
		sequencia0.insertAtRank(2, 30);
		sequencia0.insertAtRank(3, 40);
		sequencia0.insertAtRank(0, 50);
		sequencia0.mostrar();
		System.out.println("------");
		int rank = 1;
		System.out.println("Elemento no rank " + rank + ": " + sequencia0.elemAtRank(rank));
		System.out.println("Subtitu�do: " + sequencia0.replaceAtRank(rank, 500));
		System.out.println("Retirado: " + sequencia0.removeAtRank(0));
		System.out.println("------");
		sequencia0.mostrar();
		System.out.println("------");
		sequencia0.insertAtRank(2, 60);
		sequencia0.mostrar();
		System.out.println("Tamanho: " + sequencia0.size());
		System.out.println("Est� vazio: " + sequencia0.isEmpty());
		System.out.println("----------------------");
		
		
		
		System.out.println("Metodos de Lista: ");
		SequenciaArray sequencia1 = new SequenciaArray(2);
		System.out.println("Vetor 1:");
		sequencia1.insertFirst(10);
		sequencia1.insertFirst(20);
		sequencia1.insertFirst(30);
		sequencia1.insertFirst(40);
		sequencia1.mostrar();
		System.out.println("Tamanho: " + sequencia1.size());
		System.out.println("Vazio: " + sequencia1.isEmpty());
		System.out.println("Primeiro: " + sequencia1.first());
		System.out.println("�ltimo: " + sequencia1.last());
		
		System.out.println("--------------------");
		System.out.println("Retirado: " + sequencia1.remove(0));
		System.out.println("Vetor 1:");
		sequencia1.mostrar();
		System.out.println("Tamanho: " + sequencia1.size());
		
		System.out.println("--------------------");
		SequenciaArray Sequencia3 = new SequenciaArray(2);
		System.out.println("Vetor 2:");
		Sequencia3.insertLast(10);
		Sequencia3.insertLast(20);
		Sequencia3.insertLast(30);
		Sequencia3.insertLast(40);
		Sequencia3.mostrar();
		System.out.println("Ap�s do �ndice 2: " + Sequencia3.after(2));
		System.out.println("Antes do �ndice 2: " + Sequencia3.before(2));
		
		System.out.println("--------------------");
		System.out.println("Vetor 2:");
		Sequencia3.insertBefore(0, 50);
		Sequencia3.insertAfter(4, 60);
		Sequencia3.mostrar();
		
		System.out.println("--------------------");
		System.out.println("Vetor 2:");
		Sequencia3.swapElements(0, 1);
		Sequencia3.replaceElement(2, 100);
		Sequencia3.mostrar();
	}

}
