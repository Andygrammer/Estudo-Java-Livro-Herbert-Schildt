package caso7;

public class ClasseDeApoio1 {

	synchronized void escrever(ClasseDeApoio2 classe2) {
		System.out.println(Thread.currentThread().getName() + " entrou no médodo da classe 1");
		System.out.println("Vamos tentar chamar o método da classe 2 usando o método da classe 1");
		
		classe2.outroMetodoDaClasse2();
	}
	
	synchronized void outroMetodoDaClasse1() {
		System.out.println("Dentro de um método da classe 1.");
	}
}
