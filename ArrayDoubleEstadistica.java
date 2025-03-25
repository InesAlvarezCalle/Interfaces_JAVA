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
        if(cuantos < tope){
            datos[cuantos++] = valor;
        } else {
            System.out.println("\nARRAY LLENO: no se pueden agregar más datos");
        }
    }

    @Override
    public double minimo(){
        double min = datos[0];

        for (int i = 1; i < cuantos; i++) {
            if(datos[i] < min){
                min = datos[i];
            }
        }
        return min;
    }

    @Override
    public double maximo(){
        double max = datos[0];

        for (int i = 1; i < cuantos; i++) {
            if(datos[i] > max){
                max = datos[i];
            }
        }
        return max;
    }

    @Override
    public double media(){
        return suma() / cuantos();
    }

    @Override
    public double suma(){
        double sum = 0;

        for (int i = 0; i < cuantos; i++) {
            sum += datos[i];
        }
        return sum;
    }

    @Override
    public double resta(){
        double res = datos[0];

        for (int i = 1; i < cuantos; i++) {
            res -= datos[i];
        }
        return res;
    }

    @Override
    public int cuantos(){
        return cuantos;
    }
}
