/* Revis�o do conte�do do Cap�tulo 11 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas pr�ticas de programa��o, contudo o seu cunho � estritamente did�tico
 * 
 * Criando thread implementando a interface Runnable
 * 
 * Por Andr� M. (https://fimdoloop.wordpress.com/)
 */

package caso2;

public class CriandoThreads2 implements Runnable {
	
	Thread thread;
	
	CriandoThreads2(){
		thread = new Thread(this, "Thread filha");
		thread.start();
	}

	public static void main(String[] args) {
		CriandoThreads2 criandoThreads2 = new CriandoThreads2();
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
