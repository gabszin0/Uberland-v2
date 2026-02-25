public class TelaMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaMenu.class.getName());
    
    public TelaMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        FinalizarButton = new javax.swing.JButton();
        ClienteButton = new javax.swing.JButton();
        MotoristaButton = new javax.swing.JButton();
        CorridaButton = new javax.swing.JButton();
        VeiculoButton = new javax.swing.JButton();
        BuscaButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(this);
        jLabel1.setText("Menu de Opções");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        FinalizarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FinalizarButton.setText("Finalizar!");
        FinalizarButton.addActionListener(this::FinalizarButtonActionPerformed);

        ClienteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClienteButton.setText("Cadastro Cliente");
        ClienteButton.addActionListener(this::ClienteButtonActionPerformed);

        MotoristaButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MotoristaButton.setText("Cadastro Motorista");
        MotoristaButton.addActionListener(this::MotoristaButtonActionPerformed);

        CorridaButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CorridaButton.setText("Iniciar Corrida");
        CorridaButton.addActionListener(this::CorridaButtonActionPerformed);

        VeiculoButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VeiculoButton.setText("Cadastro Veículo");
        VeiculoButton.addActionListener(this::VeiculoButtonActionPerformed);

        BuscaButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BuscaButton.setText("Buscar Cliente");
        BuscaButton.addActionListener(this::BuscaButtonActionPerformed);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoUberland.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 200));
        jLabel2.setMinimumSize(new java.awt.Dimension(200, 200));
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FinalizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MotoristaButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(VeiculoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CorridaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(BuscaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 198, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClienteButton)
                    .addComponent(MotoristaButton))
                .addGap(18, 18, 18)
                .addComponent(BuscaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorridaButton)
                    .addComponent(VeiculoButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(FinalizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FinalizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_FinalizarButtonActionPerformed

    private void ClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteButtonActionPerformed
        TelaCliente2 cliente = new TelaCliente2();
        cliente.setVisible(true);
        this.dispose(); // Fecha o menu
    }//GEN-LAST:event_ClienteButtonActionPerformed

    private void MotoristaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotoristaButtonActionPerformed
        TelaMotorista2 motorista = new TelaMotorista2();
        motorista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MotoristaButtonActionPerformed

    private void CorridaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorridaButtonActionPerformed
        TelaCorrida2 corrida = new TelaCorrida2();
        corrida.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CorridaButtonActionPerformed

    private void VeiculoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiculoButtonActionPerformed
        TelaVeiculos2 veiculo = new TelaVeiculos2();
        veiculo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VeiculoButtonActionPerformed

    private void BuscaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaButtonActionPerformed
        TelaRemocao2 remocao = new TelaRemocao2();
        remocao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BuscaButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscaButton;
    private javax.swing.JButton ClienteButton;
    private javax.swing.JButton CorridaButton;
    private javax.swing.JButton FinalizarButton;
    private javax.swing.JButton MotoristaButton;
    private javax.swing.JButton VeiculoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
