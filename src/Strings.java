public class Strings {


    public static void main(String[] args) {
        //PRIMEMRA FORMA
        String s1 = "hola";
        //SEGUNDA FORMA
        String s2 = new String("HELLO");

        String s3 = "hello";


        System.out.println(s1 == s2); //== COMPARA TODO, TANTO LA FORMA DE CONTRUIRLO COMO EL CONTENIDO
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3)); //.EQUALS SOLO COMPARA EL CONTENIDO
        System.out.println(s2.intern() == s3); // DE ESTA FORMA SE COMPARA EL CONTENIDO DE S2 CON EL S3


        //PARA CAMBIAR DE MAYÚSCULA A MINÚSCULA
        System.out.println(s1);
        System.out.println(s1.toUpperCase()); //.toUpperCase PARA CAMBIAR A MAYÚSCULA
        System.out.println(s2.toLowerCase()); //.toLowerCase PARA CAMBIAR A MINÚSCULA

    }
}
