import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DomJivotnye[] cows = {new Cow(55,2,"female","maya"),
                              new Cow(60,3,"famale","Rozi"),
                              new Cow(58,2,"female","Giza"),
                              new Cow(70,2,"male","Turun"),
                              new Cow(44,1,"male","Typin"),
                              new Cow(48,1,"male","Tors")};
        DomJivotnye[] sheep = {new Sheep(15,1,"female","Kozi"),
                               new Sheep(22,1,"female","Kaza"),
                               new Sheep(30,2,"male","Rugu"),
                               new Sheep(45,3,"male","Tor")};
        DomJivotnye[] horses = {new Horse(90,4,"female","Akkula"),
                                new Horse(100,5,"male","Tilpar"),
                                new Horse(110, 5,"female","KaraKyz")};
        Farm farm1 = new Farm("Jailoo1",
                new Cow[]{new Cow(55,2,"female","maya"),
                new Cow(60,3,"famale","Rozi"),
                new Cow(58,2,"female","Giza"),
                new Cow(70,2,"male","Turun"),
                new Cow(44,1,"male","Typin")},
                new Sheep[]{new Sheep(15,1,"female","Kozi"),
                new Sheep(22,1,"female","Kaza"),
                new Sheep(30,2,"male","Rugu")},
                new Horse[]{new Horse(90,4,"female","Akkula"),
                new Horse(100,5,"male","Tilpar")},"jack");
        Farm farm2 = new Farm("Jailoo2",new Cow[]{new Cow(48,1,"male","Tors")},
                new Sheep[]{ new Sheep(45,3,"male","Tor")},
                new Horse[]{ new Horse(110, 5,"female","KaraKyz")}, "Joe");
        System.out.println(farm1);
        System.out.println(farm2);
    }
}