package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = elements[minIdx];
            elements[minIdx] = elements[i];
            elements[i] = temp;
        }
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            int minIdx = i;
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).compareTo(words.get(minIdx)) < 0) {
                    minIdx = j;
                }
            }
            String temp = words.get(minIdx);
            words.set(minIdx, words.get(i));
            words.set(i, temp);
        }
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
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
}