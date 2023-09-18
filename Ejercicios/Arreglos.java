import java.util.Scanner;

public class Arreglos {
    
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);


        while(cantidadNotas <= 0) {
            System.out.println("No se permiten valores menores o iguales a cero");
            System.out.println("Cantidad de notas: ");
        int cantidadNotas = lector.nextInt();
        }

        int[] notas = new int[cantidadNotas];

        //Arrays
        System.out.println("Ingrese las notas del grupo:");
        for(int i = 0; i < notas.length ; i++) {
            System.out.print("Nota [" + i+1 + "] = ");
            notas[i] = lector.nextInt();

        }



        lector.close();
    }
}
