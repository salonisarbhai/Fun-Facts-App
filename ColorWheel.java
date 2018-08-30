package e.saloni.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    // Fields (Member Variables) = Properties about the object
    private String[] mColors = {
            "#FFFFF0",//ivory
            "#FFFFE0",//light yellow
            "#FFFF00",//yellow
            "#FFFAFA",//snow
            "#FFC0CB",//pink
            "#FFFACD",//lemon_chiffon
            "#FFF8DC",//cornsil
            "#FFF5EE",//seashell
            "#FFF0F5",//lavender
            "#FFEFD5"//papaya_whip
    };

    // Methods = Actions the object can take
    public int getColor(){

        String color ;
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomnumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomnumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}

