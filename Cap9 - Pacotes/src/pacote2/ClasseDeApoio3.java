package pacote2;

import pacote1.ModificadoresDeAcessoComPacotes;

public class ClasseDeApoio3 extends ModificadoresDeAcessoComPacotes {
	public void AcessarMembrosDaClassePrincipal() {
		System.out.println("Quem pode ser usado? [Membros em uma subclasse de um pacote diferente]");
		System.out.println(
				"Não é possível enxergar a variável que é default na classe principal, do ponto de vista de uma subclasse de um pacote diferente.");
		System.out.println(variavel2);
		System.out.println(variavel3);
		System.out.println(
				"Não é possível enxergar a variável que é privada na classe principal, do ponto de vista de uma subclasse do mesmo pacote.");
		System.out.println();
	}
}
