package interfaceTipo2;

public class ImplementandoInterfacesFilha extends ImplementandoInterfaces {

	public static void main(String[] args) {
		// Instância da classe
		ImplementandoInterfacesFilha implementandoInterfacesFilha = new ImplementandoInterfacesFilha();

		implementandoInterfacesFilha.multiplicar();
		implementandoInterfacesFilha.subtrair();
		implementandoInterfacesFilha.cubo();

		// Usando Dynamic Method Lookup. Perceba que vale a precedência de
		// override, bem como a execução dos métodos chamados pelo construtor da
		// classe mãe
		System.out.println("-----> Chamando um método usando referência à interface mãe: ");
		System.out.println();

		IInterfaceMae iInterfaceMae = new ImplementandoInterfacesFilha();
		iInterfaceMae.quadrado();

		System.out.println("-----> Chamando um método usando referência à interface filha: ");
		System.out.println();

		IInterfaceFilha iInterfaceFilha = new ImplementandoInterfacesFilha();
		iInterfaceFilha.multiplicar();
		iInterfaceFilha.somar();

		System.out.println("-----> Chamando um método usando referência à interface aninhada: ");
		System.out.println();

		ClasseComInterfaceAninhada.IInterfaceAninhada iInterfaceAninhada = new ImplementandoInterfacesFilha();
		iInterfaceAninhada.dividir();

		System.out.println("-----> Chamando um método da interface mãe usando a interface filha: ");
		System.out.println();

		iInterfaceFilha.quadradoMae();
	}

	// A classe filha deve implementar os métodos que a classe mãe não
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

		System.out.println("Subtração = " + resultado);
		System.out.println();
	}

	@Override
	public void dividir() {
		int resultado = 2 / 2;

		System.out.println("Divisão = " + resultado);
		System.out.println();
	}

	@Override
	public void multiplicar() {
		int resultado = 2 * 2;

		System.out.println("Multiplicação pela classe filha = " + resultado);
		System.out.println();
	}

	// Sobrepondo a um método default
	@Override
	public void quadrado() {
		int resultado = 3 * 3;

		System.out.println("Quadrado de 3 = " + resultado);
		System.out.println();
	}
}
