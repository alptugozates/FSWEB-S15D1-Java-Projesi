package com.workintech.groceryList;

import com.workintech.groceryList.GroceryList;

import java.util.Scanner;

public class groceryListMain {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("0 - Çıkış");
            System.out.println("1 - Eleman ekle");
            System.out.println("2 - Eleman çıkar");
            System.out.println("3 - Listeyi sırala");
            System.out.print("Seçiminiz: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Eklemek istediğiniz eleman(ları) girin ve virgülle ayırın.");
                    String addInput = scanner.nextLine();
                    groceryList.addItems(addInput);
                    break;

                case 2:
                    System.out.println("Çıkarmak istediğiniz eleman(ları) girin ve virgülle ayırın.");
                    String removeInput = scanner.nextLine();
                    groceryList.removeItems(removeInput);
                    break;
                case 3:
                    groceryList.printSorted();
                    break;
                case 0:
                    System.out.println("Uygulama kapatılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyiniz.");
            }
        } while (choice != 0);
            scanner.close();

    }
}