package com.workintech.groceryList;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryList {
    private ArrayList<String> items = new ArrayList<>();

    public void addItems(String input) {
    String[] newItems = input.split(",\\s*");
    for(String newItem : newItems) {
        if(!items.contains(newItem)){
            items.add(newItem);
            System.out.println(newItem + "başarıyla eklendi.");
        }
        else {
            System.out.println(newItem + "zaten listede var.");
        }

    }
    Collections.sort(items);
    }

    public void removeItems(String input){
        String[] removeItems = input.split(",\\s*");
        for(String removeItem : removeItems){
            if(items.contains(removeItem)) {
                items.remove(removeItem);
                System.out.println(removeItem + "başarıyla çıkarıldı.");
            } else {
                System.out.println(removeItem + "listede bulunamadı.");
            }

        } Collections.sort((items));
    }

    public void printSorted() {
        System.out.println("Sıralanmış Liste: ");
        for(String item : items){
            System.out.println(item);
        }
    }


}
