public class myClass {


    void main() {

        // opgave 1

        double itemOne = 25.50;
        double itemTwo = 15.00;
        double itemThree = 30.00;
        double subTotal = itemOne + itemTwo + itemThree;
        double taxes = 25.0;
        double withTaxes = subTotal + (subTotal * taxes / 100.0);

        System.out.println(subTotal);
        System.out.println(withTaxes);

        // opgave 2
        double food = 450.0;
        double drinks = 120.0;
        double tip = 50;
        int persons = 4;
        double totalBill = food + drinks + tip;
        double pricePerPerson = totalBill / 4;

        System.out.println(pricePerPerson);

        // opgave 3


    }


}