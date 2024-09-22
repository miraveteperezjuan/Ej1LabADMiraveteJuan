package controller;

import java.io.File;

public class GestorFicheros {

    public void lecturaDirectorios(String path){

        // File (logico que esto apunta a un file que tiene que ser fisico, es decir que exista)
        // Un fichero logico puede o no existir. Un fichero de tipo fisico si que existe. la ruta que se pone en "" es el fisico y el logico lo que hay puesto ahroa
        File file = new File(path); //logico y apunta a uno fisico. los logicos pasan a ser fisicos si existen.

       String[] nombres = file.list();
       File[] ficheros = file.listFiles(); //Aqui tengo todo

       for (File item: ficheros){
         if(!item.isHidden()){ //Este lo que dice es que si es un fichero oculto. Si no es oculto muestramelo.
             System.out.println(item.getName());
             if(item.isDirectory()){
                 File[] subdirectorio = item.listFiles(); //Sacate los ficheros si esta dentro de un directorio
                 for (File file1: subdirectorio){
                     System.out.println("\t"+file1.getName()); //La t es un tabulado
                 }
             }
         }
       }
/*
       for (String item:nombres ){
           if(!(item.charAt(0) == '.')) {
               System.out.println(item);
           }
        }
        */


    }

    //Ejercicio 2

    public void lecturaRecursiva(String path){
        File file = new File(path);
        File[] ficheros = file.listFiles();
        for(File item: ficheros){
            System.out.println(item.getName());
            if(item.isDirectory()){
            lecturaSubdirectorios(item);
            }

            //Pregunto si es directorio y en su caso, saco todos los ficheros del directorio y los muestro


            }
        //RECURSIVIDAD -> EJECUCIÓN QUE SE LLAMA A ELLA MISMA. PREGUNTO UNA Y OTRA VEZ. CON CUIDADO QUE TENGA UNA SALIDA.

        }

    private void lecturaSubdirectorios(File fichero) {
        for(File file :fichero.listFiles()){
            System.out.println("\t" + file.getName());
            if(file.isDirectory()){
                lecturaSubdirectorios(file); //Vuelvo a entrar en el metodo y miro.
            }
        }



    }







}
