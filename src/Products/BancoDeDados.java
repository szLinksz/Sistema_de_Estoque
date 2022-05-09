package Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoDeDados {

    private static List<Itens> bancoLista = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    private static int entrada = 0;
    private static int x;
    private static boolean y = false;

    public static void setItens(Itens i) {
        bancoLista.add(i);
    }

    public static void setRemove(Itens i) {
        bancoLista.remove(i);
    }

    public static int getSize() {

        return bancoLista.size();

    }

    public static Itens getItem(int i) {

        return bancoLista.get(i);

    }

    public static int getPercorrer() {         //função para percorrer a lista até encontrar a posição que corresponde a entrada

        entrada = scan.nextInt();
        x = -1;
        for (int i = 0; i < BancoDeDados.getSize(); i++) {
            if (BancoDeDados.getItem(i).getCodigo().equals(entrada)) {
                x = i;
                break;

            }
        }

        return x;

    }
    
    
    
    
        public static int getPercorrer(Integer entrada) {         //função para percorrer a lista até encontrar a posição que corresponde a entrada

        x = -1;
        for (int i = 0; i < BancoDeDados.getSize(); i++) {
            if (BancoDeDados.getItem(i).getCodigo().equals(entrada)) {
                x = i;
                break;

            }
        }

        return x;

    }
        
        

    public static boolean getProdutoExiste() {  //função que trás um resultado true se o valor existir dentro da lista

        if (x >0 || x == 0) {
            y = true;
        }else{
        y = false;
        }
        return y;

    }

    public static int getPosicao() {     //função para retornar a posição em que o item está na lista
        return x;
    }

    public static int getEntrada() {

        return entrada;
    }

}
