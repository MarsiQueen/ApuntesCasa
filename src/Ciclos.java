public class Ciclos {
    public static void main(String[] args) {
        int i = 0;

        /*While = Mientras se cumpla la condición entre paréntesis
        se realizará el contenido del While.
         */
        while (i < 5){ //El contenido entre paréntesis es la condición que debe seguir el While
            System.out.println("El valor de i es: " + i);
            i++;
        }

        /*Do While = La condición se revisa al final del proceso. Se
        realiza al menos 1 vez.
         */

        do {
            System.out.println("El valor de i es: " + i);
            i++;
        }while (i < 5);


        /*For = Es una forma de hacer de nuevo un ciclo, pero
        con todo en una misma línea y aplicando un inicio y un
        final de la condición.
        1ºFORMA:
        for ( int (donde empieza la repetición); (donde acaba); (si aumenta o disminuye las vueltas)) {
         */
        for (int j = 0; j < 5; j++){
            System.out.println("El valor de j es: " + j);
        }

        /*2ºFORMA: Que sirve para Arrays
        for (Tipo de dato de la Array + nombre que queramos poner : nombre de la Array) {
         */
    }


}
