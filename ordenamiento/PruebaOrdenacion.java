import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class PruebaOrdenacion {

    public static int[] inicializarArregloAleatorio(int n) {
        Random rand = new Random();
        int[] arreglo = new int[n];

        final int MAX = 1000;

        for (int i = 0; i < n; i++) {
            // Genera un entero aleatorio entre 0 (inclusivo) y 1001 (exclusivo),
            // lo que resulta en un rango de [0, 1000].
            arreglo[i] = rand.nextInt(MAX + 1);
        }

        return arreglo;
    }

    public static String GetCpuInfoFromFile() {
        String processorModel = "No se pudo encontrar en /proc/cpuinfo";

        // La ruta al archivo del kernel que contiene la info de la CPU
        String procFile = "/proc/cpuinfo";

        try (BufferedReader reader = new BufferedReader(new FileReader(procFile))) {

            String line;
            while ((line = reader.readLine()) != null) {

                // En /proc/cpuinfo, la línea es "model name : ..."
                if (line.trim().startsWith("model name")) {

                    // Extraemos la info (igual que antes)
                    processorModel = line.substring(line.indexOf(":") + 1).trim();

                    // En /proc/cpuinfo, esta línea se repite por CADA núcleo.
                    // Una vez que la encontramos, ya no necesitamos seguir leyendo.
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            processorModel = "Error al leer /proc/cpuinfo: " + e.getMessage();
        }

        return processorModel;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] datos = inicializarArregloAleatorio(3_000_000);

        System.out.println("Arreglo original:");
        // Ordenacion.imprimirArreglo(datos); // no lo imprimos porque tomaría tiempo ,
        // y más si son millones de datos

        // 1. Registrar el tiempo de inicio
        long tiempoInicioNano = System.nanoTime();

        // 2. Llamar a la función cuyo tiempo de ejecución queremos medir
        System.out.println("Ordenando ... ... ...");
        Ordenacion.heapSort(datos); // ESTO es lo único que irá cambiando en este archivo

        // 3. Registrar el tiempo de finalización
        long tiempoFinNano = System.nanoTime();

        System.out.println("\nArreglo ordenado (Heap):");
        // // no lo imprimos porque tomaría tiempo , y más si son millones de datos ..
        // pero ya está probado que ordena

        // 4. Hacer la aritmética para obtener el tiempo en segundos
        long tiempoEjecucionNano = tiempoFinNano - tiempoInicioNano;
        double tiempoEjecucionSegundos = (double) tiempoEjecucionNano / 1000000000.0;

        // 6. Imprimir los resultados
        System.out.println("----------------------------------------");
        System.out.printf("Tiempo de Ejecución (Segundos): %.4f s\n", tiempoEjecucionSegundos);
        // NO ELIMINE las siguientes líneas
        System.out.println("ID del procesador: " + GetCpuInfoFromFile());
        String arch = System.getProperty("os.arch");
        System.out.println("Arquitectura del procesador: " + arch);
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Número de procesadores (núcleos lógicos): " + cores);
        String tempDir = System.getProperty("java.io.tmpdir");
        System.out.println("Directorio temporal: " + tempDir);
    }
}