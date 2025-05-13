package com.mycompany.tecsystemwdmcell.Telas;

import com.mycompany.tecsystemwdmcell.DTO.marcaDTO;
import java.util.List;

public class telaAdicionarMarca extends java.awt.Dialog {

    List<marcaDTO> listaMarcas;

    public telaAdicionarMarca(java.awt.Frame parent, boolean modal, List<marcaDTO> listaMarcas) {
        super(parent, modal);
        initComponents();
        this.listaMarcas = listaMarcas;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        adicionarMarcaTF = new javax.swing.JTextField();
        nomeProdutoLabel = new javax.swing.JLabel();
        adicionarBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        adicionarMarcaTF.setBackground(new java.awt.Color(255, 255, 255));
        adicionarMarcaTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adicionarMarcaTF.setForeground(new java.awt.Color(10, 79, 131));
        adicionarMarcaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        nomeProdutoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        nomeProdutoLabel.setForeground(new java.awt.Color(14, 122, 192));
        nomeProdutoLabel.setText("Adicionar Marca");

        adicionarBt.setForeground(new java.awt.Color(255, 255, 255));
        adicionarBt.setText("Adicionar");
        adicionarBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adicionarBt.setRound(5);
        adicionarBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.CADASTRAR);
        adicionarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nomeProdutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(adicionarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(adicionarMarcaTF))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adicionarMarcaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adicionarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void adicionarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarBtActionPerformed
        if (adicionarMarcaTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite o nome da marca").setVisible(true);
        } else {
            marcaDTO novaMarca  = new marcaDTO(adicionarMarcaTF.getText());
            listaMarcas.add(novaMarca);
            new telaAlerta(null, true, "Marca adicionada").setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_adicionarBtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado adicionarBt;
    private javax.swing.JTextField adicionarMarcaTF;
    private javax.swing.JLabel nomeProdutoLabel;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
