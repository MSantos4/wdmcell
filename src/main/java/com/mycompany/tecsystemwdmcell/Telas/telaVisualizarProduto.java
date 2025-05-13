package com.mycompany.tecsystemwdmcell.Telas;

import com.mycompany.tecsystemwdmcell.DAO.ProdutoDAO;
import com.mycompany.tecsystemwdmcell.DTO.marcaDTO;
import com.mycompany.tecsystemwdmcell.Modelos.Produto;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class telaVisualizarProduto extends java.awt.Dialog {
    
    private Produto produto;
    List<marcaDTO> listaMarcas = ProdutoDAO.listarMarcas();

    public telaVisualizarProduto(java.awt.Frame parent, boolean modal, Produto produto) {
        super(parent, modal);
        initComponents();
        this.produto = produto;
        
        montarComboBox();
        montarCbArmazenamentoMemoria();
        
        montarCampos();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        telaTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        processadorTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sistemaTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bateriaTF = new javax.swing.JTextField();
        memoriaCb = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        estoqueTF = new javax.swing.JTextField();
        pesoTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        espessuraTF = new javax.swing.JTextField();
        valorVendaTF = new javax.swing.JTextField();
        editarProdutoBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        jLabel4 = new javax.swing.JLabel();
        limparCamposBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        valorCompraTF = new javax.swing.JTextField();
        cancelarBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        jLabel3 = new javax.swing.JLabel();
        modeloProdutoTF = new javax.swing.JTextField();
        nomeProdutoLabel = new javax.swing.JLabel();
        marcaCb = new javax.swing.JComboBox<>();
        tituloVisualizarProduto = new javax.swing.JLabel();
        ArmazenamentoCb = new javax.swing.JComboBox<>();

        setResizable(false);
        setTitle("Visualizar e Editar Especificações");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(14, 122, 192));
        jLabel6.setText("Tela");

        telaTF.setBackground(new java.awt.Color(255, 255, 255));
        telaTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telaTF.setForeground(new java.awt.Color(10, 79, 131));
        telaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(14, 122, 192));
        jLabel8.setText("Processador");

        processadorTF.setBackground(new java.awt.Color(255, 255, 255));
        processadorTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        processadorTF.setForeground(new java.awt.Color(10, 79, 131));
        processadorTF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        processadorTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(14, 122, 192));
        jLabel7.setText("Sistema");
        jLabel7.setToolTipText("");

        sistemaTF.setBackground(new java.awt.Color(255, 255, 255));
        sistemaTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sistemaTF.setForeground(new java.awt.Color(10, 79, 131));
        sistemaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(14, 122, 192));
        jLabel9.setText("Bateria");

        bateriaTF.setBackground(new java.awt.Color(255, 255, 255));
        bateriaTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bateriaTF.setForeground(new java.awt.Color(10, 79, 131));
        bateriaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        memoriaCb.setBackground(new java.awt.Color(255, 255, 255));
        memoriaCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        memoriaCb.setForeground(new java.awt.Color(14, 122, 192));
        memoriaCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        memoriaCb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 122, 192), 2, true));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(14, 122, 192));
        jLabel10.setText("Peso");

        estoqueTF.setBackground(new java.awt.Color(255, 255, 255));
        estoqueTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estoqueTF.setForeground(new java.awt.Color(10, 79, 131));
        estoqueTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        pesoTF.setBackground(new java.awt.Color(255, 255, 255));
        pesoTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pesoTF.setForeground(new java.awt.Color(10, 79, 131));
        pesoTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(14, 122, 192));
        jLabel11.setText("Espessura");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(14, 122, 192));
        jLabel5.setText("Estoque");

        espessuraTF.setBackground(new java.awt.Color(255, 255, 255));
        espessuraTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        espessuraTF.setForeground(new java.awt.Color(10, 79, 131));
        espessuraTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        valorVendaTF.setBackground(new java.awt.Color(255, 255, 255));
        valorVendaTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valorVendaTF.setForeground(new java.awt.Color(10, 79, 131));
        valorVendaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        editarProdutoBt.setForeground(new java.awt.Color(255, 255, 255));
        editarProdutoBt.setText("Editar");
        editarProdutoBt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        editarProdutoBt.setRound(10);
        editarProdutoBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.CADASTRAR);
        editarProdutoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProdutoBtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(14, 122, 192));
        jLabel4.setText("Valor Venda");

        limparCamposBt.setForeground(new java.awt.Color(21, 53, 85));
        limparCamposBt.setText("Limpar");
        limparCamposBt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        limparCamposBt.setRound(10);
        limparCamposBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.LIMPAR);

        valorCompraTF.setBackground(new java.awt.Color(255, 255, 255));
        valorCompraTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valorCompraTF.setForeground(new java.awt.Color(10, 79, 131));
        valorCompraTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        cancelarBt.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBt.setText("Cancelar");
        cancelarBt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cancelarBt.setRound(10);
        cancelarBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.CANCELAR);
        cancelarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(14, 122, 192));
        jLabel3.setText("Valor Compra");

        modeloProdutoTF.setBackground(new java.awt.Color(255, 255, 255));
        modeloProdutoTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modeloProdutoTF.setForeground(new java.awt.Color(10, 79, 131));
        modeloProdutoTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        nomeProdutoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        nomeProdutoLabel.setForeground(new java.awt.Color(14, 122, 192));
        nomeProdutoLabel.setText("Modelo");

        marcaCb.setBackground(new java.awt.Color(255, 255, 255));
        marcaCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        marcaCb.setForeground(new java.awt.Color(14, 122, 192));
        marcaCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        marcaCb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 122, 192), 2, true));

        tituloVisualizarProduto.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        tituloVisualizarProduto.setForeground(new java.awt.Color(62, 174, 185));
        tituloVisualizarProduto.setText("Visualizar e Editar Especificações");

        ArmazenamentoCb.setBackground(new java.awt.Color(255, 255, 255));
        ArmazenamentoCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ArmazenamentoCb.setForeground(new java.awt.Color(14, 122, 192));
        ArmazenamentoCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ArmazenamentoCb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 122, 192), 2, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloVisualizarProduto)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(valorVendaTF)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(marcaCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modeloProdutoTF)
                                .addComponent(nomeProdutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(valorCompraTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(estoqueTF)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(processadorTF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sistemaTF)
                            .addComponent(telaTF)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bateriaTF)
                            .addComponent(ArmazenamentoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(memoriaCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(espessuraTF)
                            .addComponent(pesoTF)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editarProdutoBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limparCamposBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloVisualizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marcaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArmazenamentoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memoriaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nomeProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modeloProdutoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorCompraTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(espessuraTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(processadorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sistemaTF)
                            .addComponent(valorVendaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estoqueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bateriaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarProdutoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(limparCamposBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
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

    private void cancelarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarBtActionPerformed

    private void editarProdutoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProdutoBtActionPerformed
        editar();
    }//GEN-LAST:event_editarProdutoBtActionPerformed

    public void montarCampos() {
        marcaCb.setSelectedItem(produto.getMarca_produto());
        ArmazenamentoCb.setSelectedItem(produto.getEspecificacao().getArmazenamento());
        memoriaCb.setSelectedItem(produto.getEspecificacao().getMemoria());
        
        modeloProdutoTF.setText(produto.getModelo_produto());
        valorVendaTF.setText(String.valueOf(produto.getPreco_venda()));
        valorCompraTF.setText( String.valueOf(produto.getPreco_compra()));
        estoqueTF.setText(String.valueOf(produto.getEstoque()));
        telaTF.setText(produto.getEspecificacao().getTela());
        processadorTF.setText(produto.getEspecificacao().getProcessador());
        sistemaTF.setText(produto.getEspecificacao().getSistema());
        bateriaTF.setText(produto.getEspecificacao().getBateria());
        pesoTF.setText(String.valueOf(produto.getEspecificacao().getPeso()));
        espessuraTF.setText(produto.getEspecificacao().getEspessura());
    }
    
    public void editar() {
        if (marcaCb.getSelectedIndex() == 0 && ArmazenamentoCb.getSelectedIndex() == 0 && memoriaCb.getSelectedIndex() == 0
                && modeloProdutoTF.getText().isBlank() && valorCompraTF.getText().isBlank() && valorVendaTF.getText().isBlank() && estoqueTF.getText().isBlank()
                && telaTF.getText().isBlank() && processadorTF.getText().isBlank() && sistemaTF.getText().isBlank() && bateriaTF.getText().isBlank()
                && pesoTF.getText().isBlank() && espessuraTF.getText().isBlank()) {
            new telaAlerta(null, true, "Preencha os campos para cadastrar o produto").setVisible(true);
        } else if (marcaCb.getSelectedIndex() == 0) {
            new telaAlerta(null, true, "Selecione a marca do produto").setVisible(true);
        } else if (ArmazenamentoCb.getSelectedIndex() == 0) {
            new telaAlerta(null, true, "Selecione o espaço de armazenamento do produto").setVisible(true);
        } else if (memoriaCb.getSelectedIndex() == 0) {
            new telaAlerta(null, true, "Selecione a quantidade de memória do produto").setVisible(true);
        } else if (modeloProdutoTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite o modelo do produto").setVisible(true);
        } else if (valorCompraTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite o valor de compra do produto").setVisible(true);
        } else if (valorVendaTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite o valor de venda do produto").setVisible(true);
        } else if (estoqueTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite o estoque").setVisible(true);
        } else if (telaTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite as caracteristicas de tela do produto").setVisible(true);
        } else if (processadorTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite qual o processador do produto").setVisible(true);
        } else if (sistemaTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite qual o sistema do produto").setVisible(true);
        } else if (bateriaTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite a capacdidade de bateria do produto").setVisible(true);
        } else if (pesoTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite o peso do produto").setVisible(true);
        } else if (espessuraTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite a espessura do produto").setVisible(true);
        } else {   
            produto.setMarca_produto((String) marcaCb.getSelectedItem());
            produto.setModelo_produto(modeloProdutoTF.getText());
            produto.setPreco_compra(Double.valueOf(valorCompraTF.getText()));
            produto.setPreco_venda(Double.valueOf(valorVendaTF.getText()));
            produto.setEstoque(Integer.parseInt(estoqueTF.getText()));
            
            produto.getEspecificacao().setTela(telaTF.getText());
            produto.getEspecificacao().setBateria(bateriaTF.getText());
            produto.getEspecificacao().setMemoria((String) memoriaCb.getSelectedItem());
            produto.getEspecificacao().setArmazenamento((String) ArmazenamentoCb.getSelectedItem());
            produto.getEspecificacao().setPeso(Double.valueOf(pesoTF.getText()));
            produto.getEspecificacao().setProcessador(processadorTF.getText());
            produto.getEspecificacao().setSistema(sistemaTF.getText());
            produto.getEspecificacao().setEspessura(espessuraTF.getText());

            ProdutoDAO.editar(produto);
            dispose();
        }
    }
    
        public void montarComboBox() {
        DefaultComboBoxModel<String> cbMarcaModel = (DefaultComboBoxModel) marcaCb.getModel();
        cbMarcaModel.removeAllElements();
        cbMarcaModel.addElement("Marca");

        listaMarcas = new ArrayList<>(new LinkedHashSet<>(listaMarcas));

        for (marcaDTO marca : listaMarcas) {
            cbMarcaModel.addElement(marca.getMarca());
        }

        marcaCb.setModel(cbMarcaModel);
    }

    public void montarCbArmazenamentoMemoria() {
        DefaultComboBoxModel cbArmazenamentoModel = (DefaultComboBoxModel) ArmazenamentoCb.getModel();
        cbArmazenamentoModel.addElement("Armazenamento");
        DefaultComboBoxModel cbMemoriaModel = (DefaultComboBoxModel) memoriaCb.getModel();
        cbMemoriaModel.addElement("Memória");

        ArrayList<String> armazenamentoProduto = new ArrayList<>();
        armazenamentoProduto.add("16GB");
        armazenamentoProduto.add("32GB");
        armazenamentoProduto.add("64GB");
        armazenamentoProduto.add("128GB");
        armazenamentoProduto.add("256GB");
        armazenamentoProduto.add("512GB");
        armazenamentoProduto.add("1TB");
        armazenamentoProduto.add("2TB");
        armazenamentoProduto.add("4TB");

        for (String armazenamento : armazenamentoProduto) {
            cbArmazenamentoModel.addElement(armazenamento);
        }

        ArmazenamentoCb.setModel(cbArmazenamentoModel);

        ArrayList<String> memoriaProduto = new ArrayList<>();
        memoriaProduto.add("2GB");
        memoriaProduto.add("4GB");
        memoriaProduto.add("6GB");
        memoriaProduto.add("8GB");
        memoriaProduto.add("12GB");
        memoriaProduto.add("24GB");

        for (String memoria : memoriaProduto) {
            cbMemoriaModel.addElement(memoria);
        }

        memoriaCb.setModel(cbMemoriaModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ArmazenamentoCb;
    private javax.swing.JTextField bateriaTF;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado cancelarBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado editarProdutoBt;
    private javax.swing.JTextField espessuraTF;
    private javax.swing.JTextField estoqueTF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado limparCamposBt;
    private javax.swing.JComboBox<String> marcaCb;
    private javax.swing.JComboBox<String> memoriaCb;
    private javax.swing.JTextField modeloProdutoTF;
    private javax.swing.JLabel nomeProdutoLabel;
    private javax.swing.JTextField pesoTF;
    private javax.swing.JTextField processadorTF;
    private javax.swing.JTextField sistemaTF;
    private javax.swing.JTextField telaTF;
    private javax.swing.JLabel tituloVisualizarProduto;
    private javax.swing.JTextField valorCompraTF;
    private javax.swing.JTextField valorVendaTF;
    // End of variables declaration//GEN-END:variables
}
