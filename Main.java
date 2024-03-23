public class Main {
    public static void main(String[] args) {
        ArrayListDoubleEstadistica a = new ArrayListDoubleEstadistica();
        ArrayDoubleEstadistica b = new ArrayDoubleEstadistica();
        a.doubles.add(2.3);
        a.doubles.add(3.4);
        a.doubles.add(4.5);
        b.array = new double[]{1.2,3.2,6.3};
        System.out.println("Valor mínimo del ArrayList: "+a.minimo());
        System.out.println("Valor máximo del ArrayList: "+a.maximo());
        System.out.println("Suma de los elementos del ArrayList: "+a.suma());
        System.out.println("Valor mínimo del Array: "+b.minimo());
        System.out.println("Valor máximo del Array: "+b.maximo());
        System.out.println("Suma de los elementos del Array: "+b.suma());
    }
}