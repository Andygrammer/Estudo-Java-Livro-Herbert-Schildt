package interfaceTipo3;

public interface IInterfaceComMetodosEstaticos {
	// Uma assinatura de método tradicional (antigo Java)
	void somar();

	// Um método default - novidade do Java 8
	default void subtrair() {
		System.out.println("Subtração = " + Integer.toString(2 - 2));
		System.out.println();
	}

	// Um método estático - novidade do Java 8
	static void multiplicar() {
		System.out.println("Multiplicação = " + 2 * 2);
		System.out.println();
	}

	// Outro método default
	default void dividir() {
		System.out.println("Divisão = " + 2 / 2);
		System.out.println();
	}

	// Outro método estático
	// O método estático de uma interface não pode ser alterado na classe que
	// implementa a interface, pois ele pertence à própria interface
	static void cubo() {
		System.out.println("Cubo = " + 2 * 2 * 2);
		System.out.println();
	}

}
