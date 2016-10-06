/* Revisão do conteúdo do Capítulo 10 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Como criar exceções encadeadas
 * 
 * Por André M. (https://fimdoloop.wordpress.com/)
 */

package tratamentoExcecoes5;

public class ExcecoesCaso5 {
	public static void main(String[] args) {
		// Instância da classe
		ExcecoesCaso5 excecoesCaso5 = new ExcecoesCaso5();

		try {
			excecoesCaso5.imprimirElementosVetor();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceção secundária: " + e.getCause());
		}
		
		System.out.println();
		
		try{
			excecoesCaso5.imprimirCausaExcecaoEncadeada();
		}catch(ArithmeticException e){
			System.out.println("Exceção primária: " + e);
			System.out.println("Causa: " + e.getCause());
		}
	}

	// Inicializar, preencher um vetor e mostrar os seus elementos
	// Se o índice corrente for maior ou igual ao tamanho do vetor, tentar
	// dividir por 0
	// Duas exceções, portanto: índice fora dos limites do vetor e divisão por
	// zero
	private void imprimirElementosVetor() {
		int[] vetorExemplo = new int[5];
		try {
			for (int cont = 0; cont <= vetorExemplo.length; cont++) {
				if (cont == 5) {
					int elementoVetor = vetorExemplo[5] / 0;
				}
				vetorExemplo[cont] = cont;
				System.out.println(vetorExemplo[cont]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.initCause(new ArithmeticException());
			System.out.println("Exceção primária: " + e.getClass());

			throw e;
		}
	}
	
	// Outro exemplo
	private void imprimirCausaExcecaoEncadeada(){
		// Criando uma exceção
		ArithmeticException arithmeticException = new ArithmeticException("Erro aritmético.");
		
		arithmeticException.initCause(new NumberFormatException("Erro no formato do número."));
		
		throw arithmeticException;
		
	}
}
