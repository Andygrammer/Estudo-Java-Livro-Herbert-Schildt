package caso7;

public class ClasseDeApoio2 {

	synchronized void escrever(ClasseDeApoio1 classe1) {
		System.out.println(Thread.currentThread().getName() + " entrou no m�dodo da classe 2");
		System.out.println("Vamos tentar chamar o m�todo da classe 1 usando o m�todo da classe 2");

		System.out.println("Pressione CTRL + C para encerrar esta execu��o.");

		// Neste ponto, quando o objeto da classe 2 tenta chamar um m�todo da
		// classe 1, o objeto da classe 1 est� alocado a um monitor, chamando um
		// m�todo da classe 2 e vice-versa
		// Logo, o objeto 1 � bloqueado ao chamar o m�todo da classe 2, enquanto
		// o objeto 2 espera indefinidamente para que seja poss�vel executar o
		// m�todo da classe 1
		classe1.outroMetodoDaClasse1();
	}

	synchronized void outroMetodoDaClasse2() {
		System.out.println("Dentro de um m�todo da classe 2.");
	}
}
