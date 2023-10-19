package main.java.com.ojiraphers.section01.method;

public class Caculator {
    public static void main(String[] args) {


            int first = 100;
            int second = 50;
            int result;

            Caculator cal = new Caculator();

            result = Caculator.minNumberOf(first ,second) ;
            System.out.println("result is : " +  result );
            result = Caculator.maxNumberOf(first ,second) ;
            System.out.println("result is : " +  result );

        }


        public static int minNumberOf(int first, int second) {
            return (first>second)? second : first ;
        }

        public static int maxNumberOf(int first, int second){
            return (first > second)? first : second ;
        }



    }

