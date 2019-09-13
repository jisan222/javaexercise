import java.util.Arrays;
public class ex21{
    public static void main(String[]args){
        double[]grades={98.2,22.9,30.0};
        double[]scoers=Arrays.copyOf(grades,2);
        System.out.print(Arrays.toString(scoers));
    }
}
