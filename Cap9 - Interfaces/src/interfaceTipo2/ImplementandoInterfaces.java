/* Revisão do conteúdo do Capítulo 9 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Como implementar uma interface que herda de outra e uma interface aninhada usando uma classe abstrata
 * 
 * Por André M. (https://fimdoloop.wordpress.com/)
 */

package interfaceTipo2;

public abstract class ImplementandoInterfaces
		implements IInterfaceFilha, ClasseComInterfaceAninhada.IInterfaceAninhada {

	// O construtor da classe abstrata pode chamar métodos das interfaces
	// implementadas
	public ImplementandoInterfaces() {
		somar();
		multiplicar(); //Perceba que pela ordem de precedência do Java para override, a classe filha, que também chama esse método, tem precedência
		dividir();
		quadrado();
	}

	// Override de um método das interfaces implementadas
	// Perceba que como a classe é abstrata, não é obrigatório o override de
	// todos os métodos das interfaces
	@Override
	public void multiplicar() {
		int resultado = 1 * 1;

		System.out.println("Multiplicação pela classe mãe = " + resultado);
		System.out.println();
	}

}
