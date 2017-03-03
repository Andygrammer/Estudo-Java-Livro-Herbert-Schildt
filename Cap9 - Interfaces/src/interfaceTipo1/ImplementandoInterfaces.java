/* Revis�o do conte�do do Cap�tulo 9 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas pr�ticas de programa��o, contudo o seu cunho � estritamente did�tico
 * 
 * Como implementar uma interface simples com e sem Dynamic Method Lookup 
 * 
 * Por Andr� M. (https://fimdoloop.wordpress.com/)
 */

package interfaceTipo1;

public class ImplementandoInterfaces implements IInterfaceSimples {

	public static void main(String args[]) {
		ImplementandoInterfaces implementandoInterfaces = new ImplementandoInterfaces();
		implementandoInterfaces.ChamarMetodosInterfaceSemRerefencia(implementandoInterfaces);
		implementandoInterfaces.ChamarMetodosInterfaceComRerefencia();
	}

	public void ChamarMetodosInterfaceSemRerefencia(ImplementandoInterfaces implementandoInterfaces) {
		implementandoInterfaces.somar();
		implementandoInterfaces.subtrair();

		// Perceba que n�o h� override do m�todo default a seguir
		System.out.println(implementandoInterfaces.retornarUmaString());
		System.out.println();
	}

	public void ChamarMetodosInterfaceComRerefencia() {
		// Cria��o da refer�ncia da interface
		IInterfaceSimples iInterfaceSimples = new ImplementandoInterfaces();

		iInterfaceSimples.somar();
		iInterfaceSimples.subtrair();
		iInterfaceSimples.retornarUmaString();
	}

	// Override dos m�todos da interface implementada
	@Override
	public void somar() {
		int resultado = 1 + 1;

		System.out.println("Soma = " + resultado);
		System.out.println();
	}

	@Override
	public void subtrair() {
		int resultado = 1 - 1;

		System.out.println("Subtra��o = " + resultado);
		System.out.println();
	}
}
