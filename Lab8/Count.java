package ua.lpnuai.oop.peleshchak8;


import java.util.Scanner;

public class Count  {
    private static String text;
    private static String s[];
    public static long loud_count = 0;
    public static long cons_count = 0;
    static final String loud = "aeiouy";
    Count(String text) {
        this.text = text;
    }
    public void method() {
        if ("".equals(text))
            System.out.println("You haven't write your text. Press 'A' to add a text.");
        else {

                text = text.toLowerCase();
                long len = text.length();
                for(int i = 0; i<len; i++){
                    Character a = text.charAt(i);
                    if (Character.isLetter(a)){
                        String b = a.toString();
                        if(loud.contains(b)){
                            loud_count++;
                        }
                        else{
                            cons_count++;
                        }

                    }


                }
            }
            System.out.println("Operating complete. Input 'r' to see the result.");
        }


    public long getloud_count() {
        return loud_count;
    }
    public long getcons_count () {
        return cons_count;
    }
}
