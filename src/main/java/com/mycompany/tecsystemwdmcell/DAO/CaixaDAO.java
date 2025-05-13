package com.mycompany.tecsystemwdmcell.DAO;

import com.mycompany.tecsystemwdmcell.DTO.ultimaVendaDTO;
import com.mycompany.tecsystemwdmcell.Modelos.Caixa;
import com.mycompany.tecsystemwdmcell.Telas.telaAlerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;
import org.hibernate.query.NativeQuery;

public class CaixaDAO {

    private static EntityManager eManager;

    public static void cadastrarTransacao(Caixa caixa) {

        eManager = JPAutil.getEntityManager();
        try {
            eManager.getTransaction().begin();
            eManager.persist(caixa);
            eManager.getTransaction().commit();
            new telaAlerta(null, true, "Venda cadastrada com sucesso").setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
            eManager.getTransaction().rollback();
            new telaAlerta(null, true, "Ocorreu um erro realizar a venda").setVisible(true);
        } finally {
            JPAutil.close();
        }
    }

    public static List<ultimaVendaDTO> listarUltimaVenda() {
        eManager = JPAutil.getEntityManager();
        List<ultimaVendaDTO> listaConsulta = new ArrayList<>();
        try {

            Query consulta = eManager.createNativeQuery(
                    "select p.marca_produto, p.modelo_produto, ip.quantidade, c.valor * ip.quantidade as valor_compra from "
                    + "produto as p "
                    + "join itens_de_pedido as ip on p.idproduto = ip.produto_idproduto "
                    + "join caixa as c on c.idtransacao = ip.caixa_idtransacao;");
            
            List<Object[]> lista = consulta.getResultList();

            for (Object[] obj : lista) {
                ultimaVendaDTO ultimavenda = new ultimaVendaDTO((String) obj[0], (String) obj[1], (Integer) obj[2], (Double) obj[3]);
                
                listaConsulta.add(ultimavenda);
            }
            return listaConsulta;
        } catch (Exception e) {
            System.out.println(e);
            new telaAlerta(null, true, "Ocorreu um erro listar as vendas").setVisible(true);
        } finally {
            JPAutil.close();
        }
        return listaConsulta;
    }

}
