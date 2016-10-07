package caso7;

public class ClasseDeApoio1 {

	synchronized void escrever(ClasseDeApoio2 classe2) {
		System.out.println(Thread.currentThread().getName() + " entrou no m�dodo da classe 1");
		System.out.println("Vamos tentar chamar o m�todo da classe 2 usando o m�todo da classe 1");
		
		classe2.outroMetodoDaClasse2();
	}
	
	synchronized void outroMetodoDaClasse1() {
		System.out.println("Dentro de um m�todo da classe 1.");
	}
}
