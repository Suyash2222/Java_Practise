public class ArrayToString {
    public static void main(String[] args) {
        String [] array = new String[]{
                "Welcome"," to "," my "," program "," of "," concatenating ",
                " array "," of "," string "," by "," string "," Builder "
        };

        StringBuilder sb = new StringBuilder();
        for (String ele: array){
            sb.append(ele);
        }
        System.out.println("By using String Builder concatenation");
        System.out.println(sb);
    }
}
