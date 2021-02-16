public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1099, 2019);
        Notebook heavyNotebook = new Notebook(2000,799,2018 );
        Notebook oldNotebook = new Notebook(1200,499, 2010);
        Notebook goodNotebook = new Notebook(1000, 1000, 2017);

        dsiplayNotebookParameters(notebook);
        dsiplayNotebookParameters(heavyNotebook);
        dsiplayNotebookParameters(oldNotebook);
        dsiplayNotebookParameters(goodNotebook);
    }

    private static void dsiplayNotebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkYearAndPrice();
    }
}
