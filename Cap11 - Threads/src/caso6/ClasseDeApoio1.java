package caso6;

// Classe com métodos synchronized
public class ClasseDeApoio1 {
	boolean lutadorPreparado = false;

	synchronized void prepararParaLutarPeso(float pesoLutador) throws InterruptedException {
		while (lutadorPreparado) {
			wait();
		}
		System.out.print("PESANDO " + pesoLutador + "kg, ");
		lutadorPreparado = true;
		notify();
	}

	synchronized void prepararParaLutarNome(String nomeLutador) throws InterruptedException {
		while (!lutadorPreparado) {
			wait();
		}

		System.out.print(nomeLutador.toUpperCase() + "!!!");
		lutadorPreparado = false;
		notifyAll();
	}
}
