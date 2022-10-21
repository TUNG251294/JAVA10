package Lesson10.listProject;

import java.util.Scanner;

public class ProductManagementMenu {
    public void displayMenu(){
        System.out.println("Quan ly san pham");
        System.out.println("1. Add new product");
        System.out.println("2. Update product");
        System.out.println("3. Remove product");
        System.out.println("4. Search by id");
        System.out.println("5. Display all");
        System.out.println("0. Exit");
    }
    public void menu(){
        ProductManagement pManagement = new ProductManagement();
        Scanner scanner = new Scanner(System.in);
        while (true){
            displayMenu();
            System.out.println("Please choice");
            int choice = scanner.nextInt();
            scanner.hasNextLine();
            switch (choice){
                case 1:
                    pManagement.add(scannerProduct(scanner));
                    break;
                case 2:
                    Product pToUpdate = scannerProduct(scanner);
                    pManagement.update(pToUpdate.getId(),pToUpdate);
                    break;
                case 3:
                    System.out.println("Nhap so id can loai bo");
                    int idToRemove = scanner.nextInt();
                    pManagement.remove(idToRemove);
                    break;
                case 4:
                    System.out.println("Nhap so id can tim");
                    int idToSearch = scanner.nextInt();
                    pManagement.searchByID(idToSearch);
                    break;
                case 5:
                    System.out.println(pManagement);
                    break;
                default:
                    System.exit(0);
                }
            }
        }private static Product scannerProduct(Scanner scanner){
        System.out.println("nhap so id");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("nhap name");
        String name = scanner.nextLine();

        System.out.println("nhap price");
        double price = scanner.nextDouble();

        Product p = new Product(id, name, price);
        return p;
    }
}