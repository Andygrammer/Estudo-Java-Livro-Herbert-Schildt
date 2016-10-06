/* Revis�o do conte�do do Cap�tulo 10 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas pr�ticas de programa��o, contudo o seu cunho � estritamente did�tico
 * 
 * Revisando try aninhado com exemplo de multi-catch
 * 
 * Por Andr� M. (https://fimdoloop.wordpress.com/)
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