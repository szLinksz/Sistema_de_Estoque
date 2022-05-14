package Products;

import entites.Cadastro;
import entites.Consulta;
import entites.Excluir;
import entites.Filtro;
import entites.Modificar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cadastro cadastro = new Cadastro();
        Consulta consulta = new Consulta();
        Modificar modificar = new Modificar();
        Excluir excluir = new Excluir();
        Filtro filtro = new Filtro();
        boolean quit = false;

        do {

            filtro.setFiltro();
                // após o filtro de entrada decidindo o que acontece com a entrada
            if ((Filtro.getEntrada().equals("C") || Filtro.getEntrada().equals("c"))) {
                cadastro.setCadastro();
            }

            if ((Filtro.getEntrada().equals("S") || Filtro.getEntrada().equals("s"))) {
                consulta.setConsulta();
            }
            
            if ((Filtro.getEntrada().equals("M") || Filtro.getEntrada().equals("m"))) {
                modificar.setModificar();
            }
            
            if ((Filtro.getEntrada().equals("E") || Filtro.getEntrada().equals("e"))) {
                excluir.setExcluir();
            }

            if (Filtro.getEntrada().equals("Q") || Filtro.getEntrada().equals("q")) {

                System.out.println("Tem certeza que deseja finalizar? Y para sim / N para não");
                String definirValor = scan.next();

                if (definirValor.equals("Y") || definirValor.equals("y")) {
                    quit = true;

                }

            }

        } while (quit == false);
        System.out.print("O programa foi encerrado");
    }

}