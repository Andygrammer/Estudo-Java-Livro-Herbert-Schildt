package interfaceTipo3;

public interface IInterfaceComMetodosEstaticos {
	// Uma assinatura de m�todo tradicional (antigo Java)
	void somar();

	// Um m�todo default - novidade do Java 8
	default void subtrair() {
		System.out.println("Subtra��o = " + Integer.toString(2 - 2));
		System.out.println();
	}

	// Um m�todo est�tico - novidade do Java 8
	static void multiplicar() {
		System.out.println("Multiplica��o = " + 2 * 2);
		System.out.println();
	}

	// Outro m�todo default
	default void dividir() {
		System.out.println("Divis�o = " + 2 / 2);
		System.out.println();
	}

	// Outro m�todo est�tico
	// O m�todo est�tico de uma interface n�o pode ser alterado na classe que
	// implementa a interface, pois ele pertence � pr�pria interface
	static void cubo() {
		System.out.println("Cubo = " + 2 * 2 * 2);
		System.out.println();
	}

}
