package com.mycompany.tecsystemwdmcell.Telas;

import com.mycompany.tecsystemwdmcell.DAO.FuncionarioDAO;
import com.mycompany.tecsystemwdmcell.Modelos.Funcionario;
import com.mycompany.tecsystemwdmcell.Utilitarios.MD5;

public class telaVisualizarADM extends java.awt.Dialog {

    Funcionario funcionario;

    public telaVisualizarADM(java.awt.Frame parent, boolean modal, Funcionario funcionario) {
        super(parent, modal);
        initComponents();
        this.funcionario = funcionario;

        montarCampos();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cpfFuncionarioLabel = new javax.swing.JLabel();
        nomeUsuarioLabel = new javax.swing.JLabel();
        novoProdutoTitulo = new javax.swing.JLabel();
        nomeusuarioTF = new javax.swing.JTextField();
        cancelarBT = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        novaSenhaLabel = new javax.swing.JLabel();
        novasenhaTF = new javax.swing.JTextField();
        permissaoCb = new javax.swing.JComboBox<>();
        cadastrarADMBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        limparCamosADMBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        matriculaTF = new javax.swing.JTextField();
        matriculaLabel = new javax.swing.JLabel();
        nomeFuncionarioLabel = new javax.swing.JLabel();
        cpffuncionarioTF = new javax.swing.JTextField();
        nomefuncionarioTF = new javax.swing.JTextField();

        setResizable(false);
        setTitle("Visualizar e Editar ADM");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cpfFuncionarioLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        cpfFuncionarioLabel.setForeground(new java.awt.Color(14, 122, 192));
        cpfFuncionarioLabel.setText("CPF do Funcionário");

        nomeUsuarioLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        nomeUsuarioLabel.setForeground(new java.awt.Color(14, 122, 192));
        nomeUsuarioLabel.setText("Nome de Usuário");

        novoProdutoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        novoProdutoTitulo.setForeground(new java.awt.Color(62, 174, 185));
        novoProdutoTitulo.setText("Visualizar e Editar ADM");

        nomeusuarioTF.setBackground(new java.awt.Color(255, 255, 255));
        nomeusuarioTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomeusuarioTF.setForeground(new java.awt.Color(10, 79, 131));
        nomeusuarioTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        cancelarBT.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBT.setText("Cancelar");
        cancelarBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarBT.setRound(5);
        cancelarBT.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.CANCELAR);
        cancelarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBTActionPerformed(evt);
            }
        });

        novaSenhaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        novaSenhaLabel.setForeground(new java.awt.Color(14, 122, 192));
        novaSenhaLabel.setText("Alterar senha");

        novasenhaTF.setBackground(new java.awt.Color(255, 255, 255));
        novasenhaTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        novasenhaTF.setForeground(new java.awt.Color(10, 79, 131));
        novasenhaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        permissaoCb.setBackground(new java.awt.Color(255, 255, 255));
        permissaoCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        permissaoCb.setForeground(new java.awt.Color(14, 122, 192));
        permissaoCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nível Acesso", "Administrador", "Gerente", "Vendedor", "Caixa" }));
        permissaoCb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 122, 192), 2, true));

        cadastrarADMBt.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarADMBt.setText("Editar");
        cadastrarADMBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cadastrarADMBt.setRound(5);
        cadastrarADMBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.CADASTRAR);
        cadastrarADMBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarADMBtActionPerformed(evt);
            }
        });

        limparCamosADMBt.setForeground(new java.awt.Color(21, 53, 85));
        limparCamosADMBt.setText("Limpar");
        limparCamosADMBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limparCamosADMBt.setRound(5);
        limparCamosADMBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.LIMPAR);
        limparCamosADMBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCamosADMBtActionPerformed(evt);
            }
        });

        matriculaTF.setBackground(new java.awt.Color(255, 255, 255));
        matriculaTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        matriculaTF.setForeground(new java.awt.Color(10, 79, 131));
        matriculaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        matriculaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        matriculaLabel.setForeground(new java.awt.Color(14, 122, 192));
        matriculaLabel.setText("Matrícula do Funcionário");

        nomeFuncionarioLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        nomeFuncionarioLabel.setForeground(new java.awt.Color(14, 122, 192));
        nomeFuncionarioLabel.setText("Nome do Funcionário");

        cpffuncionarioTF.setBackground(new java.awt.Color(255, 255, 255));
        cpffuncionarioTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cpffuncionarioTF.setForeground(new java.awt.Color(10, 79, 131));
        cpffuncionarioTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        nomefuncionarioTF.setBackground(new java.awt.Color(255, 255, 255));
        nomefuncionarioTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomefuncionarioTF.setForeground(new java.awt.Color(10, 79, 131));
        nomefuncionarioTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(novoProdutoTitulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(limparCamosADMBt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cadastrarADMBt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nomefuncionarioTF)
                                            .addComponent(nomeFuncionarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cpfFuncionarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cpffuncionarioTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(matriculaLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(matriculaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nomeUsuarioLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nomeusuarioTF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(novaSenhaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(novasenhaTF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(permissaoCb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(novoProdutoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeFuncionarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomefuncionarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cpfFuncionarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpffuncionarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeUsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeusuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(novaSenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(novasenhaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(matriculaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matriculaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(permissaoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarADMBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limparCamosADMBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    public void montarCampos() {
        nomefuncionarioTF.setText(funcionario.getNome());
        cpffuncionarioTF.setText(funcionario.getCpf());
        matriculaTF.setText(funcionario.getMatricula());

        nomeusuarioTF.setText(funcionario.getLogin().getUsuario());
        permissaoCb.setSelectedItem(funcionario.getLogin().getNivelpermissao());
        //Senha não será exibida, caso desejado o administrador insere novamente a senha
    }

    private void limparCamosADMBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCamosADMBtActionPerformed
        nomefuncionarioTF.setText("");
        nomeusuarioTF.setText("");
        cpffuncionarioTF.setText("");
        matriculaTF.setText("");
        novasenhaTF.setText("");
        permissaoCb.setSelectedIndex(0);
    }//GEN-LAST:event_limparCamosADMBtActionPerformed

    private void cancelarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBTActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarBTActionPerformed

    private void cadastrarADMBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarADMBtActionPerformed
        editar();
    }//GEN-LAST:event_cadastrarADMBtActionPerformed

    public void editar() {
        if (nomefuncionarioTF.getText().isBlank() && nomeusuarioTF.getText().isBlank()
                && cpffuncionarioTF.getText().isBlank() && matriculaTF.getText().isBlank() && novasenhaTF.getText().isBlank()
                && permissaoCb.getSelectedIndex() == 0) {
            new telaAlerta(null, true, "Preencha os dados para editar").setVisible(true);
        } else if (nomefuncionarioTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite o nome do funcionário").setVisible(true);
        } else if (nomeusuarioTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite o nome de login do funcionário").setVisible(true);
        } else if (cpffuncionarioTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite o cpf do funcionário").setVisible(true);
        } else if (matriculaTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite a matricula do funcionário").setVisible(true);
        } else if (novasenhaTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite a senha de login do funcionário").setVisible(true);
        } else if (permissaoCb.getSelectedIndex() == 0) {
            new telaAlerta(null, true, "Escolha o nível de permissão do funcionário").setVisible(true);
        } else {
            funcionario.setNome(nomefuncionarioTF.getText());
            funcionario.setCpf(cpffuncionarioTF.getText());
            funcionario.setMatricula(matriculaTF.getText());

            funcionario.getLogin().setUsuario(nomeusuarioTF.getText());
            funcionario.getLogin().setSenha(MD5.convertToMD5(novasenhaTF.getText()));
            funcionario.getLogin().setNivelpermissao((String) permissaoCb.getSelectedItem());

            FuncionarioDAO.editar(funcionario);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado cadastrarADMBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado cancelarBT;
    private javax.swing.JLabel cpfFuncionarioLabel;
    private javax.swing.JTextField cpffuncionarioTF;
    private javax.swing.JPanel jPanel1;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado limparCamosADMBt;
    private javax.swing.JLabel matriculaLabel;
    private javax.swing.JTextField matriculaTF;
    private javax.swing.JLabel nomeFuncionarioLabel;
    private javax.swing.JLabel nomeUsuarioLabel;
    private javax.swing.JTextField nomefuncionarioTF;
    private javax.swing.JTextField nomeusuarioTF;
    private javax.swing.JLabel novaSenhaLabel;
    private javax.swing.JTextField novasenhaTF;
    private javax.swing.JLabel novoProdutoTitulo;
    private javax.swing.JComboBox<String> permissaoCb;
    // End of variables declaration//GEN-END:variables
}
