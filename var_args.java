public class var_args {

    static int add(int... arr) { // the input is taken as a array
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(" hey, Satyam we are goona to add multiple number through single funtion ");
        System.out.println(add(1, 2));
        System.out.println(add(2, 3, 4));
        System.out.println(add(4, 5, 6));
        System.out.println(add());
    }
}
