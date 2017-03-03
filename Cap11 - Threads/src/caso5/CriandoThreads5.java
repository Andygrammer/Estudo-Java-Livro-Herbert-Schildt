/* Revis�o do conte�do do Cap�tulo 11 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas pr�ticas de programa��o, contudo o seu cunho � estritamente did�tico
 * 
 * Criando caso de threads que apontam para um m�todo que n�o � synchronized
 * Usa-se um bloco synchronized para tornar o m�todo synchronized sem alterar a sua estrutura
 * 
 * Por Andr� M. (http://ticomcc.blogspot.com.br)
 */

package caso5;

// Classe principal
public class CriandoThreads5 {

	public static void main(String[] args) {
		ClasseDeApoio1 classeAlvo = new ClasseDeApoio1();

		ClasseDeApoio2 objetoThread1 = new ClasseDeApoio2(classeAlvo, 500, 2);
		ClasseDeApoio2 objetoThread2 = new ClasseDeApoio2(classeAlvo, 71, 82);
		ClasseDeApoio2 objetoThread3 = new ClasseDeApoio2(classeAlvo, 27, 8);

		try {
			objetoThread1.thread.join();
			objetoThread2.thread.join();
			objetoThread3.thread.join();
		} catch (InterruptedException e) {
			System.out.println("A thread filha foi interrompida");
		}
	}
}
