public class Main {
    public static void pruebaEstadistica() {
        ArrayListDoubleEstadistica lista = new ArrayListDoubleEstadistica();
        ArrayDoubleEstadistica array = new ArrayDoubleEstadistica(5);

        double[] valores = {3.5, 4.9, 16.1, 0.2, 6.7};
        for (double v : valores){
            lista.agregar(v);
            array.agregar(v);
        }
        System.out.println("\nEstadísticas con ArrayList:");
        mostrarEstadisticas(lista);
        System.out.println("\nEstadísticas con Array:");
        mostrarEstadisticas(array);
    }

    public static void programaFigura(){
        int opcion;

        do{
            System.out.println("1. Crea un ArrayList figuras");
            System.out.println("2. Añadir figuras de diferentes tipos");
            System.out.println("3. Mostrar la información de todas las figuras del ArrayList");
            System.out.println("4. Escalar todas las figuras según un valor introducido");
            System.out.println("5. Mostrar la información de una figura seleccionada");
            System.out.println("6. Mostrar el área de una figura seleccionada");
            System.out.println("7. Mostrar el perímetro de una figura seleccionada");
            System.out.println("0. SALIR");

            opcion = Leer.leerEntero("\nIntroduzca una opción: ");

            switch (opcion){
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                default:
                    System.out.println("\nERROR: Valor introducido no válido");
                    break;
            }
        } while (opcion != 0);
    }

    public static void mostrarEstadisticas(Estadisticas obj){
        System.out.println("Mínimo: " + obj.minimo());
        System.out.println("Máximo: " + obj.maximo());
        System.out.println("Media: " + obj.media());
        System.out.println("Suma: " + obj.suma());
        System.out.println("Resta: " + obj.resta());
        System.out.println("Cuantos: " + obj.cuantos());
    }

    public static void main(String[] args){
        String opcion;

        do {
            System.out.println("E - Estadística");
            System.out.println("F - Figura");
            System.out.println("S - SALIR");

            opcion = Leer.leerTexto("Introduce la opción que desea ejecutar: ").toUpperCase();

            if (opcion.equals("E")){
                pruebaEstadistica();
            } else {
                programaFigura();
            }

        } while (!opcion.equals("S"));
    }
}