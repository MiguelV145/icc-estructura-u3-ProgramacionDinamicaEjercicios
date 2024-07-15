package Ejercicio;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;


/*
 * Implementa un método para devolver todos los subconjuntos de un arreglo de enteros
 * 
 * Se puede sin recursividad
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 * 
 * El  metodo me debe devolver una lista de listas de enteros. 
 * Se puede usar varios metodos 
 * 
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 */
public class EjercicioUno {

    public List<List<Integer>> subsets(List<Integer> set) {
        List<List<Integer>>subList= new ArrayList<List<Integer>>();
        subList.add(new ArrayList<Integer>());
        //Hace el recorrido de nuestro conjunto
        for (Integer elemntos: set){
            addSetByElement(elemntos,subList);
        }    
        return subList;
    }

    //Metodo para agregar y gradad nuestar respuesta 
    private void addSetByElement(Integer elemento,List<List<Integer>> subsLists){
        int n= subsLists.size();
        for (int i =0; i< n;i++){
            List<Integer> newList= new ArrayList<Integer>(subsLists.get(i));
            newList.add(elemento);
            subsLists.add(newList);
        }
    }
}
