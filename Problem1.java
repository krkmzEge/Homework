//author EgeKorkmaz
public class Problem1 {

    public static int main(int a, int b, int c) {
        if ((a < b && b < c) || (c < b && b < a))
            return b;

        else if ((b < a && a < c) || (c < a && a < b))
            return a;

        else
            return c;
    }

    public static void main(String[] args){
        int a = 45, b = 32, c = 89;
        System.out.println( main(a, b, c) );
    }
}