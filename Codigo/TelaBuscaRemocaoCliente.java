import javax.swing.*;

public class TelaBuscaRemocaoCliente extends JFrame{
	
	private JPanel painel;
	
	private JLabel lbCpf;
	
	private JTextField txtCpf;
	
	private JCheckBox cbremover;
	
	private JButton botaobuscar;
	private JButton botaoremover;
	private JButton botaofinalizar;
	
	public TelaBuscaRemocaoCliente() {
		super ("Buscar Cliente");
		painel = new JPanel();
		add(painel);
		
		lbCpf = new JLabel ("Digite o CPF: ");
		painel.add(lbCpf);
		txtCpf = new JTextField(11);
		painel.add(txtCpf);
		
		botaobuscar = new JButton("Buscar");
		painel.add(botaobuscar);		
		
		//JOptionPane.showMessageDialog(null, "Cliente Encontrado", "Resultado da busca", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Cliente NÃO Encontrado", "Resultado da busca", JOptionPane.INFORMATION_MESSAGE); 
		
		cbremover = new JCheckBox("Remover cliente");
		painel.add(cbremover);
		botaoremover = new JButton("Remover");
		painel.add(botaoremover);
		
		//JOptionPane.showMessageDialog(null, "Deseja remover esse cliente!", "Confirmação", JOptionPane.YES_NO_OPTION);
		//JOptionPane.showMessageDialog(null, "Cliente removido!", "Remoção", JOptionPane.INFORMATION_MESSAGE);
		
		botaofinalizar = new JButton("Finalizar");
		painel.add(botaofinalizar);	
		
		//JOptionPane.showMessageDialog(null, "Operação Finalizada");
		
		setSize(680, 350);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	}

		
}
