package interfaceTipo2;

public class ImplementandoInterfacesFilha extends ImplementandoInterfaces {

	public static void main(String[] args) {
		// Inst�ncia da classe
		ImplementandoInterfacesFilha implementandoInterfacesFilha = new ImplementandoInterfacesFilha();

		implementandoInterfacesFilha.multiplicar();
		implementandoInterfacesFilha.subtrair();
		implementandoInterfacesFilha.cubo();

		// Usando Dynamic Method Lookup. Perceba que vale a preced�ncia de
		// override, bem como a execu��o dos m�todos chamados pelo construtor da
		// classe m�e
		System.out.println("-----> Chamando um m�todo usando refer�ncia � interface m�e: ");
		System.out.println();

		IInterfaceMae iInterfaceMae = new ImplementandoInterfacesFilha();
		iInterfaceMae.quadrado();

		System.out.println("-----> Chamando um m�todo usando refer�ncia � interface filha: ");
		System.out.println();

		IInterfaceFilha iInterfaceFilha = new ImplementandoInterfacesFilha();
		iInterfaceFilha.multiplicar();
		iInterfaceFilha.somar();

		System.out.println("-----> Chamando um m�todo usando refer�ncia � interface aninhada: ");
		System.out.println();

		ClasseComInterfaceAninhada.IInterfaceAninhada iInterfaceAninhada = new ImplementandoInterfacesFilha();
		iInterfaceAninhada.dividir();

		System.out.println("-----> Chamando um m�todo da interface m�e usando a interface filha: ");
		System.out.println();

		iInterfaceFilha.quadradoMae();
	}

	// A classe filha deve implementar os m�todos que a classe m�e n�o
	// implementou
	@Override
	public void somar() {
		int resultado = 2 + 2;

		System.out.println("Soma = " + resultado);
		System.out.println();
	}

	@Override
	public void subtrair() {
		int resultado = 2 - 2;

		System.out.println("Subtra��o = " + resultado);
		System.out.println();
	}

	@Override
	public void dividir() {
		int resultado = 2 / 2;

		System.out.println("Divis�o = " + resultado);
		System.out.println();
	}

	@Override
	public void multiplicar() {
		int resultado = 2 * 2;

		System.out.println("Multiplica��o pela classe filha = " + resultado);
		System.out.println();
	}

	// Sobrepondo a um m�todo default
	@Override
	public void quadrado() {
		int resultado = 3 * 3;

		System.out.println("Quadrado de 3 = " + resultado);
		System.out.println();
	}
}
