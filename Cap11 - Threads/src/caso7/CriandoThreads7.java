/* Revisão do conteúdo do Capítulo 11 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Um exemplo de deadlock
 * 
 * Por André M. (http://ticomcc.blogspot.com.br)
 */

package caso7;

public class CriandoThreads7 implements Runnable {
	
	ClasseDeApoio1 classe1 = new ClasseDeApoio1();
	ClasseDeApoio2 classe2 = new ClasseDeApoio2();
	
	CriandoThreads7() {
		Thread.currentThread().setName("Thread principal/mãe");
		Thread thread = new Thread(this, "Thread filha");
		thread.start();
		
		System.out.println("Thread principal/mãe.");
		classe1.escrever(classe2);
	}

	public static void main(String[] args) {
		new CriandoThreads7();
	}

	@Override
	public void run() {
		System.out.println("Thread filha.");
		classe2.escrever(classe1);	
	}
}
