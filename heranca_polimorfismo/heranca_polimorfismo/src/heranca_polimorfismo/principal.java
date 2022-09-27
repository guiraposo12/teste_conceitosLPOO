package heranca_polimorfismo;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
	quadrilátero q = null;
	String op = JOptionPane.showInputDialog("Digite o tipo de quadrilátero que será utilizado de acordo com a tabela: "
			+ "\n( Q ) - Quadrado;"
			+ "\n( R ) - Retângulo;"
			+ "\n( T ) - Trapézio;"
			+ "\n( L ) - Losango.");
	
	op = op.toUpperCase();
	
	switch (op) {
	case "Q":
		q = new quadrado();
		q.calcular_perimetro();
		break;
		
	case "R":
		q = new retângulo();
		q.calcular_perimetro();
		break;
		
	case "T":
		q = new trapézio();
		q.calcular_perimetro();
		break;
		
	case "L":
		q = new losango();
		q.calcular_perimetro();
		break;

	default:
		JOptionPane.showMessageDialog(null, "Valor digitado é incorreto!");
		break;
	}
	
	
	
	

	}

}
