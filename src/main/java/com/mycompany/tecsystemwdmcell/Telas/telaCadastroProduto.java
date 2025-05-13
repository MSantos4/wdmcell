package com.mycompany.tecsystemwdmcell.Telas;

import com.mycompany.tecsystemwdmcell.DAO.ProdutoDAO;
import com.mycompany.tecsystemwdmcell.DTO.marcaDTO;
import com.mycompany.tecsystemwdmcell.Modelos.Especificacao;
import com.mycompany.tecsystemwdmcell.Modelos.Produto;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class telaCadastroProduto extends java.awt.Dialog {

    List<marcaDTO> listaMarcas = ProdutoDAO.listarMarcas();

    public telaCadastroProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        montarComboBox();
        montarCbArmazenamentoMemoria();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        memoriaCb = new javax.swing.JComboBox<>();
        cancelarBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        valorCompraTF = new javax.swing.JTextField();
        valorcompraProdutoLabel = new javax.swing.JLabel();
        valorVendaTF = new javax.swing.JTextField();
        valorvendaProdutoLabel = new javax.swing.JLabel();
        estoqueTF = new javax.swing.JTextField();
        estoqueProdutoLabel = new javax.swing.JLabel();
        telaTF = new javax.swing.JTextField();
        telaProdutoLabel = new javax.swing.JLabel();
        sistemaProdutoLabel = new javax.swing.JLabel();
        sistemaTF = new javax.swing.JTextField();
        processadorTF = new javax.swing.JTextField();
        processadorProdutoLabel = new javax.swing.JLabel();
        bateriaProdutoLabel = new javax.swing.JLabel();
        bateriaTF = new javax.swing.JTextField();
        pesoTF = new javax.swing.JTextField();
        pesoProdutoLabel = new javax.swing.JLabel();
        novoProdutoTitulo = new javax.swing.JLabel();
        espessuraTF = new javax.swing.JTextField();
        marcaCb = new javax.swing.JComboBox<>();
        espessuraProdutoLabel = new javax.swing.JLabel();
        modeloProdutoTF = new javax.swing.JTextField();
        cadastrarProdutoBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        nomeProdutoLabel = new javax.swing.JLabel();
        limparCamposBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        ArmazenamentoCb = new javax.swing.JComboBox<>();
        adicionarMarcaBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();

        setResizable(false);
        setTitle("Novo Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        memoriaCb.setBackground(new java.awt.Color(255, 255, 255));
        memoriaCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        memoriaCb.setForeground(new java.awt.Color(14, 122, 192));
        memoriaCb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 122, 192), 2, true));

        cancelarBt.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBt.setText("Cancelar");
        cancelarBt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cancelarBt.setRound(5);
        cancelarBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.CANCELAR);
        cancelarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtActionPerformed(evt);
            }
        });

        valorCompraTF.setBackground(new java.awt.Color(255, 255, 255));
        valorCompraTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valorCompraTF.setForeground(new java.awt.Color(10, 79, 131));
        valorCompraTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        valorcompraProdutoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        valorcompraProdutoLabel.setForeground(new java.awt.Color(14, 122, 192));
        valorcompraProdutoLabel.setText("Valor Compra");

        valorVendaTF.setBackground(new java.awt.Color(255, 255, 255));
        valorVendaTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valorVendaTF.setForeground(new java.awt.Color(10, 79, 131));
        valorVendaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        valorvendaProdutoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        valorvendaProdutoLabel.setForeground(new java.awt.Color(14, 122, 192));
        valorvendaProdutoLabel.setText("Valor Venda");

        estoqueTF.setBackground(new java.awt.Color(255, 255, 255));
        estoqueTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estoqueTF.setForeground(new java.awt.Color(10, 79, 131));
        estoqueTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        estoqueProdutoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        estoqueProdutoLabel.setForeground(new java.awt.Color(14, 122, 192));
        estoqueProdutoLabel.setText("Estoque");

        telaTF.setBackground(new java.awt.Color(255, 255, 255));
        telaTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telaTF.setForeground(new java.awt.Color(10, 79, 131));
        telaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        telaProdutoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        telaProdutoLabel.setForeground(new java.awt.Color(14, 122, 192));
        telaProdutoLabel.setText("Tela");

        sistemaProdutoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        sistemaProdutoLabel.setForeground(new java.awt.Color(14, 122, 192));
        sistemaProdutoLabel.setText("Sistema");
        sistemaProdutoLabel.setToolTipText("");

        sistemaTF.setBackground(new java.awt.Color(255, 255, 255));
        sistemaTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sistemaTF.setForeground(new java.awt.Color(10, 79, 131));
        sistemaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        processadorTF.setBackground(new java.awt.Color(255, 255, 255));
        processadorTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        processadorTF.setForeground(new java.awt.Color(10, 79, 131));
        processadorTF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        processadorTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        processadorProdutoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        processadorProdutoLabel.setForeground(new java.awt.Color(14, 122, 192));
        processadorProdutoLabel.setText("Processador");

        bateriaProdutoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        bateriaProdutoLabel.setForeground(new java.awt.Color(14, 122, 192));
        bateriaProdutoLabel.setText("Bateria");

        bateriaTF.setBackground(new java.awt.Color(255, 255, 255));
        bateriaTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bateriaTF.setForeground(new java.awt.Color(10, 79, 131));
        bateriaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        pesoTF.setBackground(new java.awt.Color(255, 255, 255));
        pesoTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pesoTF.setForeground(new java.awt.Color(10, 79, 131));
        pesoTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        pesoProdutoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        pesoProdutoLabel.setForeground(new java.awt.Color(14, 122, 192));
        pesoProdutoLabel.setText("Peso");

        novoProdutoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        novoProdutoTitulo.setForeground(new java.awt.Color(62, 174, 185));
        novoProdutoTitulo.setText("Novo Produto");

        espessuraTF.setBackground(new java.awt.Color(255, 255, 255));
        espessuraTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        espessuraTF.setForeground(new java.awt.Color(10, 79, 131));
        espessuraTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        marcaCb.setBackground(new java.awt.Color(255, 255, 255));
        marcaCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        marcaCb.setForeground(new java.awt.Color(14, 122, 192));
        marcaCb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 122, 192), 2, true));

        espessuraProdutoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        espessuraProdutoLabel.setForeground(new java.awt.Color(14, 122, 192));
        espessuraProdutoLabel.setText("Espessura");

        modeloProdutoTF.setBackground(new java.awt.Color(255, 255, 255));
        modeloProdutoTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modeloProdutoTF.setForeground(new java.awt.Color(10, 79, 131));
        modeloProdutoTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        cadastrarProdutoBt.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarProdutoBt.setText("Cadastrar");
        cadastrarProdutoBt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cadastrarProdutoBt.setRound(5);
        cadastrarProdutoBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.CADASTRAR);
        cadastrarProdutoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutoBtActionPerformed(evt);
            }
        });

        nomeProdutoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        nomeProdutoLabel.setForeground(new java.awt.Color(14, 122, 192));
        nomeProdutoLabel.setText("Modelo");

        limparCamposBt.setForeground(new java.awt.Color(21, 53, 85));
        limparCamposBt.setText("Limpar");
        limparCamposBt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        limparCamposBt.setRound(5);
        limparCamposBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.LIMPAR);

        ArmazenamentoCb.setBackground(new java.awt.Color(255, 255, 255));
        ArmazenamentoCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ArmazenamentoCb.setForeground(new java.awt.Color(14, 122, 192));
        ArmazenamentoCb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 122, 192), 2, true));

        adicionarMarcaBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/addicon-image.png"))); // NOI18N
        adicionarMarcaBt.setRound(20);
        adicionarMarcaBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        adicionarMarcaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMarcaBtActionPerformed(evt);
            }
        });

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(estoqueTF)
                                .addComponent(estoqueProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(valorVendaTF)
                                    .addComponent(valorvendaProdutoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(valorcompraProdutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(marcaCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modeloProdutoTF)
                                    .addComponent(nomeProdutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(valorCompraTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adicionarMarcaBt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sistemaProdutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(processadorProdutoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(processadorTF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sistemaTF)
                            .addComponent(telaTF)
                            .addComponent(telaProdutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bateriaProdutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bateriaTF)
                            .addComponent(ArmazenamentoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(memoriaCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(espessuraTF)
                            .addComponent(pesoTF)
                            .addComponent(espessuraProdutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pesoProdutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrarProdutoBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limparCamposBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(novoProdutoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
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
                                        .addComponent(telaProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19)
                                .addComponent(valorcompraProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorCompraTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pesoProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(espessuraProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(espessuraTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(adicionarMarcaBt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processadorProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(processadorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(valorvendaProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sistemaTF)
                            .addComponent(valorVendaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(estoqueProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estoqueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bateriaProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bateriaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sistemaProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastrarProdutoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(limparCamposBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void cadastrarProdutoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutoBtActionPerformed
        cadastrar();
    }//GEN-LAST:event_cadastrarProdutoBtActionPerformed

    private void adicionarMarcaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarMarcaBtActionPerformed
        new telaAdicionarMarca(null, true, listaMarcas).setVisible(true);
        montarComboBox();
    }//GEN-LAST:event_adicionarMarcaBtActionPerformed

    public void cadastrar() {
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

            Produto novoproduto = new Produto();
            
            novoproduto.setMarca_produto((String) marcaCb.getSelectedItem());
            novoproduto.setModelo_produto(modeloProdutoTF.getText());
            novoproduto.setPreco_compra(Double.valueOf(valorCompraTF.getText()));
            novoproduto.setPreco_venda(Double.valueOf(valorVendaTF.getText()));
            novoproduto.setEstoque(Integer.parseInt(estoqueTF.getText()));
            
            Especificacao especificacao = new Especificacao();
            
            especificacao.setTela(telaTF.getText());
            especificacao.setBateria(bateriaTF.getText());
            especificacao.setMemoria((String) memoriaCb.getSelectedItem());
            especificacao.setArmazenamento((String) ArmazenamentoCb.getSelectedItem());
            especificacao.setPeso(Double.valueOf(pesoTF.getText()));
            especificacao.setProcessador(processadorTF.getText());
            especificacao.setSistema(sistemaTF.getText());
            especificacao.setEspessura(espessuraTF.getText());

            novoproduto.setEspecificacao(especificacao);
            especificacao.setProduto(novoproduto);
            
            ProdutoDAO.adicionar(novoproduto);
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
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado adicionarMarcaBt;
    private javax.swing.JLabel bateriaProdutoLabel;
    private javax.swing.JTextField bateriaTF;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado cadastrarProdutoBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado cancelarBt;
    private javax.swing.JLabel espessuraProdutoLabel;
    private javax.swing.JTextField espessuraTF;
    private javax.swing.JLabel estoqueProdutoLabel;
    private javax.swing.JTextField estoqueTF;
    private javax.swing.JPanel jPanel1;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado limparCamposBt;
    private javax.swing.JComboBox<String> marcaCb;
    private javax.swing.JComboBox<String> memoriaCb;
    private javax.swing.JTextField modeloProdutoTF;
    private javax.swing.JLabel nomeProdutoLabel;
    private javax.swing.JLabel novoProdutoTitulo;
    private javax.swing.JLabel pesoProdutoLabel;
    private javax.swing.JTextField pesoTF;
    private javax.swing.JLabel processadorProdutoLabel;
    private javax.swing.JTextField processadorTF;
    private javax.swing.JLabel sistemaProdutoLabel;
    private javax.swing.JTextField sistemaTF;
    private javax.swing.JLabel telaProdutoLabel;
    private javax.swing.JTextField telaTF;
    private javax.swing.JTextField valorCompraTF;
    private javax.swing.JTextField valorVendaTF;
    private javax.swing.JLabel valorcompraProdutoLabel;
    private javax.swing.JLabel valorvendaProdutoLabel;
    // End of variables declaration//GEN-END:variables
}
