public class Book {
    String tytul;
    String autor;
    int prodData;
    String publisher;
    int liczStron;
    long nrIsbn;
    Book(String booktytul, String bookautor, int bookProdData, String bookpublisher, int bookLiczStron,
         long bookNrIsbn){
        tytul = booktytul;
        autor = bookautor;
        prodData = bookProdData;
        publisher = bookpublisher;
        nrIsbn = bookNrIsbn;
        void printInfo(){
            String info= tytul + ";" + autor + ";" + prodData + ";" + publisher +
                    ";" + liczStron +";" + nrIsbn;
            System.out.println(info);
            //test2

        }

    }
}
