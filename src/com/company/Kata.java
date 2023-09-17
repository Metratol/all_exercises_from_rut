package com.company;

public class Kata {
    public static String areYouPlayingBanjo(String name) {
        // Program me!
        if (name.substring(0,1).contains("r") ||(name.substring(0,1).contains("R"))) {
            return name + " plays banjo";
        }
        else return name + " does not play banjo";

    }

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Rik"));
    }
}