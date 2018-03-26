package com.tasks6.rle_decoder;

public class Decoder {
    public  static void decode1 (String[] args) {
        String old = args[0];
        StringBuilder decoded = new StringBuilder( "");
        if ((old != "") && ((old.charAt(0) < '0') || (old.charAt(0) > '9'))) {
            for (int i = 0; i < old.length(); i++) {



                if (i < old.length() - 1) {
                    if (old.charAt(i + 1) == old.charAt(i)) {
                        System.out.println("");
                        return;
                    }
                }

                if (((old.charAt(i) >= '1') && (old.charAt(i) <= '9'))) {

                    if (i < old.length() - 1) {
                        if ((old.charAt(i + 1) >= '0') && (old.charAt(i + 1) <= '9')) {
                            System.out.println("");
                            return;
                        }
                    }

                    for (int j = 0; j < Character.getNumericValue(old.charAt(i)) - 1; j++) {
                        decoded.append(old.charAt(i - 1));
                    }

                }
                if ((old.charAt(i) < '0') || (old.charAt(i) > '9'))
                    decoded.append(old.charAt(i));
            }
        }
        System.out.println(decoded);
    }
    public static void main (String args[]){
        String [] example = {"Hh9h4e4l2o5"};
        decode1(example);
    }
}
