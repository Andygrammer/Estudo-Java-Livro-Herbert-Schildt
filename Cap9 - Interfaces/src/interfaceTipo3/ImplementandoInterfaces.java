/* Revisão do conteúdo do Capítulo 9 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Como implementar uma interface com métodos estáticos (novidadade do Java 8)
 * 
 * Por André M. (http://ticomcc.blogspot.com.br)
 */

package interfaceTipo3;

public class ImplementandoInterfaces implements IInterfaceComMetodosEstaticos {

	public static void main(String[] args) {
		// Instância da classe
		IInterfaceComMetodosEstaticos iInterfaceComMetodosEstaticos = new ImplementandoInterfaces();

		iInterfaceComMetodosEstaticos.somar();
		iInterfaceComMetodosEstaticos.subtrair();
		iInterfaceComMetodosEstaticos.dividir();

		// Repare que este método é estático (pertence à própria interface onde
		// foi declarado), então não aceita uma variável de referência, mas
		// somente o próprio nome por extenso da interface onde foi declarado
		IInterfaceComMetodosEstaticos.multiplicar();
		IInterfaceComMetodosEstaticos.cubo();
	}

	// Apenas o método tradicional precisa sofrer override
	// O método dafault já possui um corpo e não é necessário o override
	// O método estático não precisa ser sobreposto, pois é estático, como
	@Override
	public void somar() {
		System.out.println("Soma = " + Integer.toString(2 + 2));
		System.out.println();
	}
	
	// Sobrepondo um método default
	@Override
	public void dividir() {
		System.out.println("Divisão de 3 = " + 3 / 3);
		System.out.println();
	}
}
