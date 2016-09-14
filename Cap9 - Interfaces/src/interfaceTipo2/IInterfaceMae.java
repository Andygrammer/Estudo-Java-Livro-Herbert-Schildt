package interfaceTipo2;

public interface IInterfaceMae {
	public void somar(); // Public � redundante, pois, por default, m�todos de
							// interfaces s�o public

	void subtrair();

	default void quadrado() { // A partir do Java 8 � poss�vel criar
								// m�todos com corpo dentro de
								// interfaces
		System.out.println("Quadrado de 2 = " + 2 * 2);
		System.out.println();
	}

	default void cubo() {
		System.out.println("Cubo = " + 2 * 2 * 2);
		System.out.println();
	}
}
