import java.util.Arrays;

public class examen {

    public static void disparar(int f, int c, char[][] m) {
        if (m[f][c] == 'H') {
            int col = c;
            while (col < m[f].length && m[f][col] == 'H') {
                m[f][col] = 'X';
                col++;
            }
            col = c - 1;
            while (col >= 0 && m[f][col] == 'H') {
                m[f][col] = 'X';
                col--;
            }
        } else if (m[f][c] == 'V') {
            int fila = f;
            while (fila < m.length && m[fila][c] == 'V') {
                m[fila][c] = 'X';
                fila++;
            }
            fila = f - 1;
            while (fila >= 0 && m[fila][c] == 'V') {
                m[fila][c] = 'X';
                fila--;
            }
        }
    }

    public static void main(String[] args) {
        char m[][] = { 
            {'~', '~', '~', '~', '~', '~'},
            {'~', 'H', 'H', 'H', '~', 'H'},
            {'~', '~', '~', '~', 'V', '~'},
            {'~', '~', '~', '~', 'V', '~'},
            {'~', '~', '~', '~', 'V', '~'},
            {'~', '~', '~', '~', '~', '~'},
            {'~', '~', '~', '~', 'V', '~'},
            {'~', '~', '~', '~', 'V', '~'},
        };
        
        disparar(1, 3, m); 
        disparar(2, 4, m);

        for (char[] cs : m) {
            System.out.println(Arrays.toString(cs));
        }
    }
}
