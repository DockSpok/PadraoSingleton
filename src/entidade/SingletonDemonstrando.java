package entidade;
import javax.swing.*;

public class SingletonDemonstrando {
	private static SingletonDemonstrando objetoUnico;
	
	private SingletonDemonstrando() {
		System.out.println("Menssagem do construtor:\n\nSingleton foi criado.");
				
		JOptionPane.showMessageDialog(null,"Menssagem do construtor\n\nSingleton foi criado.");
	}
	
	public static SingletonDemonstrando obterUmaUnicaInstancia() {
		if(objetoUnico == null) {
			objetoUnico = new SingletonDemonstrando();
		}
		return objetoUnico;
	}
	
	public void OutroMetodoViolariaSingleResponsibilityPrinciple() {}
}
