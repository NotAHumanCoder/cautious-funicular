package com.usal;

public class Main {
    public static void main(String[] args) {
        Gson gson=new Gson;
        Person p=new Person("Álvaro", "Lozano");
        String personJSON=gson.toJson(p);
        System.out.println(personJSON);
    }
}