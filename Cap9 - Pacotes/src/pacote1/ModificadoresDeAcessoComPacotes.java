/* Revisão do conteúdo do Capítulo 9 do livro Java The Complete Reference Ninth Edition - Herbert Schildt
 * Com este exemplo pretende-se respeitar as boas práticas de programação, contudo o seu cunho é estritamente didático
 * 
 * Como é a abrangência dos Modificadores de Acesso (Access Modifiers) ao se utilizar pacotes
 * 
 * Por André M. (https://fimdoloop.wordpress.com/)
 */

package pacote1;

import pacote2.ClasseDeApoio3;
import pacote2.ClasseDeApoio4;

public class ModificadoresDeAcessoComPacotes {

	String variavel1 = "Variável 1: Sem modificador";
	public String variavel2 = "Variável 2: Pública";
	protected String variavel3 = "Variável 3: Protegida";
	private String variavel4 = "Variável 4: Privada";

	public static void main(String[] args) {
		// Instâncias
		ModificadoresDeAcessoComPacotes modificadoresDeAcessoComPacotes = new ModificadoresDeAcessoComPacotes();
		ClasseDeApoio1 classeDeApoio1 = new ClasseDeApoio1();
		ClasseDeApoio2 classeDeApoio2 = new ClasseDeApoio2();
		ClasseDeApoio3 classeDeApoio3 = new ClasseDeApoio3();
		ClasseDeApoio4 classeDeApoio4 = new ClasseDeApoio4();

		modificadoresDeAcessoComPacotes.AcessarMembrosDaClassePrincipal();
		classeDeApoio1.AcessarMembrosDaClassePrincipal();
		classeDeApoio2.AcessarMembrosDaClassePrincipal();
		classeDeApoio3.AcessarMembrosDaClassePrincipal();
		classeDeApoio4.AcessarMembrosDaClassePrincipal();
	}

	public void AcessarMembrosDaClassePrincipal() {
		System.out.println("Quem pode ser usado? [Membros da mesma classe, do mesmo pacote]");
		System.out.println(variavel1);
		System.out.println(variavel2);
		System.out.println(variavel3);
		System.out.println(variavel4);
		System.out.println();
	}
}
