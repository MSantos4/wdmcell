package com.mycompany.tecsystemwdmcell.Telas;

import com.mycompany.tecsystemwdmcell.DAO.CaixaDAO;
import com.mycompany.tecsystemwdmcell.DAO.ClienteDAO;
import com.mycompany.tecsystemwdmcell.DAO.ItemPedidoDAO;
import com.mycompany.tecsystemwdmcell.DAO.PedidoDAO;
import com.mycompany.tecsystemwdmcell.DAO.ProdutoDAO;
import com.mycompany.tecsystemwdmcell.Modelos.Caixa;
import com.mycompany.tecsystemwdmcell.Modelos.Cliente;
import com.mycompany.tecsystemwdmcell.Modelos.Funcionario;
import com.mycompany.tecsystemwdmcell.Modelos.ItemPedido;
import com.mycompany.tecsystemwdmcell.Modelos.Login;
import com.mycompany.tecsystemwdmcell.Modelos.Pedido;
import com.mycompany.tecsystemwdmcell.Modelos.Produto;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class telaNovaVenda extends java.awt.Dialog {

    private List<Produto> listaProdutos;
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Produto> carrinho = new ArrayList<>();
    List<ItemPedido> itensPedido = new ArrayList<>();

    private Funcionario funcionario;

    public telaNovaVenda(java.awt.Frame parent, boolean modal, Funcionario funcionario) {
        super(parent, modal);
        initComponents();
        this.funcionario = funcionario;

        this.listaProdutos = ProdutoDAO.listarProdutos();
        this.listaClientes = ClienteDAO.listar();
        listarClientes();
        listarProdutos();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NovaVendaPainel = new javax.swing.JPanel();
        confirmarVendaBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        cancelarBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        jLabel5 = new javax.swing.JLabel();
        valorFinalLabel = new javax.swing.JLabel();
        descontoTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        metodoPagamentoCb = new javax.swing.JComboBox<>();
        novoClienteBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        clienteCb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        adicionarBt = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();
        produtoCb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        carrinhoPanel = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        logoPainelClientes = new javax.swing.JPanel();
        logoClientes = new javax.swing.JLabel();
        novaVendaTitulo = new javax.swing.JLabel();
        aplicarDescontoBT = new com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado();

        setResizable(false);
        setTitle("Nova Venda");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        NovaVendaPainel.setBackground(new java.awt.Color(255, 255, 255));

        confirmarVendaBt.setForeground(new java.awt.Color(255, 255, 255));
        confirmarVendaBt.setText("Confirmar Venda");
        confirmarVendaBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmarVendaBt.setRound(10);
        confirmarVendaBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        confirmarVendaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarVendaBtActionPerformed(evt);
            }
        });

        cancelarBt.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBt.setText("Cancelar");
        cancelarBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarBt.setRound(10);
        cancelarBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.CANCELAR);
        cancelarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(14, 122, 192));
        jLabel5.setText("Valor Final");

        valorFinalLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        valorFinalLabel.setForeground(new java.awt.Color(10, 79, 131));
        valorFinalLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        valorFinalLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        descontoTF.setBackground(new java.awt.Color(255, 255, 255));
        descontoTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descontoTF.setForeground(new java.awt.Color(10, 79, 131));
        descontoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descontoTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 153, 226)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(14, 122, 192));
        jLabel4.setText("%");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(14, 122, 192));
        jLabel3.setText("Aplicar desconto (Gerente e Administrador)");

        metodoPagamentoCb.setBackground(new java.awt.Color(255, 255, 255));
        metodoPagamentoCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        metodoPagamentoCb.setForeground(new java.awt.Color(14, 122, 192));
        metodoPagamentoCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de pagamento", "Débito", "Crédito", "Pix" }));
        metodoPagamentoCb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 122, 192), 2, true));

        novoClienteBt.setForeground(new java.awt.Color(255, 255, 255));
        novoClienteBt.setText("Novo Cliente");
        novoClienteBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        novoClienteBt.setRound(10);
        novoClienteBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        novoClienteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoClienteBtActionPerformed(evt);
            }
        });

        clienteCb.setBackground(new java.awt.Color(255, 255, 255));
        clienteCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clienteCb.setForeground(new java.awt.Color(14, 122, 192));
        clienteCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        clienteCb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 122, 192), 2, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 79, 131));
        jLabel1.setText("ou");

        adicionarBt.setForeground(new java.awt.Color(255, 255, 255));
        adicionarBt.setText("Adicionar");
        adicionarBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adicionarBt.setRound(10);
        adicionarBt.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        adicionarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarBtActionPerformed(evt);
            }
        });

        produtoCb.setBackground(new java.awt.Color(255, 255, 255));
        produtoCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        produtoCb.setForeground(new java.awt.Color(14, 122, 192));
        produtoCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        produtoCb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 122, 192), 2, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 79, 131));
        jLabel2.setText("Carrinho");

        carrinhoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        tabelaCarrinho.setBackground(new java.awt.Color(242, 242, 242));
        tabelaCarrinho.getTableHeader().setBackground(new Color(62, 174,185));
        tabelaCarrinho.getTableHeader().setForeground(new Color(255, 255,255));
        tabelaCarrinho.getTableHeader().setReorderingAllowed(false);
        tabelaCarrinho.getTableHeader().setSize(40, 40);
        tabelaCarrinho.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 14));
        tabelaCarrinho.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tabelaCarrinho.setForeground(new java.awt.Color(10, 79, 131));
        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Modelo", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
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
        tabelaCarrinho.setGridColor(new java.awt.Color(242, 242, 242));
        tabelaCarrinho.setRowHeight(30);
        carrinhoPanel.setViewportView(tabelaCarrinho);
        if (tabelaCarrinho.getColumnModel().getColumnCount() > 0) {
            tabelaCarrinho.getColumnModel().getColumn(0).setResizable(false);
            tabelaCarrinho.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabelaCarrinho.getColumnModel().getColumn(1).setResizable(false);
            tabelaCarrinho.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        logoPainelClientes.setBackground(new java.awt.Color(255, 255, 255));

        logoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/normalBox2Blue-image.png"))); // NOI18N

        novaVendaTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        novaVendaTitulo.setForeground(new java.awt.Color(21, 53, 85));
        novaVendaTitulo.setText("Nova Venda");

        javax.swing.GroupLayout logoPainelClientesLayout = new javax.swing.GroupLayout(logoPainelClientes);
        logoPainelClientes.setLayout(logoPainelClientesLayout);
        logoPainelClientesLayout.setHorizontalGroup(
            logoPainelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPainelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoClientes)
                .addGap(18, 18, 18)
                .addComponent(novaVendaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        logoPainelClientesLayout.setVerticalGroup(
            logoPainelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPainelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoPainelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(novaVendaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        aplicarDescontoBT.setForeground(new java.awt.Color(255, 255, 255));
        aplicarDescontoBT.setText("aplicar desconto");
        aplicarDescontoBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aplicarDescontoBT.setRound(5);
        aplicarDescontoBT.setStyle(com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado.ButtonStyle.ACESSORAPIDO);
        aplicarDescontoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarDescontoBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NovaVendaPainelLayout = new javax.swing.GroupLayout(NovaVendaPainel);
        NovaVendaPainel.setLayout(NovaVendaPainelLayout);
        NovaVendaPainelLayout.setHorizontalGroup(
            NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NovaVendaPainelLayout.createSequentialGroup()
                .addGroup(NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NovaVendaPainelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NovaVendaPainelLayout.createSequentialGroup()
                                .addComponent(clienteCb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(novoClienteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NovaVendaPainelLayout.createSequentialGroup()
                                .addComponent(produtoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(adicionarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(carrinhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NovaVendaPainelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmarVendaBt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NovaVendaPainelLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valorFinalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(metodoPagamentoCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGroup(NovaVendaPainelLayout.createSequentialGroup()
                                            .addComponent(descontoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(aplicarDescontoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(NovaVendaPainelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(logoPainelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        NovaVendaPainelLayout.setVerticalGroup(
            NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NovaVendaPainelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logoPainelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteCb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(novoClienteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(metodoPagamentoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(produtoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adicionarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NovaVendaPainelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descontoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aplicarDescontoBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(NovaVendaPainelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorFinalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(NovaVendaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmarVendaBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(carrinhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NovaVendaPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NovaVendaPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
        public void usuarioAcesso() {
        
        switch (funcionario.getLogin().getNivelpermissao()) {
            case "Gerente" -> {
                
            }
            case "Vendedor" -> {
                descontoTF.setEnabled(false);
            }
            case "Caixa" -> {
                descontoTF.setEnabled(false);
            }
        }
    }
    
    
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void cancelarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarBtActionPerformed

    private void novoClienteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoClienteBtActionPerformed
        new telaCadastrarCliente(null, true).setVisible(true);
        listarClientes();
    }//GEN-LAST:event_novoClienteBtActionPerformed

    private void adicionarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarBtActionPerformed
        if (produtoCb.getSelectedIndex() != 0 && clienteCb.getSelectedIndex() != 0) {
            Double valorFinal = 0.;

            String itemSelecionado = (String) produtoCb.getSelectedItem();
            Produto produtoSelecionado = getProduto(listaProdutos, getIdProduto(itemSelecionado));
            carrinho.add(produtoSelecionado);

            List<ItemPedido> listaCarrinho = criarItemPedido(adicionarCarrinho(carrinho));
            atualizarCarrinhoTabela(listaCarrinho);

            for (ItemPedido pedido : listaCarrinho) {
                valorFinal = valorFinal + (pedido.getProduto().getPreco_venda() * pedido.getQuantidade());
            }
            clienteCb.setEnabled(false);
            valorFinalLabel.setText("R$ " + String.valueOf(valorFinal));
        } else {
            new telaAlerta(null, true, "Escolha um produto e o cliente para poder adicionar ao carrinho").setVisible(true);
        }
    }//GEN-LAST:event_adicionarBtActionPerformed

    private void confirmarVendaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarVendaBtActionPerformed
        if (metodoPagamentoCb.getSelectedIndex() == 0) {
            new telaAlerta(null, true, "Escolha a forma de pagamento").setVisible(true);
        } else {
            
            Caixa caixa = new Caixa();
            caixa.setTipo_transacao((String) metodoPagamentoCb.getSelectedItem());
            caixa.setData_transacao(LocalDate.now());
            caixa.setValor(Double.valueOf(valorFinalLabel.getText().replace("R$", "")));

            CaixaDAO.cadastrarTransacao(caixa);
            
            Pedido pedido = new Pedido();
            pedido.setCliente(getCliente(listaClientes, getIdCliente((String) clienteCb.getSelectedItem())));
            pedido.setFuncionario(funcionario);
            pedido.setData(LocalDate.now());

            PedidoDAO.cadastrar(pedido);

            for (ItemPedido itemPedido : itensPedido) { 
                itemPedido.setPedido(pedido);
                itemPedido.setCaixa(caixa);  
                ItemPedidoDAO.cadastrar(itemPedido);
                
                itemPedido.getProduto().setEstoque(itemPedido.getProduto().getEstoque() - itemPedido.getQuantidade()); 
                ProdutoDAO.editarEstoque(itemPedido.getProduto());
            }

            caixa.setItempedido(itensPedido);
            dispose();
        }
    }//GEN-LAST:event_confirmarVendaBtActionPerformed

    private void aplicarDescontoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarDescontoBTActionPerformed
        aplicarDesconto();
    }//GEN-LAST:event_aplicarDescontoBTActionPerformed

    public void aplicarDesconto() {
        if (descontoTF.getText().isBlank()) {
            new telaAlerta(null, true, "Digite o desconto a ser aplicado").setVisible(true);
        } else {
            Double valorFinal = 0.;
            for (ItemPedido pedido : itensPedido) {
                valorFinal = (valorFinal + pedido.getProduto().getPreco_venda() * pedido.getQuantidade());
                valorFinal = valorFinal - (valorFinal * (Double.parseDouble(descontoTF.getText()) / 100));
            }
            valorFinalLabel.setText("R$ " + String.valueOf(valorFinal));
        }
    }

    public void listarClientes() {
        listaClientes = ClienteDAO.listar();

        DefaultComboBoxModel<String> cbClientes = new DefaultComboBoxModel<>();
        cbClientes.addElement("Cliente");

        for (Cliente cliente : listaClientes) {
            cbClientes.addElement(cliente.getIdcliente() + " " + cliente.getNome());
        }
        clienteCb.setModel(cbClientes);
    }

    public void listarProdutos() {
        DefaultComboBoxModel<String> cbProdutos = new DefaultComboBoxModel<>();
        cbProdutos.addElement("Produtos");

        for (Produto produto : listaProdutos) {
            cbProdutos.addElement(produto.getIdproduto() + " " + produto.getModelo_produto() + " " + produto.getEspecificacao().getArmazenamento());
        }
        produtoCb.setModel(cbProdutos);
    }

    public void atualizarCarrinhoTabela(List<ItemPedido> produtosSelecionados) {
        DefaultTableModel model = (DefaultTableModel) tabelaCarrinho.getModel();
        model.setRowCount(0);

        for (ItemPedido produto : produtosSelecionados) {

            String linha[] = {
                produto.getProduto().getModelo_produto(),
                String.valueOf(produto.getProduto().getPreco_venda() * produto.getQuantidade())
            };
            model.addRow(linha);
        }
        tabelaCarrinho.setModel(model);
    }

//Aqui é usado o id para poder retornar o produto para adicionar no pedido
    public Produto getProduto(List<Produto> listaProdutos, int id) {
        return listaProdutos.stream()
                .filter(produto -> produto.getIdproduto() == id)
                .findFirst()
                .orElse(null);
    }

    //Aqui é usado o id para poder retornar o cliente escolhido
    public Cliente getCliente(List<Cliente> listaClientes, int id) {
        return listaClientes.stream()
                .filter(cliente -> cliente.getIdcliente() == id)
                .findFirst()
                .orElse(null);
    }

    //Pegar ID do cliente para poder montar o pedido
    public int getIdCliente(String clienteCombobox) {
        return Integer.parseInt(clienteCombobox.split(" ")[0]);
    }

    //Pegar ID do produto para poder montar o itemPedido
    public int getIdProduto(String textoCombobox) {
        return Integer.parseInt(textoCombobox.split(" ")[0]);
    }

    public Map<Produto, Integer> adicionarCarrinho(List<Produto> carrinho) {
        Map<Produto, Integer> contagem = new HashMap<>();

        for (Produto produto : carrinho) {
            contagem.put(produto, contagem.getOrDefault(produto, 0) + 1);
        }
        return contagem;
    }

    public List<ItemPedido> criarItemPedido(Map<Produto, Integer> contagemProdutos) {
        itensPedido.clear();

        for (Map.Entry<Produto, Integer> entrada : contagemProdutos.entrySet()) {
            Produto produto = entrada.getKey();
            Integer quantidade = entrada.getValue();

            ItemPedido itemPedido = new ItemPedido();
            itemPedido.setProduto(produto);
            itemPedido.setQuantidade(quantidade);

            itensPedido.add(itemPedido);
        }
        return itensPedido;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NovaVendaPainel;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado adicionarBt;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado aplicarDescontoBT;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado cancelarBt;
    private javax.swing.JScrollPane carrinhoPanel;
    private javax.swing.JComboBox<String> clienteCb;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado confirmarVendaBt;
    private javax.swing.JTextField descontoTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logoClientes;
    private javax.swing.JPanel logoPainelClientes;
    private javax.swing.JComboBox<String> metodoPagamentoCb;
    private javax.swing.JLabel novaVendaTitulo;
    private com.mycompany.tecsystemwdmcell.Utilitarios.botãoCustomizado novoClienteBt;
    private javax.swing.JComboBox<String> produtoCb;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JLabel valorFinalLabel;
    // End of variables declaration//GEN-END:variables
}
