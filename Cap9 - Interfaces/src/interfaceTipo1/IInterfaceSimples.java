package interfaceTipo1;

public interface IInterfaceSimples {
	public void somar(); // Public � redundante, pois, por default, m�todos de interfaces s�o public
	
	void subtrair();
	
	default String retornarUmaString(){ //A partir do Java 8 � poss�vel criar m�todos com corpo dentro de interfaces
		return "aeiou";
	}
}
