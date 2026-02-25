    public class TelaCliente2 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCliente2.class.getName());
    
    public TelaCliente2() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroText = new javax.swing.JLabel();
        NomeText = new javax.swing.JLabel();
        CPFText = new javax.swing.JLabel();
        DataNasciText = new javax.swing.JLabel();
        EmailText = new javax.swing.JLabel();
        CelularText = new javax.swing.JLabel();
        FormadepagamentoText = new javax.swing.JLabel();
        DataNasciTextField = new javax.swing.JFormattedTextField();
        CPFTextField = new javax.swing.JFormattedTextField();
        CelularTextField = new javax.swing.JFormattedTextField();
        NomeTextField = new javax.swing.JFormattedTextField();
        EmailTextField = new javax.swing.JFormattedTextField();
        FinalizarButton = new javax.swing.JButton();
        FormadepagamentoCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CadastroText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CadastroText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CadastroText.setLabelFor(this);
        CadastroText.setText("Cadastro do Cliente");
        CadastroText.setToolTipText("");
        CadastroText.setBorder(new javax.swing.border.MatteBorder(null));

        NomeText.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        NomeText.setText("Nome:");

        CPFText.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        CPFText.setText("CPF:");

        DataNasciText.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        DataNasciText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DataNasciText.setText("Data de Nascimento:");

        EmailText.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        EmailText.setText("E-mail:");

        CelularText.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        CelularText.setText("Celular:");

        FormadepagamentoText.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        FormadepagamentoText.setText("Forma de Pagamento:");

        DataNasciTextField.setText("Insira aqui sua resposta...");

        CPFTextField.setText("");

        CelularTextField.setText("Insira aqui sua resposta...");

        NomeTextField.setText("Insira aqui sua resposta...");

        EmailTextField.setText("Insira aqui sua resposta...");

        FinalizarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FinalizarButton.setText("Cadastrar!");
        FinalizarButton.addActionListener(this::FinalizarButtonActionPerformed);

        FormadepagamentoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Débito", "Credito", "Dinheiro", "Pix" }));
        FormadepagamentoCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FormadepagamentoCombo.addActionListener(this::FormadepagamentoComboActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(NomeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(CPFText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(DataNasciText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CelularText)
                            .addComponent(EmailText)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(FormadepagamentoText)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataNasciTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(CPFTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(CelularTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(NomeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(FormadepagamentoCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FinalizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CadastroText, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(CadastroText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeText)
                    .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFText)
                    .addComponent(CPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataNasciText)
                    .addComponent(DataNasciTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CelularText)
                    .addComponent(CelularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FormadepagamentoText)
                    .addComponent(FormadepagamentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(FinalizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FinalizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarButtonActionPerformed
        // Coleta os dados da tela
        String nome = NomeTextField.getText();
        String cpf = CPFTextField.getText().replaceAll("[^0-9]", "");
        String nascimento = DataNasciTextField.getText();
        String celular = CelularTextField.getText();
        String email = EmailTextField.getText();
        String pagamento = FormadepagamentoCombo.getSelectedItem().toString();

        // Cria o objeto 
        Pessoa novoCliente = new Cliente(nome, cpf, nascimento, celular, email, pagamento.charAt(0));
        

      if(novoCliente.getCpf() == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "CPF Inválido! ou não preenchido. Por favor, insira um CPF válido.");
        return;
      }
        
      



        
        
        // Salvando na persistencia
        GerenciadorDados bancoDados = new GerenciadorDados(); 
        bancoDados.cadastrar(novoCliente);
    
        // Feedback para o usuário
        javax.swing.JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
    
        // Voltar para o menu
        new TelaMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FinalizarButtonActionPerformed

    private void FormadepagamentoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormadepagamentoComboActionPerformed
        
    }//GEN-LAST:event_FormadepagamentoComboActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPFText;
    private javax.swing.JFormattedTextField CPFTextField;
    private javax.swing.JLabel CadastroText;
    private javax.swing.JLabel CelularText;
    private javax.swing.JFormattedTextField CelularTextField;
    private javax.swing.JLabel DataNasciText;
    private javax.swing.JFormattedTextField DataNasciTextField;
    private javax.swing.JLabel EmailText;
    private javax.swing.JFormattedTextField EmailTextField;
    private javax.swing.JButton FinalizarButton;
    private javax.swing.JComboBox<String> FormadepagamentoCombo;
    private javax.swing.JLabel FormadepagamentoText;
    private javax.swing.JLabel NomeText;
    private javax.swing.JFormattedTextField NomeTextField;
    // End of variables declaration//GEN-END:variables
}
