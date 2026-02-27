import javax.swing.JLabel;

public class TelaRemocao2 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaRemocao2.class.getName());
  
    public TelaRemocao2() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    private void initComponents() {

        title = new javax.swing.JLabel(); // Label para o título "Busca e Remoção de Cliente"
        tagline = new javax.swing.JLabel(); 
        jLabel2 = new javax.swing.JLabel(); // Label para "Digite o CPF:"
        inputTextCPF = new javax.swing.JFormattedTextField(); // Campo para CPF
        jButton1 = new javax.swing.JButton(); // Botão "Finalizar"
        btnBuscar = new javax.swing.JButton(); // Botão "Buscar"

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setLabelFor(this);
        title.setText("Remover Cliente");
        
        tagline.setFont(new java.awt.Font("Segoe UI", 0, 12));
        tagline.setText("<html><body style='max-width: 250px; width: 100%;text-align: center '>  \n" +  
                        "Digite o CPF do cliente para buscar. \n" +
                                "Se encontrado, você poderá confirmar a remoção. \n" +    
                        "    </body></html>");

        tagline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); 
        jLabel2.setText("Digite o CPF:");

        inputTextCPF.setText(""); 

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jButton1.setText("Voltar ao Menu");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        btnBuscar.setText("Buscar!");
        btnBuscar.addActionListener(this::buscarCpfActionPerformed);

    

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    // Centraliza o Título e a Tagline no espaço total da janela
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tagline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tagline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }

    //voltar pra tela de menu
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        TelaMenu telaMenu = new TelaMenu();
        telaMenu.setVisible(true);
        this.dispose(); // Fecha a janela atual
    }/

    

    private void buscarCpfActionPerformed(java.awt.event.ActionEvent evt) {
        String cpf = inputTextCPF.getText().replaceAll("[^0-9]", ""); // Remove formatação do CPF
       Pessoa clienteEncontrado = DadosCliente.buscarCliente(cpf);


        if (clienteEncontrado != null) {
            // Cliente encontrado, mostrar detalhes e opção de remoção
            Object[] opcoes = {"Sim, remover", "Não, manter"};
            int resposta = javax.swing.JOptionPane.showOptionDialog(
            this, 
            "Cliente encontrado:\nNome: " + clienteEncontrado.getNome() + "\nCPF: " + clienteEncontrado.getCpf() + "\nDeseja remover este cliente?", 
            "Cliente Encontrado", 
            javax.swing.JOptionPane.YES_NO_OPTION,
            javax.swing.JOptionPane.QUESTION_MESSAGE, // Ícone de interrogação
            null,
            opcoes,
            opcoes[1]
        
        );

            if (resposta == javax.swing.JOptionPane.YES_OPTION) {
                boolean removido = DadosCliente.excluirCliente(cpf);
                if (removido) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Cliente removido com sucesso!");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Erro ao remover cliente.");
                }
            }
        } else {
            // Cliente não encontrado
            javax.swing.JOptionPane.showMessageDialog(this, "Cliente não encontrado. Verifque o CPF e tente novamente.");
        }
        
      
    }


    // Variáveis e componentes da interface gráfica
    private javax.swing.JButton jButton1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JCheckBox checkboxRemove;
    private javax.swing.JButton btnVoltarMenu; // dentro da janela de remover cliente(onde busca o cliente) o usuário pode votar pro menu
    private javax.swing.JFormattedTextField inputTextCPF;
    private javax.swing.JLabel title;
    private javax.swing.JLabel tagline;
    private javax.swing.JLabel jLabel2;
    
}
