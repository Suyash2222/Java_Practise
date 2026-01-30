public class forEachLoop {
    public static void main(String[] args) {
        String [] NamesArray = new String[]{
                "Ram" , "Sham", "Sita", "Geeta", "Radha", "Meera"
        };

        printArrayForEach(NamesArray);

    }

    public static void printArrayForEach(String array[]){
        for (String x: array){
            System.out.println(x);
        }
    }

}
