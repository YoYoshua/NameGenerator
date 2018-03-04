package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        File nameFile = new File("namefile.txt");
        File surnameFile = new File("surnamefile.txt");

        List<String> nameList = new ArrayList<String>();
        List<String> surnameList = new ArrayList<String>();

        FileHandler handler = new FileHandler();
        NameGenerator generator = new NameGenerator();

        nameList = handler.readFile(nameFile);
        surnameList = handler.readFile(surnameFile);

        System.out.println(generator.getRandomName(nameList, surnameList));

    }
}
