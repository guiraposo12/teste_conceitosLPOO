package heranca_polimorfismo;

import javax.swing.JOptionPane;

public class ret�ngulo extends quadril�tero{

public void calcular_perimetro() {
setL1(Double.parseDouble((JOptionPane.showInputDialog("Digit o valor da base do ret�ngulo: "))));
setL2(Double.parseDouble((JOptionPane.showInputDialog("Digit o valor da altura do ret�ngulo: "))));
setTot(2*getL1() + 2*getL2());
JOptionPane.showMessageDialog(null,"O valor do per�metro � de: "+getTot());
	
}
}
