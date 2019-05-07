import java.util.*;

public class Tes { 

    public static void main(String[] args) { 
        List<Double> fullList = new ArrayList<Double>(Arrays.asList(3., 2., 0., 1., 2.)); 
         
        List<Double> subList = fullList.subList(0, 3); 
        
        //Below Line will throw Concurrent Modification Exception in java 8 but works fine in java 7
        Collections.sort(fullList);
        
        //Solution for Concurrent Modification Exception in java 8 for sorting
		    //fullList = fullList.stream().sorted().collect(Collectors.toList());
         
        System.out.println(subList.get(0)); 

    } 
}
