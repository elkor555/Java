public class Company {
    public static void main(String[] args) {
        Employee Prac1 = new Employee();
        Prac1.Imie="Adam";
        Prac1.Nazwisko= "Jones";
        Prac1.Wyksztalcenie= "wyższe";
        Prac1.Stanowisko=" kibel";
        Prac1.Dzial= "Toalety";
        Prac1.Wpadki = true;
        Prac1.Zarobki = 8000;
        Employee Prac2 = new Employee();
        Prac2.Imie="Ela";
        Prac2.Nazwisko= "hinc";
        Prac2.Wyksztalcenie= "średnie";
        Prac2.Stanowisko="Sekretarka";
        Prac2.Dzial= "Biuro";
        Prac2.Wpadki = false;
        Prac2.Zarobki = 4000;
        Employee Prac3 = new Employee();
        Prac3.Imie="Igor";
        Prac3.Nazwisko= "Jamesin";
        Prac3.Wyksztalcenie= "wyższe";
        Prac3.Stanowisko=" Director";
        Prac3.Dzial= "Biuro";
        Prac3.Wpadki = true;
        Prac3.Zarobki = 13000;
        System.out.println("Imie i Nazwisko: " + Prac1.Imie + " "+ Prac1.Nazwisko);
        System.out.println("wykształcenie : " + Prac1.Wyksztalcenie);
        System.out.println("Zatrudniony: " + Prac1.Dzial+ " "+ Prac1.Stanowisko + " ");
        System.out.println( "Zarobki : "+ Prac1.Zarobki);
        System.out.println("Wpadki : "+ Prac1.Wpadki);
        System.out.println("-------------------");
        System.out.println("Imie i nazwisko " + Prac2.Imie + " "+ Prac2.Nazwisko);
        System.out.println("wykształcenie : " + Prac2.Wyksztalcenie);
        System.out.println("Zatrudniony: " + Prac2.Dzial+ " "+ Prac2.Stanowisko + " ");
        System.out.println( "Zarobki : "+ Prac2.Zarobki);
        System.out.println("Wpadki : "+ Prac2.Wpadki);
        System.out.println("-------------------");
        System.out.println("Imie i nazwisko " + Prac3.Imie + " "+ Prac3.Nazwisko);
        System.out.println("wykształcenie :   " + Prac3.Wyksztalcenie);
        System.out.println("Zatrudniony: " + Prac3.Dzial+ " "+ Prac3.Stanowisko + " ");
        System.out.println( "Zarobki : "+ Prac3.Zarobki);
        System.out.println("Wpadki : "+ Prac3.Wpadki);
    }
}
