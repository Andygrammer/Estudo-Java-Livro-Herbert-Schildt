package caso7;

public class ClasseDeApoio2 {

	synchronized void escrever(ClasseDeApoio1 classe1) {
		System.out.println(Thread.currentThread().getName() + " entrou no médodo da classe 2");
		System.out.println("Vamos tentar chamar o método da classe 1 usando o método da classe 2");

		System.out.println("Pressione CTRL + C para encerrar esta execução.");

		// Neste ponto, quando o objeto da classe 2 tenta chamar um método da
		// classe 1, o objeto da classe 1 está alocado a um monitor, chamando um
		// método da classe 2 e vice-versa
		// Logo, o objeto 1 é bloqueado ao chamar o método da classe 2, enquanto
		// o objeto 2 espera indefinidamente para que seja possível executar o
		// método da classe 1
		classe1.outroMetodoDaClasse1();
	}

	synchronized void outroMetodoDaClasse2() {
		System.out.println("Dentro de um método da classe 2.");
	}
}
