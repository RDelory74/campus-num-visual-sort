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
            for (int i = longueur -1; i >= 0; i--) {
                array.swap(i, longueur);
            }

        }
        catch (Exception e) {
            throw new UnsupportedOperationException("Not implemented");
        }}
    public void organiser (ObservableArray array){
        for (int i = 0; i < array.getLength()-1; i++) {
            remonter(array,i);
        }
    }
    public void remonter (ObservableArray array, int i) {
        if (i > i/2){
            array.swap(i,i/2);
            remonter(array,i/2);
        }
    }
    public void redescendre (ObservableArray array, int element,  int i) {


    }
}
