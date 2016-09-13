package pacote1;

public class ClasseDeApoio2 {
	public void AcessarMembrosDaClassePrincipal() {
		// Instância para acessar membros da classe principal
		ModificadoresDeAcessoComPacotes modificadoresDeAcessoComPacotes = new ModificadoresDeAcessoComPacotes();

		System.out.println("Quem pode ser usado? [Membros em uma classe, que não é subclasse, do mesmo pacote]");
		System.out.println(modificadoresDeAcessoComPacotes.variavel1);
		System.out.println(modificadoresDeAcessoComPacotes.variavel2);
		System.out.println(modificadoresDeAcessoComPacotes.variavel3);
		System.out.println(
				"Não é possível enxergar a variável que é privada na classe principal, do ponto de vista de uma classe, que não é subclasse, do mesmo pacote.");
		System.out.println();
	}
}
