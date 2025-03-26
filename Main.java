import java.util.ArrayList;

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
        ArrayList<iFigura2D> figuras = null;
        boolean listaCreada = false;

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
                    System.out.println("\nCreando...");
                    if (!listaCreada){
                        figuras = new ArrayList<>();
                        listaCreada = true;
                        System.out.println("¡ArrayList creada!");
                    } else {
                        System.out.println("La lista ya está creada");
                    }
                    break;

                case 2:
                    if(listaCreada){
                        int tipoFigura;

                        do {
                            System.out.println("------------------------");
                            System.out.println("FIGURAS");
                            System.out.println("------------------------");
                            System.out.println("1. Cuadrado");
                            System.out.println("2. Rectángulo");
                            System.out.println("3. Triángulo");
                            System.out.println("4. Círculo");
                            System.out.println("0. SALIR");
                            System.out.println("------------------------");

                            tipoFigura = Leer.leerEntero("Introduzca su opción: ");


                            switch (tipoFigura){
                                case 0:
                                    System.out.println("Saliendo del submenú...");
                                    break;

                                case 1:
                                    Cuadrado c = new Cuadrado(Leer.leerDouble("\nIntroduce la longitud de los lados: "));
                                    figuras.add(c);
                                    break;

                                case 2:
                                    Rectangulo r = new Rectangulo(Leer.leerDouble("\nIntroduce la longitud de un lado: "),
                                            Leer.leerDouble("Introduce la longitud del otro lado: "));
                                    figuras.add(r);
                                    break;

                                case 3:
                                    Triangulo t = new Triangulo(Leer.leerDouble("\nIntroduce la longitud de la base: "),
                                            Leer.leerDouble("Introduce la altura: "));
                                    figuras.add(t);
                                    break;

                                case 4:
                                    Circulo ci = new Circulo(Leer.leerDouble("\nIntroduce la longitud del radio: "));
                                    figuras.add(ci);
                                    break;

                                default:
                                    System.out.println("\nERROR: Valor introducido no válido");
                                    break;
                                }
                        } while (tipoFigura != 0);
                    } else {
                        System.out.println("\nNo se ha podido crear figura, porque no existe el ArrayList");
                    }
                    break;

                case 3:
                    if(listaCreada){
                        for (iFigura2D f : figuras){
                            System.out.println(f);
                        }
                    } else {
                        System.out.println("\nNo se ha podido mostrar, porque no existe el ArrayList");
                    }
                    break;

                case 4:
                    double numEscalar = Leer.leerDouble("\nIntroduce un número para escalar todas las figuras: ");

                    if(listaCreada){
                        for (iFigura2D f : figuras){
                            f.escalar(numEscalar);
                        }
                    } else {
                        System.out.println("\nNo se ha podido escalar, porque no existe el ArrayList");
                    }
                    break;

                case 5:
                    if(listaCreada){
                        String opc;
                        int iteracion = 0, index;

                        do {
                            System.out.println("S. Ver la lista de posiciones");
                            System.out.println("N. No ver la lista, introducir directamente el índice");

                            opc = Leer.leerTexto("\nIntroduzca la opción: ").toUpperCase();

                            if(opc.equals("S")){
                                for (iFigura2D f : figuras){
                                    System.out.println(f);
                                }
                                iteracion++;
                            }

                        } while (!opc.equals("N") || iteracion == 1);

                        index = Leer.leerEntero("Introduce la posición que desea mostrar: ");

                        if(index >= 0 && index < figuras.size()){
                            System.out.println(figuras.get(index));
                        } else {
                            System.out.println("\nHas introducido un valor que no se encuentra");
                        }

                    } else {
                        System.out.println("\nNo se ha podido mostrar, porque no existe el ArrayList");
                    }
                    break;

                case 6:
                    if(listaCreada) {
                        String opc;
                        int iteracion = 0, index;

                        do {
                            System.out.println("S. Ver la lista de posiciones");
                            System.out.println("N. No ver la lista, introducir directamente el índice");

                            opc = Leer.leerTexto("\nIntroduzca la opción: ").toUpperCase();

                            if (opc.equals("S")) {
                                for (iFigura2D f : figuras) {
                                    System.out.println(f);
                                }
                                iteracion++;
                            }

                        } while (!opc.equals("N") || iteracion == 1);

                        index = Leer.leerEntero("\nIntroduzca un número para mostrar su base: ");
                        System.out.println("Area: " + figuras.get(index).area());

                    } else {
                        System.out.println("\nNo se ha podido mostrar, porque no existe el ArrayList");
                    }
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