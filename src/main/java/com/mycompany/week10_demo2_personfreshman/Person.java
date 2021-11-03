/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week10_demo2_personfreshman;

/**
 *
 * @author soblab
 */
public class Person implements Comparable{
    
    int age;
    String name;

    public Person() {
        System.out.println("Person");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
       return "Any Address";
    }
    
    
    
}
