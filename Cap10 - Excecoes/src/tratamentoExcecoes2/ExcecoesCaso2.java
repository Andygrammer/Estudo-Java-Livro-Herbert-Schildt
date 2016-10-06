/* Revisão do conteúdo do Capítulo 10 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Revisando try aninhado com exemplo de multi-catch
 * 
 * Por André M. (https://fimdoloop.wordpress.com/)
 */

package tratamentoExcecoes2;

public class ExcecoesCaso2 {

	public static void main(String[] args) {
		int resultado = 5;

		try {
			resultado /= 2;

			try {
				resultado /= 0;
			} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}