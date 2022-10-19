public class Sheep extends DomJivotnye{
    public Sheep(int weigth, int age, String gender, String nickName) {
        super(weigth, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weigth=" + getWeigth() +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", nickName='" + getNickName() + '\'' +
                '}';
    }
}
