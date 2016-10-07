/* Revisão do conteúdo do Capítulo 11 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Criando thread estendendo a classe Thread
 * 
 * Por André M. (https://fimdoloop.wordpress.com/)
 */

package caso1;

public class CriandoThreads1 extends Thread {

	Thread thread;

	CriandoThreads1() {
		thread = new Thread(this, "Thread filha");
		thread.start();
	}

	public static void main(String[] args) {
		CriandoThreads1 criandoThreads1 = new CriandoThreads1();
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Thread filha contando: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("A thread filha foi interrompida.");
		}
	}

}
