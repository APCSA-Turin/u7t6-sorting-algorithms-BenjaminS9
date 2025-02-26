package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        for (int i = 1; i < elements.length; i++) {
            int idx = i;
            while(idx != 0 && elements[idx] < elements[idx - 1]) {
                int temp = elements[idx];
                elements[idx] = elements[idx - 1];
                elements[idx - 1] = temp;
                idx--;
                count++;
            }
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return elements;
    }

   
    public static void selectionSort(int[] elements) {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[minIdx]) {
                    minIdx = j;
                }
                count++;
            }
            int temp = elements[minIdx];
            elements[minIdx] = elements[i];
            elements[i] = temp;
        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + count);
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int count = 0;
        for (int i = 1; i < words.size(); i++) {
            int idx = i;
            while(idx != 0 && words.get(idx).compareTo(words.get(idx - 1)) < 0) {
                String temp = words.get(idx);
                words.set(idx, words.get(idx - 1));
                words.set(idx - 1, temp);
                idx--;
                count++;
            }
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            int minIdx = i;
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).compareTo(words.get(minIdx)) < 0) {
                    minIdx = j;
                }
                count++;
            }
            String temp = words.get(minIdx);
            words.set(minIdx, words.get(i));
            words.set(i, temp);
        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + count);
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

    public static void main(String[] args) {
        int[] arrA = {47,62,75,4,26,40,96,88,38,56,18,2,28,74,70,34,48,63,39,17,45,97,95,5,32,86,79,20,37,68,15,67,60,87,83,61,19,53,72,44,76,65,6,69,54,78,64,77,81,58};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {47,62,75,4,26,40,96,88,38,56,18,2,28,74,70,34,48,63,39,17,45,97,95,5,32,86,79,20,37,68,15,67,60,87,83,61,19,53,72,44,76,65,6,69,54,78,64,77,81,58};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));        
    }
}