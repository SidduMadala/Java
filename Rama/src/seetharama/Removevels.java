package seetharama;

public class Removevels {

    public static void main(String[] args) {

        String sid = "Hi this is siddu madala, I am from bedsupalle m1a2d3a4l5a6";

        
        sid = sid.replaceAll("[aeiouAEIOU123456]", "");

        System.out.println(sid);
    }
}
