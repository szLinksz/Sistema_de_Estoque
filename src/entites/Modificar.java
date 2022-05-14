package entites;

import java.util.Scanner;

public final class Modificar {

    Scanner scan = new Scanner(System.in);

    public void setModificar() {

        System.out.println("Digite o Codigo do produto no qual deseja modificar");
        BancoDeDados.getPercorrer();

        if (BancoDeDados.getProdutoExiste() == true) {
            if (BancoDeDados.getItem(BancoDeDados.getPosicao()).getCodigo().equals(BancoDeDados.getEntrada())) {
                System.out.println("""
                               Digite 1 para alterar o Codigo do produto   
                                Digite 2 para alterar o Nome do produto     
                               Digite 3 para alterar o Estoque do produto  
                               Digite 4 para alterar o Pre\u00e7o do produto    
                               """);
                String digito = scan.next();

                switch (digito) {
                    case "1" -> {
                        System.out.println("Digite o novo Codigo do produto");
                        BancoDeDados.getItem(BancoDeDados.getPosicao()).setCodigo(scan.nextInt());
                    }
                    case "2" -> {
                        System.out.println("Digite o novo Nome do produto");
                        BancoDeDados.getItem(BancoDeDados.getPosicao()).setName(scan.next());
                    }
                    case "3" -> {
                        System.out.println("Digite o novo Estoque do produto");
                        BancoDeDados.getItem(BancoDeDados.getPosicao()).setEstoque(scan.nextInt());
                    }
                    case "4" -> {
                        System.out.println("Digite o novo Preço  do produto");
                        BancoDeDados.getItem(BancoDeDados.getPosicao()).setEstoque(scan.nextInt());
                    }
                    default ->
                        System.out.println("O item digitado não corresponde as opções");
                }

            }

            if (BancoDeDados.getProdutoExiste() == false) {
                System.out.println("Codigo do produto inexistente");
            }

        }

    }
}
