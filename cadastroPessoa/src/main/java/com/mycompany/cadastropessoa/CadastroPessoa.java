/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastropessoa;

import classe.classeCadastro;
import java.util.ArrayList;
import tela.*;

/**
 *
 * @author ricar
 */
public class CadastroPessoa {

    public static void main(String[] args) {
        ArrayList<classeCadastro> pessoas = new ArrayList<>();
        
        listaPessoas telaLista = new listaPessoas(pessoas);
        telaCadastro tela = new telaCadastro(telaLista, pessoas);
        
        telaLista.setVisible(true);
        tela.setVisible(true);
    }
}
