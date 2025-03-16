public class Main {
    public static void main(String[] args) {
    //O double é usado para números decimais, mas cuidado! o ponto(.) indica que um número é decimal, e não indica milhas, exemplo
        double salarioMinimo = 2.500;
        //Nesse exemplo a variável salário mínimo tem o número 2,5 armazenado e não 2500. Para armazenar o número 2500 corretamente, se deve inserir os dados da seguinte forma:
        double salarioMinimoCorreto = 2500;

        short numeroCurto = 1;
        //Nesse exemplo, nós temos uma variável short e queremos convertê-la para o tipo Int
        int numeroNormal = numeroCurto;
        //O java permite que façamos isso sem nenhum problema, mas não permite o inverso (int para short);
        //short numeroCurto2 = numeroNormal;
        //Essa função acima resultará num erro, já que um número Int pode ser maior que a variável short pode comportar, para corrigir esse erro e compilar o código sem problemas, devemos usar o "casting", ou converter o dado antes de mudarmos ele de ti:
        short numeroCurto2 = (short) numeroNormal;

        //O java também permite a criação de constantes, que são varíaveis que não podem ser mudadas, para sinalizar ao compilador que uma variável é uma constante, se deve usar o prefixo "final", exemplo
        final double PI = 3.14;
    }
}