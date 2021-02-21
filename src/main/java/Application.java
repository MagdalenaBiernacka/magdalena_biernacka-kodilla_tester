public class Application {
    public static void main(String[] args) {
        Persons person = new Persons("Aam", 40.50, 178);

        if (person.name != null) {
            if (person.age > 30 && person.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}