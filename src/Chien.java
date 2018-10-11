public class Chien {

    /**
     * @author Alex
     * here we are to define a dog
     * @param height
     * @param race
     * @param weight
     * @param sex
     * @param nickname
     * @param old
     * @param color
     */

    int height = 60; // 60 kg
    String race = "Labrador"; // race of dog
    int weight = 32; // weight of dog
    String sexe = "mâle"; //
    String nickname = "Black"; // dog's nickname
    int old = 11; // dog's old
    String color = "sable"; // dog's color

    // he's agressif dog
    void bark(){
        System.out.println("Warning ! "+nickname+" barks very height hardly he heards you ! Avoid poor madman !!!!!");
    }
    //he's kind ^^
    void introduce_oneself(){
        System.out.println("His name is "+nickname+" it has a length "+height+" cm and weighs approximatively "+weight+" kg, his color is "+color+" and he has "+old+" old");
    }

    // go to sleep
    void sleep(){
        int hour = 23;
        System.out.println("Come on "+nickname+" it's time to sleep, it's "+hour+" o'clock");
    }

    //go to do exercices
    void run(){
        System.out.println("go "+nickname+" run you're the best dog !!!!");
    }
}
