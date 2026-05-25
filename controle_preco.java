import static java.lang.IO.*;
void main(){
    //Lista
    double [] preco = new double[5];
    double maior = Double.MIN_VALUE;
    double menor = Double.MAX_VALUE;

    //Usuario vai solicitar 5 preços
    for(int i = 0; i < preco.length; i++){
        preco[i] = Double.parseDouble(readln("Solicite o " + (i+1) + "º preço: R$"));

        //Comparação
        if (preco[i] > maior){
            maior = preco[i];
        }if (preco[i] < menor){
            menor = preco[i];
        }
    }
    println("Maior preço: R$" + maior);
    println("Menor preço: R$" + menor);
}
