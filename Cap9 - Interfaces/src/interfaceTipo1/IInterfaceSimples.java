package interfaceTipo1;

public interface IInterfaceSimples {
	public void somar(); // Public é redundante, pois, por default, métodos de interfaces são public
	
	void subtrair();
	
	default String retornarUmaString(){ //A partir do Java 8 é possível criar métodos com corpo dentro de interfaces
		return "aeiou";
	}
}
