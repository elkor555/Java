public class Adress {
    String ulica;
    int nrDomu;
    int nrMieszkania;
    String kodPocztowy;
    String miejscowość;
    void infoAdress (){
        System.out.println( "\n ADRES ZAMIESZKANIA: \n"+
            "ul. " + ulica + nrDomu +"/" +nrMieszkania+"\n"
            + miejscowość);


    }

}
