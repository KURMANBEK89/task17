public abstract class DomJivotnye {
    private int weigth;
    private int age;
    private String gender;
    private String nickName;

    public DomJivotnye(int weigth, int age, String gender, String nickName) {
        this.weigth = weigth;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "DomJivitnye{" +
                "weigth=" + weigth +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
