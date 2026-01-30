public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("My Name is ");
        sb.append("Apple");
        System.out.println(sb);

        StringBuffer SB = new StringBuffer("This is ");
        SB.append("String Buffer");
        System.out.println(SB);
    }
}
