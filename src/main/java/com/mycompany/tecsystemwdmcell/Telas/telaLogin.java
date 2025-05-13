package com.mycompany.tecsystemwdmcell.Telas;

import com.mycompany.tecsystemwdmcell.DAO.FuncionarioDAO;
import com.mycompany.tecsystemwdmcell.Modelos.Funcionario;
import com.mycompany.tecsystemwdmcell.Utilitarios.MD5;

public class telaLogin extends javax.swing.JFrame {

    public telaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLogin = new javax.swing.JPanel();
        senhaUsuario = new javax.swing.JPasswordField();
        nomeUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botãoCustomizado1 = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WDM Cell");
        setResizable(false);

        painelLogin.setBackground(new java.awt.Color(255, 255, 255));

        senhaUsuario.setBackground(new java.awt.Color(14, 122, 192));
        senhaUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        senhaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        senhaUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        nomeUsuario.setBackground(new java.awt.Color(14, 122, 192));
        nomeUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        nomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nomeUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Usuário");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Senha");

        botãoCustomizado1.setForeground(new java.awt.Color(255, 255, 255));
        botãoCustomizado1.setText("Entrar");
        botãoCustomizado1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botãoCustomizado1.setRound(5);
        botãoCustomizado1.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.CADASTRAR);
        botãoCustomizado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoCustomizado1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/largeLogo-image.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botãoCustomizado1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(senhaUsuario)
                        .addComponent(nomeUsuario)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(238, 238, 238))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botãoCustomizado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botãoCustomizado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoCustomizado1ActionPerformed
        String senha = new String(senhaUsuario.getPassword());
        senha = MD5.convertToMD5(senha);
        
        if (nomeUsuario.getText().isBlank() && senha.isBlank()) {
            new telaAlerta(null, true, "Digite o usuário e senha").setVisible(true);
        } else if (new String(senhaUsuario.getPassword()).isBlank()) {
            new telaAlerta(null, true, "Digite a senha de usuário").setVisible(true);
        } else if (nomeUsuario.getText().isBlank()) {
             new telaAlerta(null, true, "Digite o nome de usuário").setVisible(true);
        } else {
            if (FuncionarioDAO.login(nomeUsuario.getText(), senha) != null) {
                Funcionario funcionario = FuncionarioDAO.login(nomeUsuario.getText(), senha);
                
                new telaPrincipal(funcionario).setVisible(true);
                dispose();
            } else {
                new telaAlerta(null, true, "Usuário ou senha incorreto!").setVisible(true);
            }
        }
    }//GEN-LAST:event_botãoCustomizado1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado botãoCustomizado1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeUsuario;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPasswordField senhaUsuario;
    // End of variables declaration//GEN-END:variables
}
