import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //He afegit la generació automàtica de números aleatoris
        Random r = new Random();
        ArrayListDoubleEstadistica a = new ArrayListDoubleEstadistica();
        ArrayDoubleEstadistica b = new ArrayDoubleEstadistica(3);
        
        for(int i = 0; i < b.tope ; i ++){
            b.add(r.nextDouble()*10);
        }
        for(int i = 0; i < 3; i ++){
            a.add(r.nextDouble()*10);
        }
        // He modificat els prints per jugar un poc amb el format d'eixida
        System.out.printf("Valor mínimo del ArrayList: %.2f\n",a.minimo());
        System.out.printf("Valor máximo del ArrayList: %.2f\n",a.maximo());
        System.out.printf("Suma de los elementos del ArrayList: %.2f\n",a.suma());
        System.out.printf("Valor mínimo del Array: %.2f\n",b.minimo());
        System.out.printf("Valor máximo del Array: %.2f\n",b.maximo());
        System.out.printf("Suma de los elementos del Array: %.2f\n",b.suma());
    }
}