package controller;

import models.Chocolate;
import model.Lista;

public class DoceiraController {

    public Lista[] tabelaHashChocolate;

    public DoceiraController() {
        tabelaHashChocolate = new Lista[5];
        inicializarTabelaHash();
    }

    private void inicializarTabelaHash() {
        for (int i = 0; i < tabelaHashChocolate.length; i++) {
            tabelaHashChocolate[i] = new Lista();
        }
    }

    public void adicionarChocolate(Chocolate chocolate) {
        int posicao = chocolate.hashCode();
        tabelaHashChocolate[posicao].addFirst(chocolate);
    }

    public void listarChocolatesPorTipo(int tipo) throws Exception {
        int posicao = tipo;
        int tamanho = tabelaHashChocolate[posicao].size();
        for (int i = 0; i < tamanho; i++) {
            Chocolate chocolate = (Chocolate) tabelaHashChocolate[posicao].get(i);
            System.out.println(chocolate.toString());
        }
    }
}