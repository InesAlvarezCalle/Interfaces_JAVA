public class ArrayDoubleEstadistica implements Estadisticas{
    private double[] datos;
    private int cuantos;
    private int tope;

    public ArrayDoubleEstadistica(int capacidad){
        this.datos = new double[capacidad];
        this.cuantos = 0;
        this.tope = capacidad;
    }

    public void agregar(double valor){
        if(datos.length == 0){
            if(cuantos < tope){
                datos[cuantos++] = valor;
            } else {
                System.out.println("\nARRAY LLENO: no se pueden agregar más datos");
            }
        } else {
            System.out.println("Array no iniciado");
        }
    }

    @Override
    public double minimo(){
        if(datos.length == 0) {
            double min = datos[0];

            for (int i = 1; i < cuantos; i++) {
                if (datos[i] < min) {
                    min = datos[i];
                }
            }
            return min;
        } else {
            return 9999;
        }
    }

    @Override
    public double maximo(){
        if(datos.length == 0) {
            double max = datos[0];

            for (int i = 1; i < cuantos; i++) {
                if (datos[i] > max) {
                    max = datos[i];
                }
            }
            return max;
        } else {
            return 0;
        }
    }

    @Override
    public double media(){
        return suma() / cuantos();
    }

    @Override
    public double suma(){
        if(datos.length == 0) {
            double sum = 0;

            for (int i = 0; i < cuantos; i++) {
                sum += datos[i];
            }
            return sum;
        } else {
            return 0;
        }
    }

    @Override
    public double resta(){
        if(datos.length == 0) {
            double res = datos[0];

            for (int i = 1; i < cuantos; i++) {
                res -= datos[i];
            }
            return res;
        } else {
            return 0;
        }
    }

    @Override
    public int cuantos(){
        if(datos.length == 0) {
            return cuantos;
        } else {
            return 0;
        }
    }
}
