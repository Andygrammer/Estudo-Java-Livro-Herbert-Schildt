/* Revisão do conteúdo do Capítulo 11 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Utilizando os métodos de comunicação entre threads com uma variável booleana de controle (threadFlag) e enum de estado (método getState())
 * Observação: notar a diferença da saída de cada execução
 * 
 * Por André M. (https://fimdoloop.wordpress.com/)
 */

package caso8;

public class CriandoThreads8 {

	public static void main(String[] args) {
		ClasseDeApoio1 objetoThread1 = new ClasseDeApoio1("Thread filha 1");
		ClasseDeApoio1 objetoThread2 = new ClasseDeApoio1("Thread filha 2");

		try {
			Thread.sleep(500);
			objetoThread1.suspenderThread();
			System.out.println("Thread filha 1 em espera");

			Thread.sleep(700);
			System.out.println("Continuando a thread filha 1");
			objetoThread1.continuarThread();

			Thread.sleep(200);
			objetoThread2.suspenderThread();
			System.out.println("Thread filha 2 em espera");

			Thread.sleep(600);
			System.out.println("Continuando a thread filha 2");
			objetoThread2.continuarThread();

		} catch (InterruptedException e) {
			System.out.println("A thread principal foi interompida.");
		}

		try {
			System.out.println("Aguardando as threads filhas terminar.");
			objetoThread1.thread.join();
			objetoThread2.thread.join();

			if (objetoThread1.thread.getState() == Thread.State.TERMINATED
					&& objetoThread2.thread.getState() == Thread.State.TERMINATED) {
				System.out.println("Threads filhas terminadas. Status: " + objetoThread1.thread.getState());
			}
		} catch (InterruptedException e) {
			System.out.println("A thread principal foi interompida.");
		}
		System.out.println("Finalizando a thread principal/mãe");
	}
}
