public class Horse extends DomJivotnye{
    public Horse(int weigth, int age, String gender, String nickName) {
        super(weigth, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weigth=" + getWeigth() +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", nickName='" + getNickName() + '\'' +
                '}';
    }
}
