/* Revisão do conteúdo do Capítulo 11 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Criando caso de threads com método synchronized. O método imprime frases célebres
 * 
 * Por André M. (http://ticomcc.blogspot.com.br)
 */

package caso4;

// Classe principal
public class CriandoThreads4 {
	static String frase1 = "A vingança nunca é plena, mata a alma e a envenena.";
	static String frase2 = "As pessoas boas devem amar seu inimigos.";
	static String frase3 = "Posso não ter um centavo no bolso, mas tenho um sorriso no rosto e isso vale mais que todo dinheiro do mundo.";

	public static void main(String[] args) {
		ClasseDeApoio1 classeAlvo = new ClasseDeApoio1();

		ClasseDeApoio2 objetoThread1 = new ClasseDeApoio2(classeAlvo, frase1);
		ClasseDeApoio2 objetoThread2 = new ClasseDeApoio2(classeAlvo, frase2);
		ClasseDeApoio2 objetoThread3 = new ClasseDeApoio2(classeAlvo, frase3);

		// Aguardar pelo fim da execução de cada thread
		try {
			objetoThread1.thread.join();
			objetoThread2.thread.join();
			objetoThread3.thread.join();
		} catch (InterruptedException e) {
			System.out.println("A thread filha foi interrompida");
		}
	}
}
