package pacote2;

import pacote1.ModificadoresDeAcessoComPacotes;

public class ClasseDeApoio4 {
	public void AcessarMembrosDaClassePrincipal() {
		// Inst�ncia para acessar membros da classe principal
		ModificadoresDeAcessoComPacotes modificadoresDeAcessoComPacotes = new ModificadoresDeAcessoComPacotes();

		System.out.println("Quem pode ser usado? [Membros em uma classe, que n�o � subclasse, de um pacote diferente]");
		System.out.println(
				"N�o � poss�vel enxergar a vari�vel que � default na classe principal, do ponto de vista de uma classe, que n�o � subclasse, de um pacote diferente.");
		System.out.println(modificadoresDeAcessoComPacotes.variavel2);
		System.out.println(
				"N�o � poss�vel enxergar a vari�vel que � protegida na classe principal, do ponto de vista de uma classe, que n�o � subclasse, de um pacote diferente.");
		System.out.println(
				"N�o � poss�vel enxergar a vari�vel que � privada na classe principal, do ponto de vista de uma classe, que n�o � subclasse, de um pacote diferente.");
		System.out.println();
	}
}
