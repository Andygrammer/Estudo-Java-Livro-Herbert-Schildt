/* Revis�o do conte�do do Cap�tulo 9 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas pr�ticas de programa��o, contudo o seu cunho � estritamente did�tico
 * 
 * Como implementar uma interface com m�todos est�ticos (novidadade do Java 8)
 * 
 * Por Andr� M. (https://fimdoloop.wordpress.com/)
 */

package interfaceTipo3;

public class ImplementandoInterfaces implements IInterfaceComMetodosEstaticos {

	public static void main(String[] args) {
		// Inst�ncia da classe
		IInterfaceComMetodosEstaticos iInterfaceComMetodosEstaticos = new ImplementandoInterfaces();

		iInterfaceComMetodosEstaticos.somar();
		iInterfaceComMetodosEstaticos.subtrair();
		iInterfaceComMetodosEstaticos.dividir();

		// Repare que este m�todo � est�tico (pertence � pr�pria interface onde
		// foi declarado), ent�o n�o aceita uma vari�vel de refer�ncia, mas
		// somente o pr�prio nome por extenso da interface onde foi declarado
		IInterfaceComMetodosEstaticos.multiplicar();
		IInterfaceComMetodosEstaticos.cubo();
	}

	// Apenas o m�todo tradicional precisa sofrer override
	// O m�todo dafault j� possui um corpo e n�o � necess�rio o override
	// O m�todo est�tico n�o precisa ser sobreposto, pois � est�tico, como
	@Override
	public void somar() {
		System.out.println("Soma = " + Integer.toString(2 + 2));
		System.out.println();
	}
	
	// Sobrepondo um m�todo default
	@Override
	public void dividir() {
		System.out.println("Divis�o de 3 = " + 3 / 3);
		System.out.println();
	}
}
