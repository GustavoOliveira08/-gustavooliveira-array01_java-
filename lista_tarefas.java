import java.util.Scanner;

public class lista_tarefas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] lista = new String[99999];
        System.out.println("Crie sua lista!");

        //Loop para adicionar strings ao array
        for(int i = 0;i < lista.length; i++){
            System.out.print("adicione " + (i + 1) + "° item em sua lista: ");
            String sair = entrada.nextLine();
            //Caso o usuario digite "Fim" o if irá exibir sua lista (sem o fim)
            if(sair.equalsIgnoreCase("fim")){
                System.out.println("Sua lista:");
                for(int x = 0; x< lista.length; x++){
                    // caso na array esteja vazia não será exibida
                    if(lista[x] != null){
                        System.out.println((x + 1) + "° item da lista: " + lista[x]);
                    }
                }
                break;
            }
            lista[i] = sair; // para não exebir na lista
        }
    }
}