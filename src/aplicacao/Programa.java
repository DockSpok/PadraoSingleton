package aplicacao;
import javax.swing.JOptionPane;
import entidade.SingletonDemonstrando;

public class Programa {
	
	public static void main(String[] args) {
		SingletonDemonstrando sing1;
		SingletonDemonstrando sing2;
			
		sing1 = SingletonDemonstrando.obterUmaUnicaInstancia();
		sing2 = SingletonDemonstrando.obterUmaUnicaInstancia();
			
		if(sing1.equals(sing2)) {
			JOptionPane.showMessageDialog(null
			,"ATENÇÃO a estes endereços:\n"
			+"singleton1: "
			+sing1.hashCode() 
			+"\nsingleton2: "
			+sing1.hashCode()
			+"\nsão iguais, portanto, referem-se à mesma instância de Singleton.");
		}
	}
}
