public class ArregloAscendente {
    public static Boolean verificar(int arr[][]) {
    int primero = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(primero > arr[i][j]) {
                    return false;
                } else {
                    primero = arr[i][j];
                }
            }    
        }
        return true;
    }
    public static void main(String args[]) {
        int arr[][] = {{2,3,5,7}, {7,8,9,11}, {12,13,16,18}};
        System.out.println(verificar(arr));
    }
}