public class Main {
    public static void main(String[] args) {
        int tummy_size = 45;
        int laps = 21;
        int myAge = 25;
        int votingAge = 18;
        //This test was to know what it felt like being +24
        System.out.println(Math.max(tummy_size,laps));
        System.out.println(10 == 15);
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}