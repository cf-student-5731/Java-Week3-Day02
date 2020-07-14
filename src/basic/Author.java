package basic;

public class Author {
    private String name;
    private String eMail;
    private char gender;
    private String Instagram;

    public Author(String name, String eMail, char gender, String instagram) {
        this.name = name;
        this.eMail = eMail;
        this.gender = gender;
        Instagram = instagram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInstagram() {
        return Instagram;
    }

    public void setInstagram(String instagram) {
        Instagram = instagram;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", eMail='" + eMail + '\'' +
                ", gender=" + gender +
                ", Instagram='" + Instagram + '\'' +
                '}';
    }
}
