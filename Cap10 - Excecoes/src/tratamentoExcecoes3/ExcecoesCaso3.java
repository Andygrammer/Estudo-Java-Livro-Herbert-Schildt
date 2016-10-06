/* Revisão do conteúdo do Capítulo 10 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Como lançar exceções (throw e throws)
 * 
 * Por André M. (https://fimdoloop.wordpress.com/)
 */

package tratamentoExcecoes3;

public class ExcecoesCaso3 {
	public static void main(String args[]) {
		try {
			try {
				// Forçando um erro
				throw new ArithmeticException();
			} catch (ArithmeticException e) {
				System.out.println("Tratando o erro forçado.");
				throw e;
			}
		} catch (ArithmeticException e) {
			System.out.println("Tratando o erro forçado que foi relançado.");
		}

		// Se não chamar o método dentro de um try-catch com a exceção de
		// throws, o método principal precisa fazer throws Exception.
		try {
			testarThrowsClasseUnchecked();
		} catch (NullPointerException e) {
			System.out.println();
			System.out.println("Exceção através de throws. Classe unchecked.");
		}

		try {
			testarThrowsClasseChecked();
		} catch (ClassNotFoundException c) {
			System.out.println("Exceção através de throws. Classe checked.");
		}
	}

	// Tanto a classe NullPointerException quanto ArithmeticException é
	// unchecked - não precisa estar na lista de exceções throws
	public static void testarThrowsClasseUnchecked() throws ArithmeticException, SecurityException {
		// Este lançamento é tratado pelo catch implementado pelo método que
		// chama TestarThrows()
		// Perceba que a classe NullPointerException não está na lista de throws
		// e mesmo assim é válido, porque esta é uma exceção unchecked
		throw new NullPointerException();
	}

	// A classe ClassNotFoundException é do tipo checked, ou seja, se não
	// estivesse na lista de exceções throws, ocorreria um erro de compilação
	public static void testarThrowsClasseChecked() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}
}