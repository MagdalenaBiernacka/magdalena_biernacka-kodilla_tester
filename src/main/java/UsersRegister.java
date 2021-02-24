public class UsersRegister {
    public static void main(String[] args) {

        User userAnia = new User("Ania", 28);
        User userTomek = new User("Tomek", 30);
        User userFrank = new User("Fran", 21);
        User userKarolina = new User("Karolina", 23);
        User userKasia = new User("Kasia", 16);
        User userJacek = new User("Jacek", 12);

        User[] users = new User[6];
        users[0] = userAnia;
        users[1] = userTomek;
        users[2] = userFrank;
        users[3] = userKarolina;
        users[4] = userKasia;
        users[5] = userJacek;

        double Average;
        int sumAge = 0;

        for (int userIndex = 0; userIndex < users.length; userIndex++) {
            sumAge = sumUp(sumAge, users[userIndex].age);
        }
        Average = sumAge / users.length;

        for (int userIndex = 0; userIndex < users.length; userIndex++) {
            if (users[userIndex].age < Average) {
                System.out.println(users[userIndex].name);
            }
        }

    }

    private static int sumUp(int a, int b) {
        int result = a + b;
        return result;
    }
}