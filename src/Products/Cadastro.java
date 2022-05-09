package Products;

import java.util.Scanner;

public class Cadastro {

    private Scanner scan = new Scanner(System.in);

    public void setCadastro() {

        Itens p1 = new Itens();

        System.out.println("Digite o codigo do produto a ser cadastrado");
        int codigoProduct = scan.nextInt();
        BancoDeDados.getPercorrer(codigoProduct);

        while (BancoDeDados.getProdutoExiste() == true) {
            System.out.println("Esse produto já existe \n digite um novo codigo para o produto");
            codigoProduct = scan.nextInt();
            BancoDeDados.getPercorrer(codigoProduct);

        }
        if (BancoDeDados.getProdutoExiste() == false) {
            while (codigoProduct < 0) {
                System.out.println("Codigos negativos não podem ser cadastrados");
                codigoProduct = scan.nextInt();
                BancoDeDados.getPercorrer(codigoProduct);

                while (BancoDeDados.getProdutoExiste() == true) {
                    System.out.println("Esse produto já existe \n digite um novo codigo para o produto");
                    codigoProduct = scan.nextInt();
                    BancoDeDados.getPercorrer(codigoProduct);

                }
            }
            p1.setCodigo(codigoProduct);
        }

        System.out.println("Digite o nome do produto a ser cadastrado");
        String nameProduct = scan.next();
        p1.setName(nameProduct);

        System.out.println("Digite o estoque do produto a ser cadastrado");
        int qtyestoque = scan.nextInt();
        p1.setEstoque(qtyestoque);

        System.out.println("Digite o preço do produto a ser cadastrado");
        double qtyprice = scan.nextDouble();
        p1.setPreço(qtyprice);

        BancoDeDados.setItens(p1);
    }
}
