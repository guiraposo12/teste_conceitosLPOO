package heranca_polimorfismo;

import javax.swing.JOptionPane;

public class quadrado extends quadril�tero{
	
public void calcular_perimetro(){
setL1(Double.parseDouble((JOptionPane.showInputDialog("Digit o valor do lado do quadrado: "))));
setTot(4*getL1());
JOptionPane.showMessageDialog(null,"O valor do per�metro � de: "+getTot());
}
	

}	



