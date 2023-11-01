package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Directory <T> {
    //    ArrayList<E> Employee = new ArrayList<E>();
    Integer id = 0;     // айди
    T phoneNumber; // номер телефона
    T name;    // имя

    T experience;  // стаж


    public Directory(Integer id, T phoneNumber, T name, T experience) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = (T) experience;

    }



    /**
     * метод по поиску сотрудника по стажу
     *
     * @param directories
     * @param needExperience
     * @param <T>
     */
    protected static <T> void searchExperience(ArrayList<Directory> directories, T needExperience) {
        for (Directory i : directories) {
            if (needExperience.equals(i.getExperience())) {
                System.out.println("Необходимый стаж найден! ");
            } else System.out.println("Такого стажа нет");
        }
    }

    /**
     * метод, который выводит номер телефона сотрудника по имени
     * @param directories
     * @return
     * @param <T>
     */
    protected static <T> String findNameEmployee(ArrayList<Directory> directories) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя : ");
        T name_employee = (T) in.next();
        for (Directory i : directories) {
            if (directories == null) {
                throw new RuntimeException("Список пуст! ");
            }
            if (name_employee.equals(i.getName())) {
                System.out.println("По имени " + i.getName() +
                        " найден следующий номер телефона: " + i.getPhoneNumber());
            } else return "Номер телефона не найден";

        }
        return null;
    }

    /**
     * метод, который ищет сотрудника по табельному номеру
     * @return
     */
    protected static <T> void findId(ArrayList<Directory> directories){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите id : ");
        Integer id_employee = in.nextInt();
        for (Directory i : directories) {
            if(id_employee.equals(i.getId())){
                System.out.println("По номеру " + id_employee + " найден сотрудник " + i.getName());
            }
        }
    }


    public T getExperience() {
        return experience;
    }

    public void setExperience(T experience) {
        this.experience = experience;
    }

    public T getName(){
        return name;
    }

    public T getPhoneNumber(){
        return phoneNumber;
    }


    public Integer getId() {
        return id;
    }
}
