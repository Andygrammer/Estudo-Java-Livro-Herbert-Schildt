package interfaceTipo2;

public interface IInterfaceFilha extends IInterfaceMae {
	void multiplicar();

	// Tamb�m � poss�vel chamar um m�todo da interface m�e usando a
	// palavra-chave super
	default void quadradoMae() {
		IInterfaceMae.super.quadrado();
	}
}