public class Operadores {
    public static void main(String[] args) {
        /* OPERADORES ARITMÉTICOS
        +  suma
        -  resta
        *  multiplicación
        /  división
        %  modulo = resto
         */

        int num1 = 10;
        int num2 = 2;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);



        /*OPERADORES RELACIONALES = dan un resultado booleano
        <  menor que
        > mayor que
        <=  menor o igual
        >= mayor o igual
        ==  igualdad o equals
        !=  diferente
         */
        System.out.println("");
        System.out.println(1 < 10);
        System.out.println(1 > 10);
        System.out.println(1 <= 10);
        System.out.println(1 >= 10);
        System.out.println(1 == 10);
        System.out.println(1 != 10);



        /* OPERADORES LÓGICOS = Expresiones booleanas, resultado booleano
        &&  and ( y )
        ||  or ( o )
        !  negacion
         */

        boolean a = true;
        boolean b = false;

        System.out.println("");
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);


    }
}
