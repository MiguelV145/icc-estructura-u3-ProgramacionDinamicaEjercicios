import Ejercicio.EjercicioUno;
import java.util.List;
import java.util.ArrayList;
import Ejercicio.EjercicioDos;

public class App {
    public static void main(String[] args) throws Exception {

        EjercicioUno ejerUno = new EjercicioUno();
        List<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);
        List<List<Integer>> result = ejerUno.subsets(set);
        System.out.println("Resolución del Ejercicio Uno:");
        System.out.println(result);


        System.out.println("--------------------------");
        EjercicioDos ejerDos = new EjercicioDos();
        int n = 1;
        List<String> result1 = ejerDos.generateParenthesis(n);
        System.out.println("Resolución del Ejercicio Dos con 1 de entrada:");
        System.out.println(result);
        int n2 = 3;
        List<String> result2 = ejerDos.generateParenthesis(n);
        System.out.println("Resolución del Ejercicio Dos con 3 de entrada:");
        System.out.println(result);
    }
}
