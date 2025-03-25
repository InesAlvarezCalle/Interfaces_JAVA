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

    public static void mostrarEstadisticas(Estadisticas obj){
        System.out.println("Mínimo: " + obj.minimo());
        System.out.println("Máximo: " + obj.maximo());
        System.out.println("Media: " + obj.media());
        System.out.println("Suma: " + obj.suma());
        System.out.println("Resta: " + obj.resta());
        System.out.println("Cuantos: " + obj.cuantos());
    }

    public static void main(String[] args){
        pruebaEstadistica();
    }
}