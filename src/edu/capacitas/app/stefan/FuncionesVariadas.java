package edu.capacitas.app.stefan;
import java.io.IOException;
import java.util.Scanner;
/**
 * Created by Stefan on 08/11/2016.
 */
public class FuncionesVariadas {


    public static char LeeCaracter(){
        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);
        return c;
    }

    public static void clearConsole() throws IOException {
        System.out.println("************************************");
    }

    public String pedirEntrada() {
        String entrada = null;

        Scanner reader;
        reader = new Scanner(System.in);
        entrada = reader.next();
        return entrada;
    }

    public int pedirNumeroPositivo() {
        String numero;
        boolean ok;
        Scanner reader;
        reader = new Scanner(System.in);
        numero = reader.next();
        if(!isNumeric(numero) ){
            ok=false;
            return -1;
        }
        else{
        return Integer.parseInt(numero);
        }
    }

    private boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

    public int pedirSexo() {
        String numero;

        Scanner reader;
        reader = new Scanner(System.in);
        numero = reader.next();

        return Integer.parseInt(numero);
    }
}
