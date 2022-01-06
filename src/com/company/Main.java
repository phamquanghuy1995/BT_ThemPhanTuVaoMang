package com.company;

public class Main {

    public static void main(String[] args) {
        String[] array = {"Pit bull", "Dogberman", "Rottweiler", "Béc Đức", "Béc Bỉ"};
        System.out.println("Mảng ban đầu");
        for (String element : array) {
            System.out.println(element);
        }
        String[] newArray = xoaPhanTuKhoiMang(array, 3, "Dogo Argentino");
        System.out.println("Mảng sau khi thêm");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static String[] xoaPhanTuKhoiMang(String[] array, int index, String value) {
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }
}
