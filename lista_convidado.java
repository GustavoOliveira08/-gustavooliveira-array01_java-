import static java.lang.IO.*;
void main() {
    String[] nomes = new String[5];

    for(int x = 0; x < nomes.length; x++){
        nomes[x] = readln("Digite seu nome: ");
    }
    IO.println("Temos " + nomes.length + " cadastrados");
    for(int x = 0; x < nomes.length; x++){
        println((x + 1) + "° convidado: " + nomes[x]);
    }
}
