package caso4;

// Classe de apoio � sincronia
// Esta classe cont�m o m�todo synchronized
// Experimente remover a palavra-chave synchronized para notar a diferen�a
// Portanto, synchronized evita race conditions
public class ClasseDeApoio1 {
	synchronized void imprimirFrases(String frase) {
		System.out.print("\"" + frase);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("A thread filha foi interrompida.");
		}

		System.out.print("\" - Seu Madruga.");
		System.out.println();
	}
}