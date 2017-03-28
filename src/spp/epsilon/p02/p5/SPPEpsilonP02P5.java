//Proyecto Parcial 2 
//Problema 5
//Equipo Epsilon
//Nombres, matrículas y carreras de integrantes de equipo:
//Roberto Alain Rivera Bravo | A01411516 | IMT11
//Fabricio Arturo Balboa Cavazos | A01411541 | IMT11
//Andrés de Jesús Martínez Castillo | A01411447 | IMT11
//Jessica Delgado González | A01411536 | IMT11
//Alfredo Alejandro Lárraga Sosa | A01410278 | LMC

/*
5.	Dada una matriz de dos dimensiones con tamaño y contenido determinado por el usuario, 
realice un programa que calcule la suma de cada fila y guarde su resultado un vector en la posición correspondiente. 
Al minal deberá recorrer el lector para mostrar el resultado de las sumas.
*/
package spp.epsilon.p02.p5;
import java.util.Scanner;

public class SPPEpsilonP02P5 {

   
    public static void main(String[] args) {
      Scanner kb=new Scanner(System.in);//Método scanner para introducir valores por teclado
        int[][] A;//Se declara la matriz 
        System.out.println("Problema 5");
        //Se ingresa el tamaño de la matriz
             System.out.println("\nIngrese el ancho de la matriz");
                int m=kb.nextInt();
             System.out.println("\nIngrese el alto de la matriz");
                int n=kb.nextInt();
        
        A=matriz(m,n);//Se le otorgan valores a la matriz mediante el metodo matriz()
        sumafilas(A,m,n);//Mediante el método sumafilas()se obtiene el vector con la suma de las filas de la matriz
    }
    public static int[][] matriz(int m, int n){//Método que devuelve una matriz con valores ingresados por el usuario
        int[][] matriz= new int[m][n];//Declaración de la matriz con tamaño determinado por el usuario
        System.out.println("\nIntroduzca los valores de la matriz ");
            for (int i = 0; i < matriz.length; i++) {//Se utiliza un for para recorrer las columnas del arreglo
                for (int j = 0; j < matriz[i].length; j++) {//Se utiliza otro for para recorrer las filas
                    matriz[i][j]=solicitarentero();//Se ingresan los valores de la matriz en cada espacio de la matriz
                }
            }
        return matriz;//Se regresa la matriz con valores introducidos por el usuario
    }
    public static int solicitarentero(){//Método para ingresar por teclado valores enteros
        Scanner kb=new Scanner (System.in);//Llamo al método Scanner de la librería para introducir valores por teclado
        int n=0;
        boolean flag;
         do{
            try{//Se utiliza Try & catch para evitar errores al ingresar datos por teclado
                n=kb.nextInt();
                flag= true;
            }catch (Exception ex) {
                System.out.println("Dato no válido");
                flag=false;
                kb.nextLine();          
            }               
         }while(flag==false);
        return n;//Se devuelve un valor entero
    }
    public static void sumafilas(int[][]A,int m,int n){//Metodo para sumar las filas de una matriz e imprimir un vector
        int[]vector = new int[m];//Se declara el vector con el tamaño con respecto al nuero de columnas de la matriz
        
        System.out.println("\nEl vector de la suma de cada fila es: ");
       System.out.print("{");
        for (int i = 0; i < A.length; i++) {//Se utiliza un for para las columnas de la matriz
            for (int j = 0; j < A[i].length; j++) {//Se utiliza otro for para las filas
                vector[i] += A[i][j];     //Se sumará cada valor que hay en las filas de la matriz y se asignarán a un vector
            }
            System.out.print(vector[i]);//Se imprime cada suma obtenida de las filas de la matri
            if(i<m-1)System.out.print(",");//Se pondrá una coma hasta un valor antes del último del vector
        }
        System.out.println("}");
        System.out.println("");//Salto de línea
    }
}