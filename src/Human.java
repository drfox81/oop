public class Human {
    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    public Human(String name, int yearOfBirth, String town, String jobTitle) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " + yearOfBirth + "году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

}
