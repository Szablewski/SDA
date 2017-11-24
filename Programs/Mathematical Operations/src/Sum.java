public class Sum {

    public static void main(String[] args) {

        int[] tablica = new int[]{1 ,2 ,3 ,4 ,5, 6, 7, 8, 9, 10};
        int wynik = 0;

        for(int element: tablica){
            wynik+=element;
            System.out.println(element);
        }
        System.out.println("Suma liczb: " + wynik);
    }
}
