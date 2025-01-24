import java.util.*;

public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
// Bill on Items 
        float totalcost = pencil + pen + eraser   ;
        System.out.println(totalcost);

// Add 18% of gst on bill

        float newtotal = totalcost + (0.18f * totalcost);

        System.out.println("Bill with 18% tax : " + newtotal);


             
    }

    
}
