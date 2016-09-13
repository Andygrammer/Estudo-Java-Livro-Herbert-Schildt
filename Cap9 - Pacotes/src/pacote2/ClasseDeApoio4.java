package pacote2;

import pacote1.ModificadoresDeAcessoComPacotes;

public class ClasseDeApoio4 {
	public void AcessarMembrosDaClassePrincipal() {
		// Instância para acessar membros da classe principal
		ModificadoresDeAcessoComPacotes modificadoresDeAcessoComPacotes = new ModificadoresDeAcessoComPacotes();

		System.out.println("Quem pode ser usado? [Membros em uma classe, que não é subclasse, de um pacote diferente]");
		System.out.println(
				"Não é possível enxergar a variável que é default na classe principal, do ponto de vista de uma classe, que não é subclasse, de um pacote diferente.");
		System.out.println(modificadoresDeAcessoComPacotes.variavel2);
		System.out.println(
				"Não é possível enxergar a variável que é protegida na classe principal, do ponto de vista de uma classe, que não é subclasse, de um pacote diferente.");
		System.out.println(
				"Não é possível enxergar a variável que é privada na classe principal, do ponto de vista de uma classe, que não é subclasse, de um pacote diferente.");
		System.out.println();
	}
}
