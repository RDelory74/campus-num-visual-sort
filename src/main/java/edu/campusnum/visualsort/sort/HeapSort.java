package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class HeapSort implements SortAlgorithm{


    @Override
    public void sort(ObservableArray array) {
        try {
            int longueur = array.getLength();
            organiser(array);
            for (int i = longueur -1; i > 0; i--) {
                array.swap(0, i);
                redescendre(array,i,0);
            }
        }
        catch (Exception e) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }



    //Méthodes
    public void organiser (ObservableArray array){
        for (int i = 0; i < array.getLength()-1; i++) {
            remonter(array,i);
        }
    }

    public void remonter (ObservableArray array, int i) {
        if (array.get(i) > array.get(i/2)){
            array.swap(i,i/2);
            remonter(array,i/2);
        }
    }

    public void redescendre (ObservableArray array,int element,int i) {

        int formule = (2* i) +1;
        int max;

        if (formule < element){
            if (array.get(formule)>array.get(2*i)) {
               max = formule;
            } else {
                max = 2*i;
            }
            if (array.get(max)> array.get(i)){
                array.swap(max,i);
                redescendre(array,element,max);
            }
        }
    }
}
