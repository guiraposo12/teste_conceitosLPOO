package heranca_polimorfismo;

import javax.swing.JOptionPane;

public class trapézio extends quadrilátero{
	
double l3,l4;

public double getL3() {
	return l3;
}
public void setL3(double l3) {
	this.l3 = l3;
}
public double getL4() {
	return l4;
}
public void setL4(double l4) {
	this.l4 = l4;
}

public void calcular_perimetro() {
setL1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base maior: ")));
setL2(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base menor: ")));
setL3(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado esquerdo: ")));
setL4(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado direito: ")));
setTot(getL1()+getL2()+getL3()+getL4());
JOptionPane.showMessageDialog(null, "O perímetro total do trapézio é de: "+getTot());
}

}
