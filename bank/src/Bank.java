public class Bank {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "76543234567";

        Person person2 = new Person();
        person2.firstName = "Adam";
        person2.lastName = "Romski";
        person2.pesel = "12121222334221";


        Adress adress1 = new Adress();
        adress1.ulica ="Błotna";
        adress1.nrDomu= 15;
        adress1.nrMieszkania=222;
        adress1.kodPocztowy = "81-601";
        adress1.miejscowość = "toronto";
        person1.meldunek = adress1;
        person1.mieszka = adress1;

        Adress adress2 = new Adress();
        adress2.ulica ="Main street";
        adress2.nrDomu= 215;
        adress2.nrMieszkania=12;
        adress2.kodPocztowy = "811";
        adress2.miejscowość = "Las Vegas";

        Adress adress3 = new Adress();
        adress3.ulica ="Sobieski";
        adress3.nrDomu= 277;
        adress3.nrMieszkania=2;
        adress3.kodPocztowy = "888-11";
        adress3.miejscowość = "toregas";
        person2.mieszka = adress3;
        person2.meldunek = adress1;


        BankAccount account1 =new BankAccount();
        account1.owner = person1;
        account1.balance =10_000;

        Credit credit1 = new Credit();
        credit1.Borrower = person2;
        credit1.cashBorrowed =234400;
        credit1.cashReturned =1;
        credit1.interestRate =2;
        credit1.termMonth =36;

        BankAccount account2 =new BankAccount();
        account2.owner = person2;
        account2.balance =20_000;

        Credit credit2 = new Credit();
        credit2.Borrower = person1;
        credit2.cashBorrowed =5000;
        credit2.cashReturned =1000;
        credit2.interestRate =12;
        credit2.termMonth =360;


        System.out.println("Osoba: ");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("mieszka w : " + person1.mieszka.miejscowość);
        System.out.println("Posiada konto bankowe ze stanem : " + account1.balance + " zł.");
        System.out.println("---------------------");
        System.out.println("zaciagniety kredyt wysokości : " + credit1.cashBorrowed + " zł");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.println("Osoba: ");
        System.out.println(person2.firstName + " " + person2.lastName + " " + person2.pesel);
        System.out.println("mieszka w : " + person2.mieszka.miejscowość);
        System.out.println("Posiada konto bankowe ze stanem : " + account2.balance + " zł.");
        System.out.println("---------------------");
        System.out.println("zaciagniety kredyt wysokości : " + credit2.cashBorrowed + " zł");



        System.out.println(person1.getInfo());

    }
}
