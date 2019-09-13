import java.util.Arrays;
public class Exercise25{
    public static void main(String[]args){
        String [] studentList={"Kalam","Joese","jani","Ahamed"};
        for(int i=0;i<studentList.length;i++){
           if(studentList[i]=="San"){
               System.out.println("Found value is"+studentList[i]);
            }
               else{
                   System.out.println("San isn,t found" + "!!");
                
            }
        }
        
    }
}