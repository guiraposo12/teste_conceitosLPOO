package heranca_polimorfismo;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
	quadril�tero q = null;
	String op = JOptionPane.showInputDialog("Digite o tipo de quadril�tero que ser� utilizado de acordo com a tabela: "
			+ "\n( Q ) - Quadrado;"
			+ "\n( R ) - Ret�ngulo;"
			+ "\n( T ) - Trap�zio;"
			+ "\n( L ) - Losango.");
	
	op = op.toUpperCase();
	
	switch (op) {
	case "Q":
		q = new quadrado();
		q.calcular_perimetro();
		break;
		
	case "R":
		q = new ret�ngulo();
		q.calcular_perimetro();
		break;
		
	case "T":
		q = new trap�zio();
		q.calcular_perimetro();
		break;
		
	case "L":
		q = new losango();
		q.calcular_perimetro();
		break;

	default:
		JOptionPane.showMessageDialog(null, "Valor digitado � incorreto!");
		break;
	}
	
	
	
	

	}

}
