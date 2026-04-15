package com.projectmoonfan;

import java.util.Arrays;

public class app
{
    public static void main(String[] args)
    {
        int[] scores = {65, 78, 92, 55, 40, 86, 74, 88, 86, 96};
        Arrays.sort(scores);
        int total = 0;
        for (int score = 0; score < scores.length; score = score + 1)
        {
            total += scores[score];
        }
        double average = (double) total / scores.length;
        int highest = scores.length - 1;
        System.out.printf("The average score of the class is %.1f%%.", average);
        System.out.println();
        System.out.printf("The lowest score of the class is %.1f%%.", (float) scores[0]); //Index 0 is lowest value
        System.out.println();
        System.out.printf("The highest score of the class is %.1f%%.", (float) scores[highest]);

    }

}
