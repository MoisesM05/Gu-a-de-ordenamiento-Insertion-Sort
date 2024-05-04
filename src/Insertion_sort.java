//Moisés Isaías Méndez Sánchez
//2024-1686U
//1M7-S
import java.util.InputMismatchException;
import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int arreglo [] = new int [10];
        boolean Continuar = true;

        do{//Bucle para las excepciones.
            try{
                System.out.println("---------------------------------------------");
                System.out.println("ingrese 10 numeros aleatorios: ");//Ingresar valores al arreglo.
                for(int i=0; i<arreglo.length; i++){
                System.out.println("Valor "+(i+1));
                arreglo[i]= leer.nextInt();
                }
                Continuar = false;//Si digita todos los numeros correctos, sale del bucle.

            }catch(InputMismatchException inputMismatchException){
                System.out.println("---------------------------------------------");
                System.out.println("Por favor ingrese solo numeros.");
                leer.nextLine();
            }
        }while(Continuar);
        

        System.out.println("---------------------------------------------");
        
        Insertion_sort Orden = new Insertion_sort();//Instancia del metodo ordenar
        Orden.Ordenar(arreglo);//Llamada al metodo.

        for(int j= 0; j<arreglo.length; j++){//Mostrar arreglo ordenado.

            System.out.println(arreglo[j]);
        }

    }

    public void Ordenar(int array[]){//Metodo Insertion Sort.
        int aux;
        int cont1, cont2;

        for(cont1 = 1; cont1<array.length; cont1++){

            aux = array[cont1];//Guardamos el valor 2 del arreglo en una variable auxiliar.
            for(cont2 = cont1-1; cont2 >=0 && array[cont2]>aux; cont2--){//Condiciones para comparar los valores mayores y menores.

                array[cont2+1]= array[cont2];//Ordena valores de derecho a izquierda, menor a mayor.
                array[cont2]= aux;

            }

        }

    }
}
