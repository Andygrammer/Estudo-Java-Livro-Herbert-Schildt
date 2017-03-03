/* Revis�o do conte�do do Cap�tulo 10 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas pr�ticas de programa��o, contudo o seu cunho � estritamente did�tico
 * 
 * Revisando um try-catch-finally simples
 * 
 * Por Andr� M. (http://ticomcc.blogspot.com.br)
 */

package tratamentoExcecoes1;

public class ExcecoesCaso1 {
	public static void main(String[] args) {
		int resultado = 5;

		try {
			resultado /= 0;
		}
		// Catch com duas possibilidades de exce��o
		catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) { // Catch contendo uma superclasse
			System.out.println(e);
		} finally {
			System.out.println("O finally sempre executa.");
		}
	}
}
