package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class QuickSort implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array) {
        tri_rapide(array, 0, array.getLength() - 1);
    }

    public void tri_rapide(ObservableArray array, int premier, int dernier) {
        int pi;
        if ((dernier - premier +1) >= 2) {
            pi = partitionner(array, premier, dernier);
            tri_rapide(array, premier, pi - 1);
            tri_rapide(array, pi + 1, dernier);
        }
    }

    public int partitionner(ObservableArray array, int premier, int dernier) {
        int pivot = dernier;
        int j = premier;
        for (int i = premier ; i <= pivot - 1; i ++) {
            if (array.get(i) <= array.get(pivot)){
                array.swap(i, j);
                j = j + 1;
            }
        }
        array.swap(dernier,j);
        return j;
   }
}
