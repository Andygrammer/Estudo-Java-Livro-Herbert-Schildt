package interfaceTipo2;

public interface IInterfaceMae {
	public void somar(); // Public é redundante, pois, por default, métodos de
							// interfaces são public

	void subtrair();

	default void quadrado() { // A partir do Java 8 é possível criar
								// métodos com corpo dentro de
								// interfaces
		System.out.println("Quadrado de 2 = " + 2 * 2);
		System.out.println();
	}

	default void cubo() {
		System.out.println("Cubo = " + 2 * 2 * 2);
		System.out.println();
	}
}
