import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        terminal.close();
    
        try{
            contar(parametroUm, parametroDois);
        } catch (Exception ParametroInvalidoException) {};
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException{
            if (parametroUm > parametroDois) {
                throw new ParametroInvalidoException();
            } else {
                int contagem = parametroDois - parametroUm;

                for (int i = 1; i <= contagem; i++) {
                    System.out.println("Imprimindo o número: " + i);
                }
            }
        }
    }

