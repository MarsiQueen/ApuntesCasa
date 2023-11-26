import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipulaciónArchivos {

    public void createFile(String fileName) {
        System.out.println("=== Creando el archivo " + fileName + " ===");
        boolean fileCreated = false; //Para saber si se ha creado bien el archivo o por si ya está creado
        File file = new File(fileName); //Creación del Objeto. Si ponemos nombre al archivo en vez de fileName y antes de poner el nombre ponemos un nombre de una carpeta y // eso indica que se creará en esa carpeta
        try {
            fileCreated = file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);//Instancia que nos permite escribir en el archivo
            fileWriter.write("Aprendiendo a manejar archivos");//Lo que queremos escribir en el archivo
            fileWriter.close();//Para finalizar la escritura
            if(fileCreated) { //Para decir que el archivo se ha creado o ya existe uno en base al booleano creado anteriormente
                System.out.println("=== El archivo se creo correctamente ===");
            } else {
                System.out.println("=== El archivo ya existe ===");
            }
        } catch (IOException e) { //El contenido del paréntesis es el tipo de excepción que queremos poner
            System.out.println("=== Excepcion al crear el archivo " + e);
        }
    }

    public void readFile(String fileName) {
        System.out.println("=== Leyendo el archivo " + fileName + " ===");
        File file = new File(fileName);//El contenido entre paréntesis indica el archivo que vamos a leer/abrir.
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) { //Para mostrar el contenido del archivo, la condición significa que se repetirá el ciclo siempre que en el archivo haya texto.
                String data = sc.nextLine();//Decir que tipo de dato es que el contiene el archivo y así luego poder imprimirlo.
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(" === Hubo un error al abrir el archivo " + e);
        }
    }

    public void deleteFile(String fileName) {
        System.out.println("=== Borrando el archivo " + fileName + " ===");
        File file = new File(fileName);
        if (file.delete()) {//Para eliminar el archivo
            System.out.println("=== El archivo se borro correctamente ===");
        } else {
            System.out.println("=== No se pudo borrar el archivo ===");
        }
    }
}
