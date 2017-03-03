/* Revisão do conteúdo do Capítulo 11 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Utilizando os métodos de comunicação entre threads
 * wait(), notify() e notifyAll()
 * 
 * Por André M. (http://ticomcc.blogspot.com.br)
 */

package caso6;

public class CriandoThreads6 {
	public static void main(String[] args) throws InterruptedException {
		ClasseDeApoio1 objetoAlvo = new ClasseDeApoio1();

		ClasseDeApoio2 lutador1 = new ClasseDeApoio2(objetoAlvo, "Michael Bisping", 84f);
		ClasseDeApoio3 lutador2 = new ClasseDeApoio3(objetoAlvo, "Ronaldo Jacaré", 84f);

		lutador1.thread.join();

		ClasseDeApoio2 lutador3 = new ClasseDeApoio2(objetoAlvo, "Miesha Tate", 61f);
		ClasseDeApoio3 lutador4 = new ClasseDeApoio3(objetoAlvo, "Amanda Nunes", 61f);
		
		lutador3.thread.join();

		ClasseDeApoio2 lutador5 = new ClasseDeApoio2(objetoAlvo, "T.J. Dillashaw", 61f);
		ClasseDeApoio3 lutador6 = new ClasseDeApoio3(objetoAlvo, "Dominick Cruz", 61f);
		
		lutador5.thread.join();

		ClasseDeApoio2 lutador7 = new ClasseDeApoio2(objetoAlvo, "José Aldo", 66f);
		ClasseDeApoio3 lutador8 = new ClasseDeApoio3(objetoAlvo, "Frankie Edgar", 66f);
		
		lutador7.thread.join();
	}
}
