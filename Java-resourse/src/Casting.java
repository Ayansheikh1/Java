public class Casting {
    public static void main(String[] args){
        //Implicit Casting
        double x = 1.1;
        double y = x + 2;//double + int (automatic casting)
        System.out.println(y);


        //explicit casting
       String p = "2";
        int q = Integer.parseInt(p) + 3;//change string into integer
        System.out.println(q);
    }
}
