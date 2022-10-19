import java.util.Arrays;

public class Farm {
    private String adress;
    private DomJivotnye[] cows;
    private DomJivotnye[] sheep;
    private DomJivotnye[] horse;
    private String ownerName;

    public Farm(String adress, DomJivotnye[] cows, DomJivotnye[] sheep, DomJivotnye[] horse, String ownerName) {
        this.adress = adress;
        this.cows = cows;
        this.sheep = sheep;
        this.horse = horse;
        this.ownerName = ownerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public DomJivotnye[] getCows() {
        return cows;
    }

    public void setCows(DomJivotnye[] cows) {
        this.cows = cows;
    }

    public DomJivotnye[] getSheep() {
        return sheep;
    }

    public void setSheep(DomJivotnye[] sheep) {
        this.sheep = sheep;
    }

    public DomJivotnye[] getHorse() {
        return horse;
    }

    public void setHorse(DomJivotnye[] horse) {
        this.horse = horse;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "adress='" + adress + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", sheep=" + Arrays.toString(sheep) +
                ", horse=" + Arrays.toString(horse) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
