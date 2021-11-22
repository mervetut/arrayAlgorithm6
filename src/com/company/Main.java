package com.company;

import java.util.Arrays;

// this is question 7
public class Main {

    public static void main(String[] args) {
        String[] words = {"hello", "how", "are", "you"};
        int n = words.length;
        Integer.toString(n);
        for (int i = 0; i < words.length - 1; i++)
        {

            int indSmallest = 1;
            for (int j = i + 1; j < words.length; j++)
                if (Arrays.toString(n[j]) < words[indSmallest])
                    indSmallest = j;
            swap(words, i, indSmallest);
        }
        for (String a : words)
            System.out.print(a + " ");


    }
    static void swap (String[] array, int ind1, int ind2)
    {
        //for (var i = array.length - 1; i > 0; i--) {
          //  var j = Math.floor(Math.random() * (i + 1));
        String tmp = array [ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;

    }
}
