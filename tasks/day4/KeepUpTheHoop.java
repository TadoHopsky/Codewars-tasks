package tasks.dey4;

/*
        Alex just got a new hula hoop, he loves it but feels discouraged because his little brother is better than him.

        Write a program where Alex can input (n) how many times the hoop goes round and it will return him an encouraging message:

        If Alex gets 10 or more hoops, return the string --> "Great, now move on to tricks".
        If he doesn't get 10 hoops, return the string --> "Keep at it until you get it".

        Алекс только что получил новый хула-хуп, ему это нравится, но он чувствует себя обескураженным, потому что его младший брат лучше его.
        Напишите программу, в которой Алекс может ввести (n) сколько раз обруч обруча, и это вернет ему ободряющее сообщение:

 */

public class KeepUpTheHoop {
    public static void main(String[] args) {
        System.out.println(hoopCount(10
        ));
    }

    public static String hoopCount(int n) {

        return (n >= 10) ? "Great, now move on to tricks" :
                "Keep at it until you get it";
    }
}

