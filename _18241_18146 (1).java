import javax.swing.JOptionPane;

public class _18241_18146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resp = "S";
		int I,A,N;
		
		I=0;
		A=0;
		N=0;
		
		while (resp.equals("S") || (resp.equals("s"))){
			String curso = JOptionPane.showInputDialog("Digite o curso desejado conforme a tabela abaixo:"
									   +"\n I-Inform�tica"
									   +"\n A-Administra��o"
									   +"\n N-Nutri��o").toUpperCase();
			switch (curso) {
			case "I":
				if (I<10) {
				I++;
				JOptionPane.showMessageDialog(null, "Inscri��o aceita");
				
					}
				else
					JOptionPane.showMessageDialog(null, "Inscri��o negada");
				
				break;
			case "A":
				if (A<10) {
					A++;
					JOptionPane.showMessageDialog(null, "Inscri��o aceita");
					
						}
					else
						JOptionPane.showMessageDialog(null, "Inscri��o negada");
					
					break;
			case "N":
				if (N<10) {
					N++;
					JOptionPane.showMessageDialog(null, "Inscri��o aceita");
					
						}
					else
						JOptionPane.showMessageDialog(null, "Inscri��o negada");
					
					break;
					
			default:JOptionPane.showMessageDialog(null,"Op��o inv�lida");
				break;
			}
			
			resp = JOptionPane.showInputDialog("Deseja matricular um novo aluno?");	
		}
		
		JOptionPane.showMessageDialog(null, "Total de inscri��es:"
									+ "\nInform�tica: "+I+" Inscri��es;"
									+ "\nAdiministra��o: "+A+" Inscri��es;"
									+ "\nNutri��o: "+N+" Inscri��es;");
		
	}

}
