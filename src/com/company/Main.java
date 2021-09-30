package com.company;

public class Main
{
    public static void main(String[] args)
    {
        for (int k = 0; k < 11; k++)
        {
            double a = k * (Math.PI / 5), aSin = Math.cos (a), aCos = Math.sin (a);
            System.out.println(a + ", " + aSin + ", " + aCos);
        }
    }
}
