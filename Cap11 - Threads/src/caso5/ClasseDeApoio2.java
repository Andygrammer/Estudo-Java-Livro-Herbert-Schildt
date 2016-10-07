package caso5;

// Classe de apoio à sincronia
// Esta classe cria a thread
public class ClasseDeApoio2 implements Runnable {
	Thread thread;
	ClasseDeApoio1 classeAlvo;
	int numero1, numero2;

	ClasseDeApoio2(ClasseDeApoio1 classeAlvo, int numero1, int numero2) {
		this.classeAlvo = classeAlvo;
		this.numero1 = numero1;
		this.numero2 = numero2;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		synchronized (classeAlvo) {
			classeAlvo.multiplicar(numero1, numero2);
		}

		// Comente o bloco acima e descomente a linha abaixo para notar a
		// diferença
		
		// classeAlvo.multiplicar(numero1, numero2);
	}
}
