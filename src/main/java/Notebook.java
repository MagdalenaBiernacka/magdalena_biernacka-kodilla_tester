public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light");
        } else if (this.weight >1000 && this.weight <= 1500) {
            System.out.println("This notebook is quite heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }
    public void checkYearAndPrice() {
        if (this.year >= 2019 && this.price < 1299) {
            System.out.println("This notebook is new and cheap.");
        } else if (this.year >= 2019 && this.price >= 1300) {
            System.out.println("This notebook is new but also expensive.");
        } else if (this.year < 2019 && this.price >= 1000) {
            System.out.println("You have better options. This notebook is expensive for this year.");
        } else if ((this.year < 2019 && this.year > 2015) && this.price < 999) {
            System.out.println("This notebook can be a good option. Consider it!");
        } else if (this.year < 2015 && this.price > 300) {
            System.out.println("This notebook is old and too expensive.");
        } else if (this.year < 2015 && this.price < 300) {
            System.out.println("This notebook is old but if you heave only 300 or less. Buy it.");
        } else {
            System.out.println("I have no opinion about this notebook");
        }
    }

}
