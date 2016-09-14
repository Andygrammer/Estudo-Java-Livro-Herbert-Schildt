package interfaceTipo2;

public interface IInterfaceFilha extends IInterfaceMae {
	void multiplicar();

	// Também é possível chamar um método da interface mãe usando a
	// palavra-chave super
	default void quadradoMae() {
		IInterfaceMae.super.quadrado();
	}
}