package caso8;

public class ClasseDeApoio1 implements Runnable {
	String nomeThread;
	Thread thread;
	boolean threadFlag;

	ClasseDeApoio1(String nomeThread) {
		this.nomeThread = nomeThread;
		thread = new Thread(this, this.nomeThread);
		threadFlag = false;
		thread.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 10; i > 0; i--) {
				System.out.println(nomeThread + ": " + i + "; Status: " + thread.getState());
				Thread.sleep(200);
				
				synchronized (this) {
					while (threadFlag) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println("A " + nomeThread + " foi interompida.");
		}
		System.out.println("Finalizando a " + nomeThread);
	}

	synchronized void suspenderThread() {
		threadFlag = true;
	}

	synchronized void continuarThread() {
		threadFlag = false;
		notify();
	}
}
