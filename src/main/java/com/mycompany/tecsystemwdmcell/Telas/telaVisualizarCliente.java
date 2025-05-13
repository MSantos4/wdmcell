package com.mycompany.tecsystemwdmcell.Telas;

import com.mycompany.tecsystemwdmcell.DAO.ClienteDAO;
import com.mycompany.tecsystemwdmcell.Modelos.Cliente;

public class telaVisualizarCliente extends java.awt.Dialog {

    private Cliente cliente;

    public telaVisualizarCliente(java.awt.Frame parent, boolean modal, Cliente cliente) {
        super(parent, modal);
        initComponents();
        this.cliente = cliente;
        montarCampos();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        editarBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        limparBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        cancelarBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        nomeclienteTF = new javax.swing.JTextField();
        nomeclienteLabel = new javax.swing.JLabel();
        novoProdutoTitulo = new javax.swing.JLabel();
        emailclienteTF = new javax.swing.JTextField();
        emailclienteLabel = new javax.swing.JLabel();
        telefoneclienteTF = new javax.swing.JTextField();
        telefoneclienteLabel = new javax.swing.JLabel();
        cpfclienteTF = new javax.swing.JTextField();
        cpfclienteLabel = new javax.swing.JLabel();

        setResizable(false);
        setTitle("Visualizar e Editar ADM");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        editarBt.setForeground(new java.awt.Color(255, 255, 255));
        editarBt.setText("Editar");
        editarBt.setToolTipText("");
        editarBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarBt.setRound(5);
        editarBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.CADASTRAR);
        editarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtActionPerformed(evt);
            }
        });

        limparBt.setForeground(new java.awt.Color(21, 53, 85));
        limparBt.setText("Limpar");
        limparBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limparBt.setRound(5);
        limparBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.LIMPAR);
        limparBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBtActionPerformed(evt);
            }
        });

        cancelarBt.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBt.setText("Cancelar");
        cancelarBt.setToolTipText("");
        cancelarBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarBt.setRound(5);
        cancelarBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.CANCELAR);
        cancelarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtActionPerformed(evt);
            }
        });

        nomeclienteTF.setBackground(new java.awt.Color(255, 255, 255));
        nomeclienteTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomeclienteTF.setForeground(new java.awt.Color(10, 79, 131));
        nomeclienteTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        nomeclienteLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        nomeclienteLabel.setForeground(new java.awt.Color(14, 122, 192));
        nomeclienteLabel.setText("Nome do Cliente");

        novoProdutoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        novoProdutoTitulo.setForeground(new java.awt.Color(62, 174, 185));
        novoProdutoTitulo.setText("Visualizar e Editar Cliente");

        emailclienteTF.setBackground(new java.awt.Color(255, 255, 255));
        emailclienteTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailclienteTF.setForeground(new java.awt.Color(10, 79, 131));
        emailclienteTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        emailclienteLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        emailclienteLabel.setForeground(new java.awt.Color(14, 122, 192));
        emailclienteLabel.setText("E-mail do Cliente");

        telefoneclienteTF.setBackground(new java.awt.Color(255, 255, 255));
        telefoneclienteTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telefoneclienteTF.setForeground(new java.awt.Color(10, 79, 131));
        telefoneclienteTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        telefoneclienteLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        telefoneclienteLabel.setForeground(new java.awt.Color(14, 122, 192));
        telefoneclienteLabel.setText("Telefone do Cliente");

        cpfclienteTF.setBackground(new java.awt.Color(255, 255, 255));
        cpfclienteTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cpfclienteTF.setForeground(new java.awt.Color(10, 79, 131));
        cpfclienteTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        cpfclienteLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        cpfclienteLabel.setForeground(new java.awt.Color(14, 122, 192));
        cpfclienteLabel.setText("CPF do Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(novoProdutoTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(cancelarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(limparBt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(editarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nomeclienteTF)
                                .addComponent(nomeclienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cpfclienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cpfclienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailclienteTF)
                                .addComponent(telefoneclienteTF)
                                .addComponent(emailclienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(telefoneclienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emailclienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailclienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(novoProdutoTitulo)
                        .addGap(33, 33, 33)
                        .addComponent(nomeclienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeclienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(telefoneclienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefoneclienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cpfclienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfclienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limparBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void editarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtActionPerformed
        editar();
    }//GEN-LAST:event_editarBtActionPerformed

    private void cancelarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarBtActionPerformed

    private void limparBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBtActionPerformed
        nomeclienteTF.setText("");
        emailclienteTF.setText("");
        cpfclienteTF.setText("");
        telefoneclienteTF.setText("");
    }//GEN-LAST:event_limparBtActionPerformed

    public void montarCampos() {
        nomeclienteTF.setText(cliente.getNome());
        cpfclienteTF.setText(cliente.getCpf());
        telefoneclienteTF.setText(cliente.getTelefone());
        emailclienteTF.setText(cliente.getEmail());
    }

    public void editar() {
        if (nomeclienteTF.getText().isBlank() && emailclienteTF.getText().isBlank() && cpfclienteTF.getText().isBlank() && telefoneclienteTF.getText().isBlank()) {
            new telaAlerta(null, true, "Os campos precisam estar preenchidos").setVisible(true);
        } else if (nomeclienteTF.getText().isBlank()) {
            new telaAlerta(null, true, "O nome do cliente é obrigatório, digite-o abaixo").setVisible(true);
        } else if (emailclienteTF.getText().isBlank()) {
            new telaAlerta(null, true, "Preencha com o e-mail do cliente").setVisible(true);
        } else if (cpfclienteTF.getText().isBlank() || cpfclienteTF.getText().length() > 14 || cpfclienteTF.getText().length() < 11) {
            new telaAlerta(null, true, "O CPF é obrigatório, digite um válido abaixo").setVisible(true);
        } else if (telefoneclienteTF.getText().isBlank()) {
            new telaAlerta(null, true, "O campo de telefone precisa estar preenchido").setVisible(true);
        } else {
            cliente.setNome(nomeclienteTF.getText());
            cliente.setTelefone(telefoneclienteTF.getText());
            cliente.setCpf(cpfclienteTF.getText());
            cliente.setEmail(emailclienteTF.getText());

            ClienteDAO.editar(cliente);
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado cancelarBt;
    private javax.swing.JLabel cpfclienteLabel;
    private javax.swing.JTextField cpfclienteTF;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado editarBt;
    private javax.swing.JLabel emailclienteLabel;
    private javax.swing.JTextField emailclienteTF;
    private javax.swing.JPanel jPanel1;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado limparBt;
    private javax.swing.JLabel nomeclienteLabel;
    private javax.swing.JTextField nomeclienteTF;
    private javax.swing.JLabel novoProdutoTitulo;
    private javax.swing.JLabel telefoneclienteLabel;
    private javax.swing.JTextField telefoneclienteTF;
    // End of variables declaration//GEN-END:variables
}
