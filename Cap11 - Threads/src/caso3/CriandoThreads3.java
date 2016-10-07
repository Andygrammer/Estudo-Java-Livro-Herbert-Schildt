/* Revisão do conteúdo do Capítulo 11 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Criando caso em que duas threads imprimem mensagem de forma não sincronizada
 * Observação: a thread mãe deve terminar depois da thread filha
 * 
 * Por André M. (https://fimdoloop.wordpress.com/)
 */

package caso3;

public class CriandoThreads3 implements Runnable {
	
	Thread thread;
	
	CriandoThreads3(){
		thread = new Thread(this, "Thread filha");
		thread.start();
	}

	public static void main(String[] args) {
		CriandoThreads3 criandoThreads3 = new CriandoThreads3();
		
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Thread mãe contando: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("A thread mãe foi interrompida.");
		}
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Thread filha contando: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("A thread filha foi interrompida.");
		}
	}
}
