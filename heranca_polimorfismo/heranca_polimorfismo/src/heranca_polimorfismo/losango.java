package heranca_polimorfismo;

import javax.swing.JOptionPane;

public class losango extends quadril�tero{
	
	
public void calcular_perimetro () {
setL1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de um dos lados do losnago: ")));
setTot(4*getL1());
JOptionPane.showMessageDialog(null, "O valor total do per�metro � de: "+getTot());
}

}
