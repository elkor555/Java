public class ComputerStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.memory=71256;
        comp1.processor= "intel 2";
        Computer comp2 = new Computer();
        comp2.memory=7256;
        comp2.processor= "Douron 3";
        Computer comp3 = new Computer();
        comp3.memory=2256;
        comp3.processor= "Athlon 2";

        comp1.printInfo();
        comp2.printInfo();
        comp3.printInfo();

    }
}
