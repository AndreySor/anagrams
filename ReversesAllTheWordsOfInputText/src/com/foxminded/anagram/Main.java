package com.foxminded.anagram;

public class Main {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String check = anagram.reverse("a1b2c3 4d5e6f Ghi789J 10klmn12");
        System.out.println(check);
    }
}
