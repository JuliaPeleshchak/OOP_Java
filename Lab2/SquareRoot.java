public class SquareRoot {
    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        double x_1, x_2, d;

        if (b*b - 4*a*c>=0 & a!=0 ) {
            d =Math.sqrt(b*b - (4*a*c));
            x_1 = ((-b) + d)/(2*a);
            x_2 = ((-b) - d)/(2*a);
            System.out.println("x1="+ x_1);
            System.out.println("x2="+ x_2);
        }
        else if(a==0 & b==0 | b*b - 4*a*c<0 ) {
            System.out.println("x1=");
            System.out.println("x2=");
        }
        else{
            System.out.println("x1="+0.0);
            System.out.println("x2="+0.0);
        }
    }


}
