package org.example;

import db.DB;
import model.entities.Department;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        System.out.println(obj);

    }
}