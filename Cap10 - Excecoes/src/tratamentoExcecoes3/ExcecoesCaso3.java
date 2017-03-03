/* Revis�o do conte�do do Cap�tulo 10 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas pr�ticas de programa��o, contudo o seu cunho � estritamente did�tico
 * 
 * Como lan�ar exce��es (throw e throws)
 * 
 * Por Andr� M. (http://ticomcc.blogspot.com.br)
 */

package tratamentoExcecoes3;

public class ExcecoesCaso3 {
	public static void main(String args[]) {
		try {
			try {
				// For�ando um erro
				throw new ArithmeticException();
			} catch (ArithmeticException e) {
				System.out.println("Tratando o erro for�ado.");
				throw e;
			}
		} catch (ArithmeticException e) {
			System.out.println("Tratando o erro for�ado que foi relan�ado.");
		}

		// Se n�o chamar o m�todo dentro de um try-catch com a exce��o de
		// throws, o m�todo principal precisa fazer throws Exception.
		try {
			testarThrowsClasseUnchecked();
		} catch (NullPointerException e) {
			System.out.println();
			System.out.println("Exce��o atrav�s de throws. Classe unchecked.");
		}

		try {
			testarThrowsClasseChecked();
		} catch (ClassNotFoundException c) {
			System.out.println("Exce��o atrav�s de throws. Classe checked.");
		}
	}

	// Tanto a classe NullPointerException quanto ArithmeticException �
	// unchecked - n�o precisa estar na lista de exce��es throws
	public static void testarThrowsClasseUnchecked() throws ArithmeticException, SecurityException {
		// Este lan�amento � tratado pelo catch implementado pelo m�todo que
		// chama TestarThrows()
		// Perceba que a classe NullPointerException n�o est� na lista de throws
		// e mesmo assim � v�lido, porque esta � uma exce��o unchecked
		throw new NullPointerException();
	}

	// A classe ClassNotFoundException � do tipo checked, ou seja, se n�o
	// estivesse na lista de exce��es throws, ocorreria um erro de compila��o
	public static void testarThrowsClasseChecked() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}
}