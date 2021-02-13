public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1099, 2019);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000,799,2018 );
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1200,499, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkYearAndPrice();

        Notebook goodNotebook = new Notebook(1000, 1000, 2017);
        System.out.println(goodNotebook.weight + " " + goodNotebook.price);
        goodNotebook.checkYearAndPrice();
    }
}
