package pacote1;

public class ClasseDeApoio1 extends ModificadoresDeAcessoComPacotes {
	public void AcessarMembrosDaClassePrincipal() {
		System.out.println("Quem pode ser usado? [Membros em uma subclasse do mesmo pacote]");
		System.out.println(variavel1);
		System.out.println(variavel2);
		System.out.println(variavel3);
		System.out.println(
				"N�o � poss�vel enxergar a vari�vel que � privada na classe principal, do ponto de vista de uma subclasse do mesmo pacote.");
		System.out.println();
	}
}