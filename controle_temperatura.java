import java.util.Scanner;

public class controle_temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double[] fah = new Double[200]; //Fahrenheit
        Double[] cel = new Double[200]; //Celsius
        double somaF = 0;
        double somaC = 0;
        System.out.println("Digite sair para encerrar o programa");
        int i = 0;
        while(i < cel.length){
            System.out.print("Digite a temperatura em celsius: ");
            String tempe = entrada.nextLine();
            if(tempe.equalsIgnoreCase("sair")){
                break;
            }
            cel[i] = Double.parseDouble(tempe);
            fah[i] = (cel[i]*9/5)+32;
            i++;
        }
        double mediaC = somaC/i;
        double mediaF = somaF/i;
        for(int x  = 0; x < i; x++){
            System.out.println("Conversão em F: " + fah[x]);
        }
        System.out.println("Media em Fahrenheit: " + mediaF);
        System.out.println("Media em Celsius: " + mediaC);
    }
}
