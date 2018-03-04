package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        File maleNameFile = new File("malenamefile.txt");
        File femaleNameFile = new File("femalenamefile.txt");
        File surnameFile = new File("surnamefile.txt");

        List<String> nameList = new ArrayList<String>();
        List<String> surnameList = new ArrayList<String>();

        FileHandler handler = new FileHandler();
        NameGenerator generator = new NameGenerator();

        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a Boy, or are you a Girl?");
        char sex = scan.next().charAt(0);

        switch(sex)
        {
            case 'B':
                nameList = handler.readFile(maleNameFile);
                break;

            case 'G':
                nameList = handler.readFile(femaleNameFile);
                break;

            default:
                System.out.println("You chose wrong sex. Using male list...");
                nameList = handler.readFile(maleNameFile);
                break;
        }
        surnameList = handler.readFile(surnameFile);

        System.out.println("Your name is: " + generator.getRandomName(nameList, surnameList));

    }
}
