/* Revisão do conteúdo do Capítulo 9 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Como implementar uma interface simples com e sem Dynamic Method Lookup 
 * 
 * Por André M. (http://ticomcc.blogspot.com.br)
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

		// Perceba que não há override do método default a seguir
		System.out.println(implementandoInterfaces.retornarUmaString());
		System.out.println();
	}

	public void ChamarMetodosInterfaceComRerefencia() {
		// Criação da referência da interface
		IInterfaceSimples iInterfaceSimples = new ImplementandoInterfaces();

		iInterfaceSimples.somar();
		iInterfaceSimples.subtrair();
		iInterfaceSimples.retornarUmaString();
	}

	// Override dos métodos da interface implementada
	@Override
	public void somar() {
		int resultado = 1 + 1;

		System.out.println("Soma = " + resultado);
		System.out.println();
	}

	@Override
	public void subtrair() {
		int resultado = 1 - 1;

		System.out.println("Subtração = " + resultado);
		System.out.println();
	}
}
