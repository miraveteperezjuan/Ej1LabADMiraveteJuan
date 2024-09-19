package resouces;

import java.io.File;
import java.io.IOException;

public class Entrada {

    public static void main(String[] args) {

        //https://www.youtube.com/watch?v=nTfDkLRrYiM

        // 1 -> Obtener todos los nombre de los ficheros del directorio llamado directorio

        System.out.println("---- Ejercicio 1 ----");

        File carpeta = new File("src/resouces/directorio");
        String[] content = carpeta.list();
        System.out.println("Ficheros del directorio" + carpeta);
        System.out.println("-----------------------");
        for (String aux : content) {
            System.out.println(aux);
        }


        //  2 -> Crear una subcarpeta en el directorio llamado directorio y crear en ella un fichero

        System.out.println("---- Ejercicio 2 ----");

        File file1 = new File("src/resouces/directorio/subcarpeta/ficheronuevo.txt");

        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException("No se ha podido crear" + file1 + e.getMessage());
            }
        }

        // 3 -> Listar el nombre de todos los ficheros del SISTEMA ( C:/User o /Users )

        File actividad3 = new File("C:/Users");
        System.out.println("---- Ejercicio 3 ----");
        listarTodo(actividad3);

    }

    public static void listarTodo(File directorio){
        File[] ficheros = directorio.listFiles();
        if(ficheros != null){
            for(File aux: ficheros){
                System.out.println(aux.getAbsolutePath());
                listarTodo(aux);
            }
        }
    }

}
