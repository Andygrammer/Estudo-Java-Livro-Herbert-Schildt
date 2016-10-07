package caso4;

// Classe de apoio à sincronia
// Esta classe cria a thread
public class ClasseDeApoio2 implements Runnable {
	Thread thread;
	ClasseDeApoio1 classeAlvo; // Aquela classe que contém o método synchronized
	String frase; // Atributo necessário ao método

	// Construtor
	ClasseDeApoio2(ClasseDeApoio1 classeAlvo, String frase) {
		this.classeAlvo = classeAlvo;
		this.frase = frase;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		classeAlvo.imprimirFrases(frase);
	}

}
