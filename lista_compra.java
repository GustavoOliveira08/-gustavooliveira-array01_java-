import java.util.Scanner;

public class lista_compra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] adLista = new String[100];
        int posicao = 0;
        int opcao = 0;
        do{
            System.out.println("menu: \n1 - Adicionar a lista \n2 - Pesquisar item \n3 - Remover item \n4 - Alterar item \n5 - Listar produtos \n6 - Sair");
            System.out.print("Escolha a sua opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            if( opcao == 1 ){
                System.out.println("1 - Adicionar a lista");
                while(true){
                    System.out.print("adicione a lista o item: ");
                    String produto = entrada.nextLine();
                    if(produto.equalsIgnoreCase("sair")){
                        break;
                    }
                    adLista[posicao] = produto;
                    posicao++;
                }
            }
            if(opcao == 2) {
                System.out.println("2 - Pesquisar item");
                System.out.println("Procure: ");
                String procurar = entrada.nextLine();
                int encontrar = 0;
                for (int i = 0; i < posicao; i++) {
                    if (adLista[i] != null && procurar.equalsIgnoreCase(adLista[i])) {
                        System.out.println("Produto encontrado: " + adLista[i]);
                        encontrar = 1;
                        break;
                    }
                }
                if(encontrar == 0){
                    System.out.println("Produto não encontrado!!");
                }
            }
            if (opcao == 3){

            }
        }while(opcao != 6);
    }
}
