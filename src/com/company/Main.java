package com.company;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here


        HashCode h=new HashCode();
        System.out.println(h.hashCode());

        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Собака");
        treeSet.add("Волк");
        treeSet.add("Филин");
        treeSet.add("Лисица");
        treeSet.add("Попугай");
        treeSet.add("Белка");
        treeSet.add("Коза");
        System.out.println(treeSet);
        HashSet <String>hashSet=new HashSet<>();
        hashSet.add("Собака");
        hashSet.add("Волк");
        hashSet.add("Филин");
        hashSet.add("Лисица");
        hashSet.add("Попугай");
        hashSet.add("Белка");
        hashSet.add("Коза");
        System.out.println(hashSet);

    }
}
