public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);


        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

        int numero = 1;
        numero = 2;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; //Para que não haja alteração, é necessário escrever em caixa alta e utilizar o final

        System.out.println(VALOR_DE_PI);
    }
}
