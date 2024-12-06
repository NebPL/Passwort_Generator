package de.Neb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Passwort {

    public static List<Character> CreatePasswort(List<Character> RandomCharList, int Length){

        Random random = new Random();
        List<Character> passwort = new ArrayList<>();
        int lastInt = -1;

        for (int i = 0;i <= Length-1; i++){

            int randomInt = random.nextInt(RandomCharList.size());
            if (randomInt == lastInt){
                randomInt = random.nextInt(RandomCharList.size());
            }else {
                passwort.add(RandomCharList.get(randomInt));
            }
        }
        return passwort;
    }
}
