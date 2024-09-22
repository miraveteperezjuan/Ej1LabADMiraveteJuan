import controller.GestorFicheros;

public class EntradaEjercicio {

    public static void main(String[] args){

        GestorFicheros gestorFicheros = new GestorFicheros();
        gestorFicheros.lecturaDirectorios("src/resouces/directorio");
        gestorFicheros.lecturaRecursiva("C:\\Users\\JUAN\\Desktop\\FP");


    }


}
