public class Operadores {
    public static void main(String[] args){

        // boolean variavel = true;

        // System.out.println(!variavel); //utilizar ! faz com que a o valor booleano seja invertido mas somente nesse print, na memória o resultado ainda será o original
        // System.out.println(variavel); //valor original não afetado pela !

        // variavel = !variavel; //dessa forma o resultado será invertido

        // System.out.println(variavel);
        
        // int numero = 5;

        // numero ++; //numero = numero + 1
        // System.out.println(numero); //caso utilize o (numero++), não será considerado nesse primeiro println, mas sim nos subsequentes

        // System.out.println(--numero); //forma de decrementar em 1 unidade de forma imediata

        // int a, b;
        // a = 5;
        // b = 6;

        // String resultado = a==b ?"verdadeiro" :"falso"; //a primeira operação sempre será uma expressão booleana
        // int resultado = a==b ? 1 : 0;

        // System.out.println(resultado);

        // String nomeUm = "Rafael";
        // String nomeDois = new String("Rafael");

        // System.out.println(nomeUm.equals(nomeDois)); //é mais indicado utilizar 'equals' para objetos

        // int numero1 = 1;
        // int numero2 = 2;

        // boolean simNao = numero1 == numero2;

        // if(numero1 < numero2){
        //     System.out.println("a nossa condição é verdadeira.");
        // }

        // System.out.println("numeroUm é igual a numeroDois? " + simNao);

        // simNao = numero1 != numero2;

        // System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        // simNao = numero1 > numero2;

        // System.out.println("numeroUm é maior que numeroDois? " + simNao);

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras.");
        }  

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("Fim");
    }
}
