package heranca_polimorfismo;

import javax.swing.JOptionPane;

public class retângulo extends quadrilátero{

public void calcular_perimetro() {
setL1(Double.parseDouble((JOptionPane.showInputDialog("Digit o valor da base do retângulo: "))));
setL2(Double.parseDouble((JOptionPane.showInputDialog("Digit o valor da altura do retângulo: "))));
setTot(2*getL1() + 2*getL2());
JOptionPane.showMessageDialog(null,"O valor do perímetro é de: "+getTot());
	
}
}
