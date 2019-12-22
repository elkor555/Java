public class Library {
    public static void main(String[] args) {
        final String appName ="biblioteka v 0.1";

        String tytul = "złosc";
        String autor = "Adam Guma";
        int prodData = 2010;
        String publisher;
        int liczStron = 260;
        long nrIsbn = 23456;
        System.out.println(appName);
        System.out.println("książki dostępne w Bibliotece");
        System.out.print("TYTUŁ : ");
        System.out.println(tytul);
        System.out.print("Autor :  ");
        System.out.println(autor);
        System.out.print("WYDANIE : ");
        System.out.println(prodData);
        System.out.print("Liczba Stron :  ");
        System.out.println(liczStron);
        System.out.print("NUMER EWIDENCYJNY : ");
        System.out.println(nrIsbn);

    }
}
