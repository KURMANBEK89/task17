public class Cow extends DomJivotnye{

    public Cow(int weigth, int age, String gender, String nickName) {
        super(weigth, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Cow{" +
                "weigth=" + getWeigth() +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", nickName='" + getNickName() + '\'' +
                '}';
    }
}
