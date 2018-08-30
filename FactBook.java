package e.saloni.funfacts;

import java.util.Random;

public class FactBook {
    // Fields (Member Variables) = Properties about the object
    private String[] mFacts = {
            "Ants stretch when they wake up.",
            "Ostriches run faster than horses.",
            "Hot water wil turn into ice faster than cold water.",
            "Mona lisa has no eyebrows.",
            "The strongest musle in the body is the tongue.",
            "When the moon is directly overhead, you will weigh slightly less.",
            "coca cola was originally green.",
            "Olympic gold medals are actually made of silver.",
            "You are born with 300 bones, by the time you are an adult you have 206 bones.",
            "Most lipsticks contain fish scales."};

    // Methods = Actions the object can take
    public String getFacts(){

        String fact = "";
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomnumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomnumber];

        return fact;
    }
}
