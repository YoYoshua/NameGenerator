package com.company;

import java.util.List;
import java.util.Random;

public class NameGenerator
{
    //TODO: Different names based on chosen sex
    public String getRandomName(List<String> nameList, List<String> surnameList)
    {
        if (nameList.size() == 0 || surnameList.size() == 0)
        {
            return "Something is wrong!";
        }
        else
        {
            //Create random generator
            Random randomName = new Random();
            Random randomSurname = new Random();

            //Return
            try
            {
                String result = nameList.get(randomName.nextInt(nameList.size())) + " " +
                        surnameList.get(randomSurname.nextInt(surnameList.size()));
                return result;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                e.printStackTrace();
                return "Something is wrong!";
            }
        }
    }
}
