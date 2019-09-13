public class warmup2{
    public static void main(String[]arg){
        double[]scores = new double[3];
        double[]grades = {98.2,22.9,30,0};
        for (int i=0;i<3; i++){
            scores[i]=grades[i];
            System.out.println(scores[i]);
        }
    }
}