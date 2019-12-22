public class Person {
    Adress meldunek;
    Adress mieszka;
    String firstName;
    String lastName;
    String pesel;
    Credit kredyty;
    void getInfo(){
        System.out.println( firstName+" "+lastName+" "+ pesel +" "+mieszka.infoAdress() +
                " "+meldunek.infoAdress());
    }

}
