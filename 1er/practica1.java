/**
 * practica1
 */
public class practica1 {
  public static int arr[][] = { { 8, 4, 2, 9 }, { 3, 0, 4, 1 }, { 4, 3, 4, 6 } };

  public static Boolean aparece(int a[][], int num) {
    int cont = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] == num) {
          cont++;
        }
      }
    }
    return cont == num;
  }
/*
  public static int valoresEsquinas(int a[][]) {
    for (int i = 0; i < a.length; i++) {
      int suma = 0;
      for (int j = 0; j < a[i]; j++) {
        if (i == 0 && j == 0 || i == 0 && j == a[i].length - 1 || i == a[i].lenght - 1 && j == 0
            || i == a[i].length - 1) {

        }
      }
    }
    return suma;
  }
*/
  public static void main(String[] args) {
    System.out.println(aparece(arr, 4));
  
  }
}
