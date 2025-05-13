package com.mycompany.tecsystemwdmcell.Utilitarios;

import com.mycompany.tecsystemwdmcell.Telas.telaAlerta;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
     public static String convertToMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            byte[] hashBytes = md.digest(input.getBytes());
            
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            new telaAlerta(null, true, "Ocorreu um erro listar as vendas").setVisible(true);
            throw new RuntimeException("Erro ao calcular MD5", e);
        }
    }
}
