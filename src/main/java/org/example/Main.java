package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Directory> directories = new ArrayList<>();
        directories.add(new Directory(1,"880077","John",3.6));
        directories.add(new Directory(2,"880055","Arthur",7));
        directories.add(new Directory(3,"892190","Julia",1.2));
        directories.add(new Directory(4,"890012","John",0.5));



        // метод поиска по стажу
        Directory.searchExperience(directories,1.2);

        // метод вывода номера телефона сотрудника по имени
        Directory.findNameEmployee(directories);

        // метод, который ищет сотрудника по табельному номеру
        Directory.findId(directories);
    }
}