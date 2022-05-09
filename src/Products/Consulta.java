package Products;

import java.util.Scanner;

public class Consulta {

    Scanner scan = new Scanner(System.in);

    public void setConsulta() {

        try {
            System.out.println("Digite o codigo do produto");
            BancoDeDados.getPercorrer(); 
            if (BancoDeDados.getProdutoExiste() == true) {

                if (BancoDeDados.getItem(BancoDeDados.getPosicao()).getCodigo().equals(BancoDeDados.getEntrada())) {

                    if (BancoDeDados.getItem(BancoDeDados.getPosicao()).getCodigo().equals(BancoDeDados.getEntrada())) {
                        System.out.println(BancoDeDados.getItem(BancoDeDados.getPosicao()));

                    }
                }

            }
            if (BancoDeDados.getProdutoExiste() == false) {
                System.out.println("O Codigo Digitado não existe");
            }

        } catch (Exception e) {
            System.out.println("O valor digitado não foi encontrado");

        }

    }

}
