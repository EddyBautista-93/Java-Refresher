public class StrangeNotStrange {


    public static String StrangeNotStrange(int num){
        if(num % 2 != 0 || num >= 6 && num <= 20 ){
            System.out.println("Weird");
            return "Weird";
        }
        else {
            System.out.println("Not Weird");
            return "Not Weird";
        }
    }

    public static void main(String[] args) {
        StrangeNotStrange(3);
        StrangeNotStrange(23);
    }


}
