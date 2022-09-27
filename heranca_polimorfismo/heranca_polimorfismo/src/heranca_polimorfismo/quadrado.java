package heranca_polimorfismo;

import javax.swing.JOptionPane;

public class quadrado extends quadrilátero{
	
public void calcular_perimetro(){
setL1(Double.parseDouble((JOptionPane.showInputDialog("Digit o valor do lado do quadrado: "))));
setTot(4*getL1());
JOptionPane.showMessageDialog(null,"O valor do perímetro é de: "+getTot());
}
	

}	



