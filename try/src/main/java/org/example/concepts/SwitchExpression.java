package org.example.concepts;

public class SwitchExpression {

    // new switch expression - way 2
    public static void newSwitchExpression1(){
        String genre = "Slice of Life";
        String anime;

        anime = switch(genre){
            case "Slice of Life" -> "Your lie in april";
            case "Isekai" -> "Mushok Tensei";
            case "dark" -> "Re Zero";
            case "Shounen" -> "One Piece";
            default -> "Dragon Ball Z";

        };

        System.out.println("Your fav anime in " +genre+ " genre is " +anime);
    }

    // new switch expression - way 1
    public static void newSwitchExpression(){
        String genre = "Slice of Life";
        String anime;

        anime = switch(genre){
            case "Slice of Life" : yield "Your lie in april";
            case "Isekai" : yield "Mushok Tensei";
            case "dark": yield "Re Zero";
            case "Shounen": yield "One Piece";
            default: yield "Dragon Ball Z";

        };

        System.out.println("Your fav anime in " +genre+ " genre is " +anime);
    }

    //old switch statement
    public static void main(String[] args) {
        String genre = "Slice of Life";
        String anime;

        switch (genre){
            case "Slice of Life" :
                anime = "Your Lie in april";
                break;
            case "Isekai":
                anime = "Mushok Tensei";
                break;
            case "dark":
                anime = "Re Zero";
                break;
            case "Shounen":
                anime = "One Piece";
                break;
            default:
                anime = "Dragon Ball Z";
        }

        System.out.println("Your fav anime in " +genre+ " genre is " +anime);
        newSwitchExpression();
        newSwitchExpression1();
    }
}

