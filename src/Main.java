public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", 1988, "Минск","бренд-менеджер");
        Human anna = new Human("Аня", 1995, "Москва","методист образовательных программ");
        Human katy = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "дтректором по развитию бизнса");

        System.out.println(maksim.toString());
        System.out.println(anna.toString());
        System.out.println(katy.toString());
        System.out.println(artem.toString());

    }

}