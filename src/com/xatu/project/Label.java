package com.xatu.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Label {
     public int[] model(List<User> list) {
    	int[] array=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			array[i]=list.get(i).getAge();
		}
		ArraySort(array, 0, array.length-1);
        return array;
     }
     // �������򷽷�
     private static void ArraySort(int[] array, int lowIndex, int highIndex) {
         int low = lowIndex;
         int high = highIndex;
         int mid;
         if (lowIndex < highIndex) {
             while (low <= high) {
                 mid = array[(lowIndex + highIndex) / 2];
                 while ((low < highIndex) && (array[low] < mid)) {
                     ++low;
                 }
                 while ((high > lowIndex) && (array[high] > mid)) {
                     --high;
                 }
                 if (low <= high) {
                     wrap(array, low, high);
                     ++low;
                     --high;
                 }
             }
             if (low < highIndex) {
                 ArraySort(array, low, highIndex);
             }
             if (high > lowIndex) {
                 ArraySort(array, lowIndex, high);
             }
         }

     }

     // ��������Ԫ��
     private static void wrap(int[] array, int low, int high) {
         // TODO Auto-generated method stub
         int temp = array[low];
         array[low] = array[high];
         array[high] = temp;
     }

}
