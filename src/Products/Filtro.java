package Products;

import java.util.Scanner;

public class Filtro {

    private boolean filtroEntrada;
    private static String entrada;
    private Scanner scan = new Scanner(System.in);

    public void setFiltro() { //filtrando letras recebidas na entrada
        do {
            System.out.println("digite C para cadastrar, S para consultar, M para modificar"
                               + ", E para excluir ou Q para finalizar");
            entrada = scan.next();

            filtroEntrada = entrada.equals("C") || entrada.equals("c")
                         || entrada.equals("S") || entrada.equals("s") 
                         || entrada.equals("Q") || entrada.equals("q")
                         || entrada.equals("M") || entrada.equals("m")
                         || entrada.equals("E") || entrada.equals("e");

            if (!filtroEntrada) {
                System.out.println("A tecla digitada foi invalida");
            }
            
     
        } while (!filtroEntrada);
        
        
        
        

}
    
    public static String getEntrada(){
            return entrada;
            }
    }
    
