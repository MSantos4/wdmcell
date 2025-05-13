package com.mycompany.tecsystemwdmcell.Telas;

import com.mycompany.tecsystemwdmcell.DAO.CaixaDAO;
import com.mycompany.tecsystemwdmcell.DAO.ClienteDAO;
import com.mycompany.tecsystemwdmcell.DAO.FuncionarioDAO;
import com.mycompany.tecsystemwdmcell.DAO.ProdutoDAO;
import com.mycompany.tecsystemwdmcell.DTO.estoqueDTO;
import com.mycompany.tecsystemwdmcell.DTO.ultimaVendaDTO;
import com.mycompany.tecsystemwdmcell.Modelos.Cliente;
import com.mycompany.tecsystemwdmcell.Modelos.Funcionario;
import com.mycompany.tecsystemwdmcell.Modelos.Login;
import com.mycompany.tecsystemwdmcell.Modelos.Produto;
import com.mycompany.tecsystemwdmcell.Utilitarios.MD5;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class telaPrincipal extends javax.swing.JFrame {

    private Funcionario funcionario;

    public telaPrincipal(Funcionario funcionario) {
        initComponents();
        this.funcionario = funcionario;

        usuarioAcesso();
        montarTabelaAdministradores();
        montarTabelaClientes();
        montarTabelaProdutos();
        montarTabelasEstoque();
        montarTabelasUltimasVendas();
    }

    public void usuarioAcesso() {

        switch (funcionario.getLogin().getNivelpermissao()) {
            case "Gerente" -> {
                administradoresBt.setEnabled(false);
            }
            case "Vendedor" -> {
                administradoresBt.setEnabled(false);

                novoProdutoBT.setEnabled(false);
                novoProdutoBt.setEnabled(false);
                editarProdutoBt.setEnabled(false);
                excluirProdutoBt.setEnabled(false);
            }
            case "Caixa" -> {
                administradoresBt.setEnabled(false);

                novoProdutoBT.setEnabled(false);
                novoProdutoBt.setEnabled(false);
                editarProdutoBt.setEnabled(false);
                excluirProdutoBt.setEnabled(false);

                editarClienteBt.setEnabled(false);
            }
        }
        labelNomeADM.setText("Seja Bem vindo(a): " + funcionario.getNome());
        labelNivelAcessoADM.setText("Nível de Acesso: " + funcionario.getLogin().getNivelpermissao());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        menuLateral = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        inicioBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        produtosBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        clientesBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        vendasBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        jPanel3 = new javax.swing.JPanel();
        administradoresBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        sairBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        CardLayout = new javax.swing.JPanel();
        telaInicio = new javax.swing.JPanel();
        painelCustomizado1 = new com.mycompany.tecsystemwdmcell.Utilitarios.PainelCustomizado();
        labelNomeADM = new javax.swing.JLabel();
        labelNivelAcessoADM = new javax.swing.JLabel();
        labelUltimasVendas = new javax.swing.JLabel();
        labelAcessoRapido = new javax.swing.JLabel();
        novoClienteBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        novoProdutoBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        novaVendaBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        labelEstoque = new javax.swing.JLabel();
        painelCustomizado4 = new com.mycompany.tecsystemwdmcell.Utilitarios.PainelCustomizado();
        labelTituloProdutosEstoque = new javax.swing.JLabel();
        labelEstoqueProdutos = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        valorCustoLabel = new javax.swing.JLabel();
        valorVendaLabel = new javax.swing.JLabel();
        valorLucroBrutoLabel = new javax.swing.JLabel();
        tabelaUltimasVendasPanel = new javax.swing.JScrollPane();
        tabelaUltimasVendas = new javax.swing.JTable();
        tabelaEstoquePanel = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        telaProdutos = new javax.swing.JPanel();
        logoPainelProdutos = new javax.swing.JPanel();
        logoProdutos = new javax.swing.JLabel();
        subtituloProdutos = new javax.swing.JLabel();
        tabelaProdutosPainel = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        novoProdutoBT = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        editarProdutoBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        excluirProdutoBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        telaClientes = new javax.swing.JPanel();
        logoPainelClientes = new javax.swing.JPanel();
        logoClientes = new javax.swing.JLabel();
        subtituloClientes = new javax.swing.JLabel();
        tabelaClientesPainel = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        novoClienteBt2 = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        excluirClienteBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        editarClienteBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        telaVendas = new javax.swing.JPanel();
        tabelaVendasPanel = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        tabelaEstoqueVendasPainel = new javax.swing.JScrollPane();
        tabelaEstoqueVendas = new javax.swing.JTable();
        logoPainelClientes2 = new javax.swing.JPanel();
        logoVenda = new javax.swing.JLabel();
        subtituloVendas = new javax.swing.JLabel();
        novaVendaBt2 = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telaAdministradores = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaAdministradores = new javax.swing.JTable();
        excluirADMBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        editarADMBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        cadastrarADMTitulo = new javax.swing.JLabel();
        permissaoCb = new javax.swing.JComboBox<>();
        nomeFuncionarioLabel = new javax.swing.JLabel();
        nomefuncionarioTF = new javax.swing.JTextField();
        cpffuncionarioTF = new javax.swing.JTextField();
        cpfFuncionarioLabel = new javax.swing.JLabel();
        matriculaLabel = new javax.swing.JLabel();
        matriculaTF = new javax.swing.JTextField();
        nomeusuarioTF = new javax.swing.JTextField();
        nomeUsuarioLabel = new javax.swing.JLabel();
        novasenhaTF = new javax.swing.JTextField();
        novaSenhaLabel = new javax.swing.JLabel();
        cadastrarADMBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        limparCamosADMBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WDM Cell");
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setName("framePrincipal"); // NOI18N

        Principal.setBackground(new java.awt.Color(255, 255, 255));

        menuLateral.setBackground(new java.awt.Color(255, 255, 255));
        menuLateral.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/samllLogo-image.png"))); // NOI18N
        jLabel1.setDoubleBuffered(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        inicioBt.setForeground(new java.awt.Color(14, 122, 192));
        inicioBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/smallHouse-image.png"))); // NOI18N
        inicioBt.setText("Início");
        inicioBt.setDoubleBuffered(true);
        inicioBt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        inicioBt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inicioBt.setIconTextGap(20);
        inicioBt.setRound(5);
        inicioBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.DEFAULT);
        inicioBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioBtActionPerformed(evt);
            }
        });

        produtosBt.setForeground(new java.awt.Color(14, 122, 192));
        produtosBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/smalBox-image.png"))); // NOI18N
        produtosBt.setText("Produtos");
        produtosBt.setDoubleBuffered(true);
        produtosBt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        produtosBt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        produtosBt.setIconTextGap(20);
        produtosBt.setRound(5);
        produtosBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.DEFAULT);
        produtosBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosBtActionPerformed(evt);
            }
        });

        clientesBt.setForeground(new java.awt.Color(14, 122, 192));
        clientesBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/smallPerson-image.png"))); // NOI18N
        clientesBt.setText("Clientes");
        clientesBt.setDoubleBuffered(true);
        clientesBt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        clientesBt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientesBt.setIconTextGap(20);
        clientesBt.setRound(5);
        clientesBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.DEFAULT);
        clientesBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesBtActionPerformed(evt);
            }
        });

        vendasBt.setForeground(new java.awt.Color(14, 122, 192));
        vendasBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/smallBox2-image.png"))); // NOI18N
        vendasBt.setText("Vendas");
        vendasBt.setDoubleBuffered(true);
        vendasBt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        vendasBt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        vendasBt.setIconTextGap(20);
        vendasBt.setRound(5);
        vendasBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.DEFAULT);
        vendasBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendasBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inicioBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtosBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientesBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vendasBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicioBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produtosBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientesBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendasBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        administradoresBt.setForeground(new java.awt.Color(14, 122, 192));
        administradoresBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/smalladm-image.png"))); // NOI18N
        administradoresBt.setText("Administradores");
        administradoresBt.setDoubleBuffered(true);
        administradoresBt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        administradoresBt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        administradoresBt.setIconTextGap(20);
        administradoresBt.setRound(5);
        administradoresBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.DEFAULT);
        administradoresBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administradoresBtActionPerformed(evt);
            }
        });

        sairBt.setForeground(new java.awt.Color(14, 122, 192));
        sairBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/smalllogout-image.png"))); // NOI18N
        sairBt.setText("Sair");
        sairBt.setDoubleBuffered(true);
        sairBt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        sairBt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sairBt.setIconTextGap(28);
        sairBt.setRound(5);
        sairBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.DEFAULT);
        sairBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(administradoresBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sairBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(administradoresBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sairBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        CardLayout.setLayout(new java.awt.CardLayout());

        telaInicio.setBackground(new java.awt.Color(255, 255, 255));

        painelCustomizado1.setBackground(new java.awt.Color(242, 242, 242));
        painelCustomizado1.setRound(10);

        labelNomeADM.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelNomeADM.setForeground(new java.awt.Color(10, 79, 131));
        labelNomeADM.setText("Seja Bem vindo(a): ");

        labelNivelAcessoADM.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelNivelAcessoADM.setForeground(new java.awt.Color(38, 153, 226));
        labelNivelAcessoADM.setText("Nível de Acesso: ");

        javax.swing.GroupLayout painelCustomizado1Layout = new javax.swing.GroupLayout(painelCustomizado1);
        painelCustomizado1.setLayout(painelCustomizado1Layout);
        painelCustomizado1Layout.setHorizontalGroup(
            painelCustomizado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCustomizado1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCustomizado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNivelAcessoADM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNomeADM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelCustomizado1Layout.setVerticalGroup(
            painelCustomizado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCustomizado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomeADM, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNivelAcessoADM, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelUltimasVendas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        labelUltimasVendas.setForeground(new java.awt.Color(21, 53, 85));
        labelUltimasVendas.setText("Últimas vendas");

        labelAcessoRapido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        labelAcessoRapido.setForeground(new java.awt.Color(21, 53, 85));
        labelAcessoRapido.setText("Acesso Rápido");

        novoClienteBt.setForeground(new java.awt.Color(255, 255, 255));
        novoClienteBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/normalPerson-image.png"))); // NOI18N
        novoClienteBt.setText("Novo Cliente");
        novoClienteBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        novoClienteBt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        novoClienteBt.setRound(5);
        novoClienteBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        novoClienteBt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        novoClienteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoClienteBtActionPerformed(evt);
            }
        });

        novoProdutoBt.setForeground(new java.awt.Color(255, 255, 255));
        novoProdutoBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/normalbox-image.png"))); // NOI18N
        novoProdutoBt.setText("Novo Produto");
        novoProdutoBt.setToolTipText("");
        novoProdutoBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        novoProdutoBt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        novoProdutoBt.setRound(5);
        novoProdutoBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        novoProdutoBt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        novoProdutoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoProdutoBtActionPerformed(evt);
            }
        });

        novaVendaBt.setForeground(new java.awt.Color(255, 255, 255));
        novaVendaBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/normalBox2-image.png"))); // NOI18N
        novaVendaBt.setText("Nova Venda");
        novaVendaBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        novaVendaBt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        novaVendaBt.setRound(5);
        novaVendaBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        novaVendaBt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        novaVendaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaVendaBtActionPerformed(evt);
            }
        });

        labelEstoque.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        labelEstoque.setForeground(new java.awt.Color(21, 53, 85));
        labelEstoque.setText("Estoque");

        painelCustomizado4.setBackground(new java.awt.Color(14, 122, 192));
        painelCustomizado4.setRound(10);

        labelTituloProdutosEstoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTituloProdutosEstoque.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloProdutosEstoque.setText("Produtos em estoque");

        labelEstoqueProdutos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEstoqueProdutos.setForeground(new java.awt.Color(255, 255, 255));
        labelEstoqueProdutos.setText("200");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Valor de custo");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Lucro estimado");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Valor de venda");

        valorCustoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valorCustoLabel.setForeground(new java.awt.Color(255, 255, 255));
        valorCustoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        valorCustoLabel.setText("R$ 4000");

        valorVendaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valorVendaLabel.setForeground(new java.awt.Color(255, 255, 255));
        valorVendaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        valorVendaLabel.setText("R$ 7000");

        valorLucroBrutoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valorLucroBrutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        valorLucroBrutoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        valorLucroBrutoLabel.setText("R$ 3000");

        javax.swing.GroupLayout painelCustomizado4Layout = new javax.swing.GroupLayout(painelCustomizado4);
        painelCustomizado4.setLayout(painelCustomizado4Layout);
        painelCustomizado4Layout.setHorizontalGroup(
            painelCustomizado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCustomizado4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCustomizado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTituloProdutosEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(labelEstoqueProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelCustomizado4Layout.createSequentialGroup()
                        .addGroup(painelCustomizado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(painelCustomizado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCustomizado4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(valorCustoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(painelCustomizado4Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(painelCustomizado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorLucroBrutoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(valorVendaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        painelCustomizado4Layout.setVerticalGroup(
            painelCustomizado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCustomizado4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloProdutosEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEstoqueProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelCustomizado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorCustoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCustomizado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorVendaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(painelCustomizado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorLucroBrutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        tabelaUltimasVendasPanel.setBackground(new java.awt.Color(255, 255, 255));
        tabelaUltimasVendasPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tabelaUltimasVendasPanel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        tabelaUltimasVendas.setBackground(new java.awt.Color(242, 242, 242));
        tabelaUltimasVendas.setForeground(new java.awt.Color(51, 51, 51));
        tabelaUltimasVendas.getTableHeader().setBackground(new Color(62, 174,185));
        tabelaUltimasVendas.getTableHeader().setForeground(new Color(255, 255,255));
        tabelaUltimasVendas.getTableHeader().setReorderingAllowed(false);
        tabelaUltimasVendas.getTableHeader().setSize(40, 40);
        tabelaUltimasVendas.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 16));
        tabelaUltimasVendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabelaUltimasVendas.setForeground(new java.awt.Color(10, 79, 131));
        tabelaUltimasVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUltimasVendas.setFocusable(false);
        tabelaUltimasVendas.setGridColor(new java.awt.Color(242, 242, 242));
        tabelaUltimasVendas.setRequestFocusEnabled(false);
        tabelaUltimasVendas.setRowHeight(40);
        tabelaUltimasVendas.setRowSelectionAllowed(false);
        tabelaUltimasVendas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaUltimasVendas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaUltimasVendasPanel.setViewportView(tabelaUltimasVendas);
        if (tabelaUltimasVendas.getColumnModel().getColumnCount() > 0) {
            tabelaUltimasVendas.getColumnModel().getColumn(0).setResizable(false);
            tabelaUltimasVendas.getColumnModel().getColumn(0).setPreferredWidth(90);
            tabelaUltimasVendas.getColumnModel().getColumn(1).setResizable(false);
            tabelaUltimasVendas.getColumnModel().getColumn(1).setPreferredWidth(120);
            tabelaUltimasVendas.getColumnModel().getColumn(2).setResizable(false);
            tabelaUltimasVendas.getColumnModel().getColumn(2).setPreferredWidth(40);
        }

        tabelaEstoquePanel.setBackground(new java.awt.Color(255, 255, 255));
        tabelaEstoquePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabelaEstoquePanel.setFocusable(false);

        tabelaEstoque.setBackground(new java.awt.Color(242, 242, 242));
        tabelaEstoque.getTableHeader().setBackground(new Color(62, 174,185));
        tabelaEstoque.getTableHeader().setForeground(new Color(255, 255,255));
        tabelaEstoque.getTableHeader().setReorderingAllowed(false);
        tabelaEstoque.getTableHeader().setSize(40, 40);
        tabelaEstoque.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 14));
        tabelaEstoque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabelaEstoque.setForeground(new java.awt.Color(10, 79, 131));
        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Modelo", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEstoque.setFocusable(false);
        tabelaEstoque.setGridColor(new java.awt.Color(242, 242, 242));
        tabelaEstoque.setRequestFocusEnabled(false);
        tabelaEstoque.setRowHeight(40);
        tabelaEstoque.setRowSelectionAllowed(false);
        tabelaEstoque.setSelectionBackground(new java.awt.Color(226, 255, 240));
        tabelaEstoque.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tabelaEstoquePanel.setViewportView(tabelaEstoque);
        if (tabelaEstoque.getColumnModel().getColumnCount() > 0) {
            tabelaEstoque.getColumnModel().getColumn(0).setResizable(false);
            tabelaEstoque.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabelaEstoque.getColumnModel().getColumn(1).setResizable(false);
            tabelaEstoque.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        javax.swing.GroupLayout telaInicioLayout = new javax.swing.GroupLayout(telaInicio);
        telaInicio.setLayout(telaInicioLayout);
        telaInicioLayout.setHorizontalGroup(
            telaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInicioLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(telaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelUltimasVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAcessoRapido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(telaInicioLayout.createSequentialGroup()
                        .addComponent(novoClienteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(novoProdutoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(novaVendaBt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelCustomizado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabelaUltimasVendasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(telaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInicioLayout.createSequentialGroup()
                        .addGroup(telaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tabelaEstoquePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(painelCustomizado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addGroup(telaInicioLayout.createSequentialGroup()
                        .addComponent(labelEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46))))
        );
        telaInicioLayout.setVerticalGroup(
            telaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInicioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(telaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInicioLayout.createSequentialGroup()
                        .addComponent(painelCustomizado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelUltimasVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tabelaUltimasVendasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(labelAcessoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(telaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(novoProdutoBt, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(novaVendaBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(novoClienteBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(telaInicioLayout.createSequentialGroup()
                        .addComponent(labelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabelaEstoquePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCustomizado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );

        CardLayout.add(telaInicio, "Inicio");

        telaProdutos.setBackground(new java.awt.Color(255, 255, 255));

        logoPainelProdutos.setBackground(new java.awt.Color(255, 255, 255));

        logoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/normalboxBlue-image.png"))); // NOI18N

        subtituloProdutos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subtituloProdutos.setForeground(new java.awt.Color(21, 53, 85));
        subtituloProdutos.setText("Produtos");

        javax.swing.GroupLayout logoPainelProdutosLayout = new javax.swing.GroupLayout(logoPainelProdutos);
        logoPainelProdutos.setLayout(logoPainelProdutosLayout);
        logoPainelProdutosLayout.setHorizontalGroup(
            logoPainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPainelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoProdutos)
                .addGap(18, 18, 18)
                .addComponent(subtituloProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        logoPainelProdutosLayout.setVerticalGroup(
            logoPainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPainelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoPainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtituloProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabelaProdutosPainel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        tabelaProdutos.setBackground(new java.awt.Color(242, 242, 242));
        tabelaProdutos.getTableHeader().setBackground(new Color(62, 174,185));
        tabelaProdutos.getTableHeader().setForeground(new Color(255, 255,255));
        tabelaProdutos.getTableHeader().setReorderingAllowed(false);
        tabelaProdutos.getTableHeader().setSize(40, 40);
        tabelaProdutos.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 14));
        tabelaProdutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabelaProdutos.setForeground(new java.awt.Color(10, 79, 131));
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Marca", "Modelo", "Armazenamento", "Memoria", "Bateria", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.setGridColor(new java.awt.Color(242, 242, 242));
        tabelaProdutos.setRowHeight(40);
        tabelaProdutos.setShowGrid(false);
        tabelaProdutosPainel.setViewportView(tabelaProdutos);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(0).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaProdutos.getColumnModel().getColumn(1).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabelaProdutos.getColumnModel().getColumn(2).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(160);
            tabelaProdutos.getColumnModel().getColumn(3).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabelaProdutos.getColumnModel().getColumn(4).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(60);
            tabelaProdutos.getColumnModel().getColumn(5).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(5).setPreferredWidth(60);
            tabelaProdutos.getColumnModel().getColumn(6).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        novoProdutoBT.setForeground(new java.awt.Color(255, 255, 255));
        novoProdutoBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/normalbox-image.png"))); // NOI18N
        novoProdutoBT.setText("Novo Produto");
        novoProdutoBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        novoProdutoBT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        novoProdutoBT.setRound(10);
        novoProdutoBT.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        novoProdutoBT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        novoProdutoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoProdutoBTActionPerformed(evt);
            }
        });

        editarProdutoBt.setForeground(new java.awt.Color(255, 255, 255));
        editarProdutoBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/updateicon-image.png"))); // NOI18N
        editarProdutoBt.setText("Editar Produto");
        editarProdutoBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarProdutoBt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editarProdutoBt.setRound(10);
        editarProdutoBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        editarProdutoBt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editarProdutoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProdutoBtActionPerformed(evt);
            }
        });

        excluirProdutoBt.setForeground(new java.awt.Color(255, 255, 255));
        excluirProdutoBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/deleteicon-image.png"))); // NOI18N
        excluirProdutoBt.setText("Excluir Produto");
        excluirProdutoBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        excluirProdutoBt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        excluirProdutoBt.setRound(10);
        excluirProdutoBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        excluirProdutoBt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excluirProdutoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirProdutoBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaProdutosLayout = new javax.swing.GroupLayout(telaProdutos);
        telaProdutos.setLayout(telaProdutosLayout);
        telaProdutosLayout.setHorizontalGroup(
            telaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaProdutosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(telaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaProdutosLayout.createSequentialGroup()
                        .addComponent(novoProdutoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editarProdutoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(excluirProdutoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logoPainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabelaProdutosPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        telaProdutosLayout.setVerticalGroup(
            telaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaProdutosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(logoPainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabelaProdutosPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(telaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(novoProdutoBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarProdutoBt, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(excluirProdutoBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        CardLayout.add(telaProdutos, "Produtos");

        telaClientes.setBackground(new java.awt.Color(255, 255, 255));

        logoPainelClientes.setBackground(new java.awt.Color(255, 255, 255));

        logoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/normalPersonBlue-image.png"))); // NOI18N

        subtituloClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subtituloClientes.setForeground(new java.awt.Color(21, 53, 85));
        subtituloClientes.setText("Clientes");

        javax.swing.GroupLayout logoPainelClientesLayout = new javax.swing.GroupLayout(logoPainelClientes);
        logoPainelClientes.setLayout(logoPainelClientesLayout);
        logoPainelClientesLayout.setHorizontalGroup(
            logoPainelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPainelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoClientes)
                .addGap(18, 18, 18)
                .addComponent(subtituloClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        logoPainelClientesLayout.setVerticalGroup(
            logoPainelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPainelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoPainelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtituloClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabelaClientesPainel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        tabelaClientes.setBackground(new java.awt.Color(242, 242, 242));
        tabelaClientes.getTableHeader().setBackground(new Color(62, 174,185));
        tabelaClientes.getTableHeader().setForeground(new Color(255, 255,255));
        tabelaClientes.getTableHeader().setReorderingAllowed(false);
        tabelaClientes.getTableHeader().setSize(40, 40);
        tabelaClientes.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 14));
        tabelaClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabelaClientes.setForeground(new java.awt.Color(10, 79, 131));
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome do Cliente", "CPF", "E-mail", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClientes.setGridColor(new java.awt.Color(242, 242, 242));
        tabelaClientes.setRowHeight(40);
        tabelaClientesPainel.setViewportView(tabelaClientes);
        if (tabelaClientes.getColumnModel().getColumnCount() > 0) {
            tabelaClientes.getColumnModel().getColumn(0).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaClientes.getColumnModel().getColumn(1).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(180);
            tabelaClientes.getColumnModel().getColumn(2).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabelaClientes.getColumnModel().getColumn(3).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabelaClientes.getColumnModel().getColumn(4).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        novoClienteBt2.setBackground(new java.awt.Color(14, 122, 192));
        novoClienteBt2.setForeground(new java.awt.Color(255, 255, 255));
        novoClienteBt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/normalPerson-image.png"))); // NOI18N
        novoClienteBt2.setText("Novo Cliente");
        novoClienteBt2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        novoClienteBt2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        novoClienteBt2.setRound(10);
        novoClienteBt2.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        novoClienteBt2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        novoClienteBt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoClienteBt2ActionPerformed(evt);
            }
        });

        excluirClienteBt.setBackground(new java.awt.Color(14, 122, 192));
        excluirClienteBt.setForeground(new java.awt.Color(255, 255, 255));
        excluirClienteBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/deleteicon-image.png"))); // NOI18N
        excluirClienteBt.setText("Excluir Cliente");
        excluirClienteBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        excluirClienteBt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        excluirClienteBt.setRound(10);
        excluirClienteBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        excluirClienteBt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excluirClienteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirClienteBtActionPerformed(evt);
            }
        });

        editarClienteBt.setBackground(new java.awt.Color(14, 122, 192));
        editarClienteBt.setForeground(new java.awt.Color(255, 255, 255));
        editarClienteBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/updateicon-image.png"))); // NOI18N
        editarClienteBt.setText("Editar Cliente");
        editarClienteBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarClienteBt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editarClienteBt.setRound(10);
        editarClienteBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        editarClienteBt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editarClienteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarClienteBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaClientesLayout = new javax.swing.GroupLayout(telaClientes);
        telaClientes.setLayout(telaClientesLayout);
        telaClientesLayout.setHorizontalGroup(
            telaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaClientesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(telaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoPainelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(telaClientesLayout.createSequentialGroup()
                        .addComponent(novoClienteBt2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarClienteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(excluirClienteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabelaClientesPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        telaClientesLayout.setVerticalGroup(
            telaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaClientesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(logoPainelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabelaClientesPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(telaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(excluirClienteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novoClienteBt2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarClienteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        CardLayout.add(telaClientes, "Clientes");

        telaVendas.setBackground(new java.awt.Color(255, 255, 255));

        tabelaVendasPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        tabelaVendas.setBackground(new java.awt.Color(242, 242, 242));
        tabelaVendas.getTableHeader().setBackground(new Color(62, 174,185));
        tabelaVendas.getTableHeader().setForeground(new Color(255, 255,255));
        tabelaVendas.getTableHeader().setReorderingAllowed(false);
        tabelaVendas.getTableHeader().setSize(40, 40);
        tabelaVendas.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 14));
        tabelaVendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabelaVendas.setForeground(new java.awt.Color(10, 79, 131));
        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVendas.setFocusable(false);
        tabelaVendas.setGridColor(new java.awt.Color(242, 242, 242));
        tabelaVendas.setRequestFocusEnabled(false);
        tabelaVendas.setRowHeight(40);
        tabelaVendas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaVendas.setShowGrid(true);
        tabelaVendasPanel.setViewportView(tabelaVendas);
        if (tabelaVendas.getColumnModel().getColumnCount() > 0) {
            tabelaVendas.getColumnModel().getColumn(0).setResizable(false);
            tabelaVendas.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabelaVendas.getColumnModel().getColumn(1).setResizable(false);
            tabelaVendas.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelaVendas.getColumnModel().getColumn(2).setResizable(false);
            tabelaVendas.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabelaVendas.getColumnModel().getColumn(3).setResizable(false);
            tabelaVendas.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        tabelaEstoqueVendasPainel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        tabelaEstoqueVendas.setBackground(new java.awt.Color(242, 242, 242));
        tabelaEstoqueVendas.getTableHeader().setBackground(new Color(62, 174,185));
        tabelaEstoqueVendas.getTableHeader().setForeground(new Color(255, 255,255));
        tabelaEstoqueVendas.getTableHeader().setReorderingAllowed(false);
        tabelaEstoqueVendas.getTableHeader().setSize(40, 40);
        tabelaEstoqueVendas.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 14));
        tabelaEstoqueVendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabelaEstoqueVendas.setForeground(new java.awt.Color(10, 79, 131));
        tabelaEstoqueVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Modelo", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEstoqueVendas.setFocusable(false);
        tabelaEstoqueVendas.setGridColor(new java.awt.Color(242, 242, 242));
        tabelaEstoqueVendas.setRequestFocusEnabled(false);
        tabelaEstoqueVendas.setRowHeight(40);
        tabelaEstoqueVendas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaEstoqueVendasPainel.setViewportView(tabelaEstoqueVendas);
        if (tabelaEstoqueVendas.getColumnModel().getColumnCount() > 0) {
            tabelaEstoqueVendas.getColumnModel().getColumn(0).setResizable(false);
            tabelaEstoqueVendas.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabelaEstoqueVendas.getColumnModel().getColumn(1).setResizable(false);
            tabelaEstoqueVendas.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        logoPainelClientes2.setBackground(new java.awt.Color(255, 255, 255));

        logoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/normalBox2Blue-image.png"))); // NOI18N

        subtituloVendas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subtituloVendas.setForeground(new java.awt.Color(21, 53, 85));
        subtituloVendas.setText("Vendas");

        javax.swing.GroupLayout logoPainelClientes2Layout = new javax.swing.GroupLayout(logoPainelClientes2);
        logoPainelClientes2.setLayout(logoPainelClientes2Layout);
        logoPainelClientes2Layout.setHorizontalGroup(
            logoPainelClientes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPainelClientes2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoVenda)
                .addGap(18, 18, 18)
                .addComponent(subtituloVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        logoPainelClientes2Layout.setVerticalGroup(
            logoPainelClientes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPainelClientes2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoPainelClientes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtituloVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        novaVendaBt2.setForeground(new java.awt.Color(255, 255, 255));
        novaVendaBt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/normalBox2-image.png"))); // NOI18N
        novaVendaBt2.setText("Nova venda");
        novaVendaBt2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        novaVendaBt2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        novaVendaBt2.setRound(10);
        novaVendaBt2.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        novaVendaBt2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        novaVendaBt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaVendaBt2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 53, 85));
        jLabel3.setText("Últimas Vendas");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(21, 53, 85));
        jLabel4.setText("Estoque");

        javax.swing.GroupLayout telaVendasLayout = new javax.swing.GroupLayout(telaVendas);
        telaVendas.setLayout(telaVendasLayout);
        telaVendasLayout.setHorizontalGroup(
            telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaVendasLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoPainelClientes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novaVendaBt2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabelaVendasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabelaEstoqueVendasPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        telaVendasLayout.setVerticalGroup(
            telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaVendasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(logoPainelClientes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabelaEstoqueVendasPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(tabelaVendasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(novaVendaBt2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CardLayout.add(telaVendas, "Vendas");

        telaAdministradores.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 53, 85));
        jLabel2.setText("Administradores");

        jScrollPane4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        tabelaAdministradores.setBackground(new java.awt.Color(242, 242, 242));
        tabelaAdministradores.getTableHeader().setBackground(new Color(62, 174,185));
        tabelaAdministradores.getTableHeader().setForeground(new Color(255, 255,255));
        tabelaAdministradores.getTableHeader().setReorderingAllowed(false);
        tabelaAdministradores.getTableHeader().setSize(40, 40);
        tabelaAdministradores.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 14));
        tabelaAdministradores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabelaAdministradores.setForeground(new java.awt.Color(10, 79, 131));
        tabelaAdministradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome do Funcionário", "Matrícula", "CPF", "Usuário", "Permissão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAdministradores.setGridColor(new java.awt.Color(242, 242, 242));
        tabelaAdministradores.setRowHeight(40);
        jScrollPane4.setViewportView(tabelaAdministradores);
        if (tabelaAdministradores.getColumnModel().getColumnCount() > 0) {
            tabelaAdministradores.getColumnModel().getColumn(0).setResizable(false);
            tabelaAdministradores.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaAdministradores.getColumnModel().getColumn(1).setResizable(false);
            tabelaAdministradores.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelaAdministradores.getColumnModel().getColumn(2).setResizable(false);
            tabelaAdministradores.getColumnModel().getColumn(2).setPreferredWidth(40);
            tabelaAdministradores.getColumnModel().getColumn(3).setResizable(false);
            tabelaAdministradores.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabelaAdministradores.getColumnModel().getColumn(4).setResizable(false);
            tabelaAdministradores.getColumnModel().getColumn(4).setPreferredWidth(120);
            tabelaAdministradores.getColumnModel().getColumn(5).setResizable(false);
            tabelaAdministradores.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        excluirADMBt.setForeground(new java.awt.Color(255, 255, 255));
        excluirADMBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/deleteicon-image.png"))); // NOI18N
        excluirADMBt.setText("Excluir ADM");
        excluirADMBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        excluirADMBt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        excluirADMBt.setRound(10);
        excluirADMBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        excluirADMBt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excluirADMBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirADMBtActionPerformed(evt);
            }
        });

        editarADMBt.setForeground(new java.awt.Color(255, 255, 255));
        editarADMBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/updateicon-image.png"))); // NOI18N
        editarADMBt.setText("Editar ADM");
        editarADMBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarADMBt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editarADMBt.setRound(10);
        editarADMBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        editarADMBt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editarADMBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarADMBtActionPerformed(evt);
            }
        });

        cadastrarADMTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cadastrarADMTitulo.setForeground(new java.awt.Color(21, 53, 85));
        cadastrarADMTitulo.setText("Cadastrar Administrador");

        permissaoCb.setBackground(new java.awt.Color(255, 255, 255));
        permissaoCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        permissaoCb.setForeground(new java.awt.Color(14, 122, 192));
        permissaoCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nível Acesso", "Administrador", "Gerente", "Vendedor", "Caixa" }));
        permissaoCb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 122, 192), 2, true));

        nomeFuncionarioLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        nomeFuncionarioLabel.setForeground(new java.awt.Color(14, 122, 192));
        nomeFuncionarioLabel.setText("Nome do Funcionário");

        nomefuncionarioTF.setBackground(new java.awt.Color(255, 255, 255));
        nomefuncionarioTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomefuncionarioTF.setForeground(new java.awt.Color(10, 79, 131));
        nomefuncionarioTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        cpffuncionarioTF.setBackground(new java.awt.Color(255, 255, 255));
        cpffuncionarioTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cpffuncionarioTF.setForeground(new java.awt.Color(10, 79, 131));
        cpffuncionarioTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        cpfFuncionarioLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        cpfFuncionarioLabel.setForeground(new java.awt.Color(14, 122, 192));
        cpfFuncionarioLabel.setText("CPF do Funcionário");

        matriculaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        matriculaLabel.setForeground(new java.awt.Color(14, 122, 192));
        matriculaLabel.setText("Matrícula do Funcionário");

        matriculaTF.setBackground(new java.awt.Color(255, 255, 255));
        matriculaTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        matriculaTF.setForeground(new java.awt.Color(10, 79, 131));
        matriculaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        nomeusuarioTF.setBackground(new java.awt.Color(255, 255, 255));
        nomeusuarioTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomeusuarioTF.setForeground(new java.awt.Color(10, 79, 131));
        nomeusuarioTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        nomeUsuarioLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        nomeUsuarioLabel.setForeground(new java.awt.Color(14, 122, 192));
        nomeUsuarioLabel.setText("Nome de Usuário");

        novasenhaTF.setBackground(new java.awt.Color(255, 255, 255));
        novasenhaTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        novasenhaTF.setForeground(new java.awt.Color(10, 79, 131));
        novasenhaTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        novaSenhaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        novaSenhaLabel.setForeground(new java.awt.Color(14, 122, 192));
        novaSenhaLabel.setText("Nova senha");

        cadastrarADMBt.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarADMBt.setText("Cadastrar");
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

        javax.swing.GroupLayout telaAdministradoresLayout = new javax.swing.GroupLayout(telaAdministradores);
        telaAdministradores.setLayout(telaAdministradoresLayout);
        telaAdministradoresLayout.setHorizontalGroup(
            telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaAdministradoresLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaAdministradoresLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaAdministradoresLayout.createSequentialGroup()
                        .addGroup(telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastrarADMTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaAdministradoresLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nomefuncionarioTF)
                                        .addComponent(nomeFuncionarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cpfFuncionarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cpffuncionarioTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(matriculaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(matriculaTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(telaAdministradoresLayout.createSequentialGroup()
                                        .addComponent(limparCamosADMBt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cadastrarADMBt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nomeUsuarioLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nomeusuarioTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(novaSenhaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(novasenhaTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(permissaoCb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(editarADMBt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluirADMBt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(telaAdministradoresLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(142, Short.MAX_VALUE))))
        );
        telaAdministradoresLayout.setVerticalGroup(
            telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaAdministradoresLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addGroup(telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaAdministradoresLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cadastrarADMTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeFuncionarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomefuncionarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cpfFuncionarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpffuncionarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaAdministradoresLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeUsuarioLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(editarADMBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(excluirADMBt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeusuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(novaSenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(novasenhaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaAdministradoresLayout.createSequentialGroup()
                        .addComponent(matriculaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matriculaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaAdministradoresLayout.createSequentialGroup()
                        .addComponent(permissaoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(telaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastrarADMBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limparCamosADMBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        CardLayout.add(telaAdministradores, "Administradores");

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void administradoresBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administradoresBtActionPerformed
        alterarTela("Administradores");
    }//GEN-LAST:event_administradoresBtActionPerformed

    private void novoClienteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoClienteBtActionPerformed
        novoClienteTela();
    }//GEN-LAST:event_novoClienteBtActionPerformed

    private void excluirClienteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirClienteBtActionPerformed
        if (tabelaClientes.getSelectedRow() == -1) {
            new telaAlerta(null, true, "Selecione um cliente para excluir").setVisible(true);
        } else {
            String idCliente = (String) tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 0);
            Cliente cliente = ClienteDAO.listarCliente(idCliente);

            ClienteDAO.excluir(cliente);
        }
        montarTabelaClientes();
    }//GEN-LAST:event_excluirClienteBtActionPerformed

    private void excluirProdutoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirProdutoBtActionPerformed
        if (tabelaProdutos.getSelectedRow() == -1) {
            new telaAlerta(null, true, "Selecione um produto para poder excluir").setVisible(true);
        } else {
            String idProduto = (String) tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0);
            Produto produto = ProdutoDAO.listarProduto(idProduto);

            ProdutoDAO.excluir(produto);
            montarTabelaProdutos();
        }
    }//GEN-LAST:event_excluirProdutoBtActionPerformed

    private void editarClienteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarClienteBtActionPerformed
        if (tabelaClientes.getSelectedRow() == -1) {
            new telaAlerta(null, true, "Selecione um cliente para poder visualizar").setVisible(true);
        } else {

            String idCliente = (String) tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 0);
            Cliente cliente = ClienteDAO.listarCliente(idCliente);

            new telaVisualizarCliente(this, rootPaneCheckingEnabled, cliente).setVisible(true);
        }
        montarTabelaClientes();
    }//GEN-LAST:event_editarClienteBtActionPerformed

    private void inicioBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioBtActionPerformed
        alterarTela("Inicio");
    }//GEN-LAST:event_inicioBtActionPerformed

    private void produtosBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosBtActionPerformed
        alterarTela("Produtos");
    }//GEN-LAST:event_produtosBtActionPerformed

    private void clientesBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesBtActionPerformed
        alterarTela("Clientes");
    }//GEN-LAST:event_clientesBtActionPerformed

    private void vendasBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendasBtActionPerformed
        alterarTela("Vendas");
    }//GEN-LAST:event_vendasBtActionPerformed

    private void sairBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairBtActionPerformed

    private void novoProdutoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoProdutoBtActionPerformed
        novoProdutoTela();
    }//GEN-LAST:event_novoProdutoBtActionPerformed

    private void novaVendaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaVendaBtActionPerformed
        novaVenda();
    }//GEN-LAST:event_novaVendaBtActionPerformed

    private void novoProdutoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoProdutoBTActionPerformed
        novoProdutoTela();
    }//GEN-LAST:event_novoProdutoBTActionPerformed

    private void novoClienteBt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoClienteBt2ActionPerformed
        novoClienteTela();
    }//GEN-LAST:event_novoClienteBt2ActionPerformed

    private void excluirADMBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirADMBtActionPerformed
        if (tabelaAdministradores.getSelectedRow() == -1) {
            new telaAlerta(null, true, "Selecione um funcionário para excluir").setVisible(true);
        } else {
            String idFuncionário = (String) tabelaAdministradores.getValueAt(tabelaAdministradores.getSelectedRow(), 0);
            Funcionario excluirfuncionario = FuncionarioDAO.listarFuncionario(idFuncionário);

            FuncionarioDAO.excluir(excluirfuncionario);
        }
        montarTabelaAdministradores();
    }//GEN-LAST:event_excluirADMBtActionPerformed

    private void editarADMBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarADMBtActionPerformed
        if (tabelaAdministradores.getSelectedRow() == -1) {
            new telaAlerta(null, true, "Selecione um administrador para poder visualizar").setVisible(true);
        } else {

            String idADM = (String) tabelaAdministradores.getValueAt(tabelaAdministradores.getSelectedRow(), 0);
            Funcionario editarfuncionario = FuncionarioDAO.listarFuncionario(idADM);

            new telaVisualizarADM(this, rootPaneCheckingEnabled, editarfuncionario).setVisible(true);
        }
        montarTabelaAdministradores();
    }//GEN-LAST:event_editarADMBtActionPerformed

    private void editarProdutoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProdutoBtActionPerformed
        if (tabelaProdutos.getSelectedRow() == -1) {
            new telaAlerta(null, true, "Selecione um produto para poder visualizar").setVisible(true);
        } else {

            String idProduto = (String) tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0);
            Produto produto = ProdutoDAO.listarProduto(idProduto);

            new telaVisualizarProduto(this, rootPaneCheckingEnabled, produto).setVisible(true);
        }
        montarTabelaProdutos();
    }//GEN-LAST:event_editarProdutoBtActionPerformed

    private void cadastrarADMBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarADMBtActionPerformed
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
            Funcionario funcionario = new Funcionario();
            Login login = new Login();

            funcionario.setNome(nomefuncionarioTF.getText());
            funcionario.setCpf(cpffuncionarioTF.getText());
            funcionario.setMatricula(matriculaTF.getText());

            login.setUsuario(nomeusuarioTF.getText());
            login.setSenha(MD5.convertToMD5(novasenhaTF.getText()));
            login.setNivelpermissao((String) permissaoCb.getSelectedItem());

            funcionario.setLogin(login);
            login.setFuncionario(funcionario);

            FuncionarioDAO.adicionar(funcionario);
            montarTabelaAdministradores();
            limparCamposADM();
        }
    }//GEN-LAST:event_cadastrarADMBtActionPerformed

    private void limparCamosADMBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCamosADMBtActionPerformed
        limparCamposADM();
    }//GEN-LAST:event_limparCamosADMBtActionPerformed

    private void novaVendaBt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaVendaBt2ActionPerformed
        novaVenda();
    }//GEN-LAST:event_novaVendaBt2ActionPerformed

    public void limparCamposADM() {
        nomefuncionarioTF.setText("");
        nomeusuarioTF.setText("");
        cpffuncionarioTF.setText("");
        matriculaTF.setText("");
        novasenhaTF.setText("");
        permissaoCb.setSelectedIndex(0);
    }

    public void alterarTela(String nomeCard) {
        CardLayout layout = (CardLayout) CardLayout.getLayout();
        layout.show(CardLayout, nomeCard);
    }

    public void montarTabelasUltimasVendas() {
        DefaultTableModel modeloTabelaUVInicio = (DefaultTableModel) tabelaUltimasVendas.getModel();
        DefaultTableModel modeloTabelaUVVendas = (DefaultTableModel) tabelaVendas.getModel();

        modeloTabelaUVInicio.setRowCount(0);
        modeloTabelaUVVendas.setRowCount(0);

        List<ultimaVendaDTO> listaVendas = CaixaDAO.listarUltimaVenda();

        for (ultimaVendaDTO venda : listaVendas) {
            String[] linhatabelaUVInicio = {
                venda.getMarca(), venda.getModelo(), String.valueOf(venda.getQuantidade())
            };

            String[] linhatabelaUVVendas = {
                venda.getMarca(), venda.getModelo(), String.valueOf(venda.getQuantidade()), "R$ " + String.valueOf(venda.getValor())
            };

            modeloTabelaUVInicio.addRow(linhatabelaUVInicio);
            modeloTabelaUVVendas.addRow(linhatabelaUVVendas);
        }

        tabelaUltimasVendas.setModel(modeloTabelaUVInicio);
        tabelaVendas.setModel(modeloTabelaUVVendas);
    }

    public void montarTabelasEstoque() {
        DefaultTableModel modeloEstoqueInicio = (DefaultTableModel) tabelaEstoque.getModel();
        DefaultTableModel modeloEstoqueVendas = (DefaultTableModel) tabelaEstoqueVendas.getModel();
        modeloEstoqueInicio.setRowCount(0);
        modeloEstoqueVendas.setRowCount(0);

        List<estoqueDTO> listaEstoque = ProdutoDAO.listarEstoque();

        for (estoqueDTO estoque : listaEstoque) {

            String[] linha = {
                estoque.getModelo(), String.valueOf(estoque.getEstoque())
            };

            modeloEstoqueInicio.addRow(linha);
            modeloEstoqueVendas.addRow(linha);
        }
        tabelaEstoque.setModel(modeloEstoqueInicio);
        tabelaEstoqueVendas.setModel(modeloEstoqueVendas);
    }

    public void montarTabelaProdutos() {
        DefaultTableModel modeloProdutos = (DefaultTableModel) tabelaProdutos.getModel();
        modeloProdutos.setRowCount(0);

        List<Produto> listaProdutos = ProdutoDAO.listarProdutos();
        int quantidadeEstoque = 0;
        Double valorVenda = 0.;
        Double valorCompra = 0.;

        for (Produto produto : listaProdutos) {
            quantidadeEstoque = quantidadeEstoque + produto.getEstoque();
            valorVenda = valorVenda + (produto.getPreco_venda() * produto.getEstoque());
            valorCompra = valorCompra + (produto.getPreco_compra() * produto.getEstoque());

            String[] linha = {
                String.valueOf(produto.getIdproduto()),
                produto.getMarca_produto(),
                produto.getModelo_produto(),
                produto.getEspecificacao().getArmazenamento(),
                produto.getEspecificacao().getMemoria(),
                produto.getEspecificacao().getBateria(),
                String.valueOf(produto.getEstoque())
            };

            modeloProdutos.addRow(linha);
        }

        Double valorLucroBruto = valorVenda - valorCompra;

        labelEstoqueProdutos.setText(String.valueOf(quantidadeEstoque));
        valorCustoLabel.setText("R$ " + String.valueOf(valorCompra));
        valorVendaLabel.setText("R$ " + String.valueOf(valorVenda));

        valorLucroBrutoLabel.setText("R$ " + String.valueOf(valorLucroBruto));

        tabelaProdutos.setModel(modeloProdutos);
    }

    public void montarTabelaClientes() {
        DefaultTableModel modeloClientes = (DefaultTableModel) tabelaClientes.getModel();
        modeloClientes.setRowCount(0);

        List<Cliente> listaClientes = ClienteDAO.listar();

        for (Cliente cliente : listaClientes) {
            String[] linha = {
                String.valueOf(cliente.getIdcliente()),
                cliente.getNome(),
                cliente.getCpf(),
                cliente.getEmail(),
                cliente.getTelefone()
            };

            modeloClientes.addRow(linha);
        }
        tabelaClientes.setModel(modeloClientes);
    }

    public void montarTabelaAdministradores() {
        DefaultTableModel modeloADM = (DefaultTableModel) tabelaAdministradores.getModel();
        modeloADM.setRowCount(0);

        List<Funcionario> listaADMs = FuncionarioDAO.listar();

        for (Funcionario funcionario : listaADMs) {
            String[] linha = {
                String.valueOf(funcionario.getIdfuncionario()),
                funcionario.getNome(),
                funcionario.getMatricula(),
                funcionario.getCpf(),
                funcionario.getLogin().getUsuario(),
                funcionario.getLogin().getNivelpermissao()
            };
            modeloADM.addRow(linha);
        }

        tabelaAdministradores.setModel(modeloADM);
    }

    public void novoClienteTela() {
        new telaCadastrarCliente(this, rootPaneCheckingEnabled).setVisible(true);
        montarTabelaClientes();
    }

    public void novoProdutoTela() {
        new telaCadastroProduto(this, rootPaneCheckingEnabled).setVisible(true);
        montarTabelaProdutos();
    }

    public void novaVenda() {
        new telaNovaVenda(this, rootPaneCheckingEnabled, funcionario).setVisible(true);
        montarTabelaProdutos();
        montarTabelasEstoque();
        montarTabelaClientes();
        montarTabelasUltimasVendas();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardLayout;
    private javax.swing.JPanel Principal;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado administradoresBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado cadastrarADMBt;
    private javax.swing.JLabel cadastrarADMTitulo;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado clientesBt;
    private javax.swing.JLabel cpfFuncionarioLabel;
    private javax.swing.JTextField cpffuncionarioTF;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado editarADMBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado editarClienteBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado editarProdutoBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado excluirADMBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado excluirClienteBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado excluirProdutoBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado inicioBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelAcessoRapido;
    private javax.swing.JLabel labelEstoque;
    private javax.swing.JLabel labelEstoqueProdutos;
    private javax.swing.JLabel labelNivelAcessoADM;
    private javax.swing.JLabel labelNomeADM;
    private javax.swing.JLabel labelTituloProdutosEstoque;
    private javax.swing.JLabel labelUltimasVendas;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado limparCamosADMBt;
    private javax.swing.JLabel logoClientes;
    private javax.swing.JPanel logoPainelClientes;
    private javax.swing.JPanel logoPainelClientes2;
    private javax.swing.JPanel logoPainelProdutos;
    private javax.swing.JLabel logoProdutos;
    private javax.swing.JLabel logoVenda;
    private javax.swing.JLabel matriculaLabel;
    private javax.swing.JTextField matriculaTF;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JLabel nomeFuncionarioLabel;
    private javax.swing.JLabel nomeUsuarioLabel;
    private javax.swing.JTextField nomefuncionarioTF;
    private javax.swing.JTextField nomeusuarioTF;
    private javax.swing.JLabel novaSenhaLabel;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado novaVendaBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado novaVendaBt2;
    private javax.swing.JTextField novasenhaTF;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado novoClienteBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado novoClienteBt2;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado novoProdutoBT;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado novoProdutoBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.PainelCustomizado painelCustomizado1;
    private com.mycompany.tecsystemwdmcell.Utilitarios.PainelCustomizado painelCustomizado4;
    private javax.swing.JComboBox<String> permissaoCb;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado produtosBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado sairBt;
    private javax.swing.JLabel subtituloClientes;
    private javax.swing.JLabel subtituloProdutos;
    private javax.swing.JLabel subtituloVendas;
    private javax.swing.JTable tabelaAdministradores;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JScrollPane tabelaClientesPainel;
    private javax.swing.JTable tabelaEstoque;
    private javax.swing.JScrollPane tabelaEstoquePanel;
    private javax.swing.JTable tabelaEstoqueVendas;
    private javax.swing.JScrollPane tabelaEstoqueVendasPainel;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JScrollPane tabelaProdutosPainel;
    private javax.swing.JTable tabelaUltimasVendas;
    private javax.swing.JScrollPane tabelaUltimasVendasPanel;
    private javax.swing.JTable tabelaVendas;
    private javax.swing.JScrollPane tabelaVendasPanel;
    private javax.swing.JPanel telaAdministradores;
    private javax.swing.JPanel telaClientes;
    private javax.swing.JPanel telaInicio;
    private javax.swing.JPanel telaProdutos;
    private javax.swing.JPanel telaVendas;
    private javax.swing.JLabel valorCustoLabel;
    private javax.swing.JLabel valorLucroBrutoLabel;
    private javax.swing.JLabel valorVendaLabel;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado vendasBt;
    // End of variables declaration//GEN-END:variables
}
