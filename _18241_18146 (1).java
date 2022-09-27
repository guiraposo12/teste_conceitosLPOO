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
									   +"\n I-Informática"
									   +"\n A-Administração"
									   +"\n N-Nutrição").toUpperCase();
			switch (curso) {
			case "I":
				if (I<10) {
				I++;
				JOptionPane.showMessageDialog(null, "Inscrição aceita");
				
					}
				else
					JOptionPane.showMessageDialog(null, "Inscrição negada");
				
				break;
			case "A":
				if (A<10) {
					A++;
					JOptionPane.showMessageDialog(null, "Inscrição aceita");
					
						}
					else
						JOptionPane.showMessageDialog(null, "Inscrição negada");
					
					break;
			case "N":
				if (N<10) {
					N++;
					JOptionPane.showMessageDialog(null, "Inscrição aceita");
					
						}
					else
						JOptionPane.showMessageDialog(null, "Inscrição negada");
					
					break;
					
			default:JOptionPane.showMessageDialog(null,"Opção inválida");
				break;
			}
			
			resp = JOptionPane.showInputDialog("Deseja matricular um novo aluno?");	
		}
		
		JOptionPane.showMessageDialog(null, "Total de inscrições:"
									+ "\nInformática: "+I+" Inscrições;"
									+ "\nAdiministração: "+A+" Inscrições;"
									+ "\nNutrição: "+N+" Inscrições;");
		
	}

}
