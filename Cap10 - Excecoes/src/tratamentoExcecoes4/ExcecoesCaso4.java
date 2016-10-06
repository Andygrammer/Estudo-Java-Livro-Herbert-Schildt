/* Revis�o do conte�do do Cap�tulo 10 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas pr�ticas de programa��o, contudo o seu cunho � estritamente did�tico
 * 
 * Como criar a sua pr�pria classe de exce��es
 * 
 * Por Andr� M. (https://fimdoloop.wordpress.com/)
 */

package tratamentoExcecoes4;

public class ExcecoesCaso4 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String excecao;

	ExcecoesCaso4() {
		excecao = "A string n�o pode conter a palavra \"Errado\".";
	}

	public static void main(String[] args) {
		try {
			testarString("Testando 123");
			testarString("Algo est� errado");
		} catch (ExcecoesCaso4 e) {
			System.out.println(e);
		}
	}

	public static void testarString(String nome) throws ExcecoesCaso4 {
		if ((nome.toLowerCase()).contains("errado")) {
			throw new ExcecoesCaso4();
		}
	}

	// Uma boa pr�tica � sobrescrever o m�todo toString()
	@Override
	public String toString() {
		return "Exce��o encontrada: " + excecao;
	}

}
