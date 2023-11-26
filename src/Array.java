public class Array {


    public static void main(String[] args) {
        //PRIMERA FORMA
        int [] numeros = new int[10];
        numeros[0] = 50;
        numeros[1] = 60;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println();

        //SEGUNDA FORMA
        int [] numero = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numero[0]);
        numero[0] = 5;
        System.out.println(numero[0]);
        System.out.println(numero.length);

        int [] copia;
        copia = numero.clone();
        System.out.println(copia[5]);



    }
}
