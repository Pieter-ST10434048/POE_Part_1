package org.example;

import java.util.Scanner;

public class Users {
    String _userName;
    String _Password;
    String _fName;
    String _lName;

    public Users(String username, String password, String name, String surname) {
        this._userName = username;
        this._Password = password;
        this._fName= name;
        this._lName = surname;
    }

    static  int Length = 10;
    static int counter = 0;
    static Users[] usersArr = new Users[Length];

    public static String promptUsername(){
        System.out.print("\nInsert Username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        return username;
    }
    public static String promptpassword(){
        System.out.print("\nInsert Password: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        return password;
    }
    static String promptName(){
        System.out.print("\nEnter your Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        return name;
    }
    static String promptSurname(){
        System.out.print("\nEnter your Surname: ");
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.nextLine();

        return surname;
    }
}
