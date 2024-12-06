package de.Neb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class util {

    public static void printCharArray(List<Character> charList){
        for (int i = 0;i < charList.size(); i++){
            System.out.print(charList.get(i));
        }
        System.out.println();
    }

    public static char createRandomString(List<Character> RandomStringCharacter){
        Random random = new Random();
        int randomInt = random.nextInt(RandomStringCharacter.size());

        return RandomStringCharacter.get(randomInt);
    }

    public static List<Character> createCharArray(String The_String){
        List<Character> StringCharArray = new ArrayList<>();
        for (int i = 0; i < The_String.length();i++){
            StringCharArray.add(The_String.charAt(i));
        }
        return StringCharArray;
    }
}
