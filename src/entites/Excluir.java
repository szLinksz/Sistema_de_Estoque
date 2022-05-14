package entites;

import java.util.Scanner;

public final class Excluir {

    Scanner scan = new Scanner(System.in);

    public void setExcluir() {
        System.out.println("Digite o Codigo do produto no qual deseja excluir");
        BancoDeDados.getPercorrer();

        
        if(BancoDeDados.getProdutoExiste()==true){
            
            if (BancoDeDados.getItem(BancoDeDados.getPosicao()).getCodigo().equals(BancoDeDados.getEntrada())) {
                System.out.println(BancoDeDados.getItem(BancoDeDados.getPosicao()));
                System.out.println("Tem certeza que deseja excluir este item? \n Y para sim, N para não ");
                String remove = scan.next();
                if (remove.equals("y") || remove.equals("Y")) {

                    BancoDeDados.setRemove(BancoDeDados.getItem(BancoDeDados.getPosicao()));
                    
                }

            }    
        }

            if (BancoDeDados.getProdutoExiste() == false) {
                System.out.println("Codigo do produto inexistente");
            }

        

    }
}