package caso5;

// Classe de apoio � sincronia
// Esta classe cont�m o m�todo que n�o � synchronized e por algum motivo n�o pode ser alterado
// Exemplo: quando um terceiro criou o m�todo e voc� n�o est� autorizado alter�-lo
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
