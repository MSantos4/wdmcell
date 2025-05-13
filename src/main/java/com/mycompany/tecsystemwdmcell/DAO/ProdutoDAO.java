package com.mycompany.tecsystemwdmcell.DAO;

import com.mycompany.tecsystemwdmcell.Modelos.Produto;
import com.mycompany.tecsystemwdmcell.DTO.estoqueDTO;
import com.mycompany.tecsystemwdmcell.DTO.marcaDTO;
import com.mycompany.tecsystemwdmcell.Telas.telaAlerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoDAO {

    private static EntityManager eManager;

    public static void adicionar(Produto produto) {
        eManager = JPAutil.getEntityManager();

        try {
            eManager.getTransaction().begin();
            eManager.persist(produto);
            eManager.getTransaction().commit();

            new telaAlerta(null, true, "Produto Cadastrado!").setVisible(true);
        } catch (Exception e) {
            eManager.getTransaction().rollback();
            System.out.println(e);
            new telaAlerta(null, true, "Ocorreu um erro ao inserir os dados do produto").setVisible(true);
        } finally {
            JPAutil.close();
        }
    }

    public static void editar(Produto produto) {
        eManager = JPAutil.getEntityManager();

        try {
            eManager.getTransaction().begin();
            eManager.merge(produto);
            eManager.getTransaction().commit();
            new telaAlerta(null, true, "Informações do produto foram editadas").setVisible(true);

        } catch (Exception e) {
            eManager.getTransaction().rollback();
            new telaAlerta(null, true, "Erro ao editar as informações do produto").setVisible(true);
        } finally {
            JPAutil.close();
        }
    }
    
        public static void editarEstoque(Produto produto) {
        eManager = JPAutil.getEntityManager();

        try {
            eManager.getTransaction().begin();
            eManager.merge(produto);
            eManager.getTransaction().commit();

        } catch (Exception e) {
            eManager.getTransaction().rollback();
            new telaAlerta(null, true, "Erro ao editar as informações de estoque do produto").setVisible(true);
        } finally {
            JPAutil.close();
        }
    }

    public static void excluir(Produto produto) {
        eManager = JPAutil.getEntityManager();

        try {
            eManager.getTransaction().begin();
            eManager.remove(produto);
            eManager.getTransaction().commit();
            new telaAlerta(null, true, "Produto removido com sucesso!").setVisible(true);

        } catch (Exception e) {
            eManager.getTransaction().rollback();
            new telaAlerta(null, true, "Erro ao excluir produto").setVisible(true);
        } finally {
            JPAutil.close();
        }
    }

    public static Produto listarProduto(String ID) {
        eManager = JPAutil.getEntityManager();
        Produto produto = new Produto();

        try {
            produto = eManager.find(Produto.class, ID);
            return produto;
        } catch (Exception e) {
            new telaAlerta(null, true, "Erro ao listar o produto").setVisible(true);
            return produto;
        } finally {
            JPAutil.close();
        }
    }

    public static List<Produto> listarProdutos() {
        eManager = JPAutil.getEntityManager();
        List<Produto> listaProdutos = new ArrayList<>();
        try {
            TypedQuery<Produto> consulta = eManager.createQuery("SELECT p FROM Produto p JOIN FETCH p.especificacao", Produto.class);
            listaProdutos = consulta.getResultList();
            return listaProdutos;
        } catch (Exception e) {
            System.out.println(e);
            new telaAlerta(null, true, "Ocorreu um erro ao retornar os produtos").setVisible(true);
        } finally {
            JPAutil.close();
        }
        
        return listaProdutos;
    }

    public static List<estoqueDTO> listarEstoque() {
        eManager = JPAutil.getEntityManager();
        List<estoqueDTO> listaEstoque = new ArrayList<>();

        try {

            TypedQuery<Object[]> consulta = eManager.createQuery("SELECT modelo_produto, estoque FROM Produto", Object[].class);
            List<Object[]> resultados = consulta.getResultList();

            for (Object[] resultado : resultados) {
                String modelo = (String) resultado[0];
                int estoque = (int) resultado[1];

                listaEstoque.add(new estoqueDTO(modelo, estoque));
            }
            return listaEstoque;

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            JPAutil.close();
        }
        return listaEstoque;
    }

    public static List<marcaDTO> listarMarcas() {
        eManager = JPAutil.getEntityManager();
        List<marcaDTO> listaDTO = new ArrayList<>();

        try {
            TypedQuery<String> consulta = eManager.createQuery("SELECT marca_produto FROM Produto", String.class);
            List<String> listaMarcas = consulta.getResultList();

            listaDTO = listaMarcas.stream()
                    .map(marcaDTO::new)// para cada item da lista de marcas, cria um DTO novo
                    .collect(Collectors.toList());// retorna eles para dentro da lista de dto

            return listaDTO;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            JPAutil.close();
        }
        return listaDTO;
    }

}
