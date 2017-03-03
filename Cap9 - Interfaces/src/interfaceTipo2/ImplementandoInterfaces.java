/* Revis�o do conte�do do Cap�tulo 9 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas pr�ticas de programa��o, contudo o seu cunho � estritamente did�tico
 * 
 * Como implementar uma interface que herda de outra e uma interface aninhada usando uma classe abstrata
 * 
 * Por Andr� M. (http://ticomcc.blogspot.com.br)
 */

package interfaceTipo2;

public abstract class ImplementandoInterfaces
		implements IInterfaceFilha, ClasseComInterfaceAninhada.IInterfaceAninhada {

	// O construtor da classe abstrata pode chamar m�todos das interfaces
	// implementadas
	public ImplementandoInterfaces() {
		somar();
		multiplicar(); //Perceba que pela ordem de preced�ncia do Java para override, a classe filha, que tamb�m chama esse m�todo, tem preced�ncia
		dividir();
		quadrado();
	}

	// Override de um m�todo das interfaces implementadas
	// Perceba que como a classe � abstrata, n�o � obrigat�rio o override de
	// todos os m�todos das interfaces
	@Override
	public void multiplicar() {
		int resultado = 1 * 1;

		System.out.println("Multiplica��o pela classe m�e = " + resultado);
		System.out.println();
	}

}
