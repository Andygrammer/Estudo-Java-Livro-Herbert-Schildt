package caso5;

// Classe de apoio à sincronia
// Esta classe contém o método que não é synchronized e por algum motivo não pode ser alterado
// Exemplo: quando um terceiro criou o método e você não está autorizado alterá-lo
public class ClasseDeApoio1 {
	void multiplicar(int numero1, int numero2) {
		System.out.print(numero1 + " * " + numero2 + " = " );
		int resultado = numero1 * numero2;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("A thread filha foi interrompida.");
		}

		System.out.println(resultado);
	}

}
