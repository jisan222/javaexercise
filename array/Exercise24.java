public class Exercise24{
    public static void main(String[]args){
        double[] tempForecast={26.0,24.5,22.3};
        double[] tempForecastCopy=new double[3];
        for(int i=0;i<tempForecast.length;i++){
            tempForecastCopy[i] = tempForecast[i];
            System.out.println(tempForecastCopy[i]);
        }
    }
}

