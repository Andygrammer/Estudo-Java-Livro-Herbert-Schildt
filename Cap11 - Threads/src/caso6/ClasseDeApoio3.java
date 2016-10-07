package caso6;

// Classe para o lutador 2
public class ClasseDeApoio3 implements Runnable {
	String nomeLutador;
	float pesoLutador;
	ClasseDeApoio1 objetoAlvo; // Instância para métodos synchronized
	Thread thread;

	ClasseDeApoio3(ClasseDeApoio1 objetoAlvo, String nomeLutador, float pesoLutador) {
		this.objetoAlvo = objetoAlvo;
		this.nomeLutador = nomeLutador;
		this.pesoLutador = pesoLutador;

		thread = new Thread(this, "Thread do segundo lutador");
		thread.start();
	}

	@Override
	public void run() {
		try {
			objetoAlvo.prepararParaLutarPeso(pesoLutador);
			objetoAlvo.prepararParaLutarNome(nomeLutador);
		} catch (InterruptedException e) {
			System.out.print("A thread filha foi interrompida.");
		}

		System.out.println("[CANTO AZUL]");
	}
}
