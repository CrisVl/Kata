package likes;

import java.util.ArrayList;
import java.util.List;

public class AndLikes {
    public static void main(String[] args) {
        String message = whoLikesIt("Alex", "Jacob", "Mark", "Max");
        System.out.println(message);
    }


    public static String whoLikesIt(String... names) {
        String message = "";
        if (names.length == 0) {
            message = "no one likes this";
        }
        if (names.length > 0){
            message = String.join( " and ", names) + " like this";
        }
        return message;
    }

    public static String whoLikesItTheLongway(String... names) {
        String message = "";
        if (names.length == 0) {
            message = "no one likes this";
        }
        for (String i : names) {
            message += i + " and ";
        }

        return message.substring(0, message.length()-4) + "like this";
    }

}
