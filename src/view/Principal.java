package view;

import controller.DoceiraController;
import models.Chocolate;

public class Principal {
    public static void main(String[] args) throws Exception {
        DoceiraController doceiraController = new DoceiraController();

        doceiraController.adicionarChocolate(new Chocolate(55));
        doceiraController.adicionarChocolate(new Chocolate(105));
        doceiraController.adicionarChocolate(new Chocolate(151));
        doceiraController.adicionarChocolate(new Chocolate(213));
        doceiraController.adicionarChocolate(new Chocolate(270));

        

        for (int i = 0; i < doceiraController.tabelaHashChocolate.length; i++) {
            try {
                System.out.println("Tipo " + i + ":");
                doceiraController.listarChocolatesPorTipo(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
