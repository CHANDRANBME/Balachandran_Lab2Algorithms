package com.greatlearning.labassignment2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		MergeSort mergeSort = new MergeSort();
		NotesCount notesCount = new NotesCount();

		System.out.println("enter the size of currency denominations ");
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			int[] notes = new int[size];
			System.out.println("enter the currency denominations value");
			for (int i = 0; i < size; i++) {
				notes[i] = sc.nextInt();
			}
			System.out.println("enter the amount you want to pay");
			int amount = sc.nextInt();
			mergeSort.sort(notes,0,notes.length-1);
			notesCount.notesCount(notes, amount);
		}
	}

}
