/* Revis�o do conte�do do Cap�tulo 10 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas pr�ticas de programa��o, contudo o seu cunho � estritamente did�tico
 * 
 * Como criar exce��es encadeadas
 * 
 * Por Andr� M. (http://ticomcc.blogspot.com.br)
 */

package tratamentoExcecoes5;

public class ExcecoesCaso5 {
	public static void main(String[] args) {
		// Inst�ncia da classe
		ExcecoesCaso5 excecoesCaso5 = new ExcecoesCaso5();

		try {
			excecoesCaso5.imprimirElementosVetor();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exce��o secund�ria: " + e.getCause());
		}
		
		System.out.println();
		
		try{
			excecoesCaso5.imprimirCausaExcecaoEncadeada();
		}catch(ArithmeticException e){
			System.out.println("Exce��o prim�ria: " + e);
			System.out.println("Causa: " + e.getCause());
		}
	}

	// Inicializar, preencher um vetor e mostrar os seus elementos
	// Se o �ndice corrente for maior ou igual ao tamanho do vetor, tentar
	// dividir por 0
	// Duas exce��es, portanto: �ndice fora dos limites do vetor e divis�o por
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
			System.out.println("Exce��o prim�ria: " + e.getClass());

			throw e;
		}
	}
	
	// Outro exemplo
	private void imprimirCausaExcecaoEncadeada(){
		// Criando uma exce��o
		ArithmeticException arithmeticException = new ArithmeticException("Erro aritm�tico.");
		
		arithmeticException.initCause(new NumberFormatException("Erro no formato do n�mero."));
		
		throw arithmeticException;
		
	}
}
