package caso4;

// Classe de apoio � sincronia
// Esta classe cria a thread
public class ClasseDeApoio2 implements Runnable {
	Thread thread;
	ClasseDeApoio1 classeAlvo; // Aquela classe que cont�m o m�todo synchronized
	String frase; // Atributo necess�rio ao m�todo

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
