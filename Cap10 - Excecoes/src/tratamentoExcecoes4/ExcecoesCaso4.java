/* Revisão do conteúdo do Capítulo 10 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Como criar a sua própria classe de exceções
 * 
 * Por André M. (https://fimdoloop.wordpress.com/)
 */

package tratamentoExcecoes4;

public class ExcecoesCaso4 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String excecao;

	ExcecoesCaso4() {
		excecao = "A string não pode conter a palavra \"Errado\".";
	}

	public static void main(String[] args) {
		try {
			testarString("Testando 123");
			testarString("Algo está errado");
		} catch (ExcecoesCaso4 e) {
			System.out.println(e);
		}
	}

	public static void testarString(String nome) throws ExcecoesCaso4 {
		if ((nome.toLowerCase()).contains("errado")) {
			throw new ExcecoesCaso4();
		}
	}

	// Uma boa prática é sobrescrever o método toString()
	@Override
	public String toString() {
		return "Exceção encontrada: " + excecao;
	}

}
