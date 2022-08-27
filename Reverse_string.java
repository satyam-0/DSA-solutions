
public class Reverse_string {
    public static void main(String[] args) {

        StringBuilder sc = new StringBuilder(" Satyam");
        System.out.println(sc);
        for (int i = 0; i <= sc.length() / 2; i++) {
            int front = i;
            int back = sc.length() - 1 - i;
            char Frontchar = sc.charAt(front);
            char Backchar = sc.charAt(back);
            sc.setCharAt(front, Backchar);
            sc.setCharAt(back, Frontchar);
        }
        System.out.println(" String After Reverse Is ");
        System.out.println(sc);

    }
}