public class Library {
    public static void main(String[] args) {
        final String appName ="biblioteka v 0.2";
        Book book1= new Book("potop","H. Sienkiewicz",2009,"kurier",333,1234567);
        Book book2= new Book("kamasutra","Jakis Asior",1945,"sekstozdrowie",12_000,3543);
        Book book3= new Book("Bardzo Nudna","romek Małośmieszny",2000,"PWN",355,24536);


        System.out.println(appName);
     //   System.out.println("książki dostępne w Bibliotece")// System.out.print("TYTUŁ : ");
        System.out.println(book1.tytul);
        System.out.print("Autor :  ");
        System.out.println(book1.autor);
        System.out.print("WYDANIE : ");
        System.out.println(book1.prodData);
        System.out.print("Liczba Stron :  ");
        System.out.println(book1.liczStron);
        System.out.print("NUMER EWIDENCYJNY : ");
        System.out.println(book1.nrIsbn);

    }
}
