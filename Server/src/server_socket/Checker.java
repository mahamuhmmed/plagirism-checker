
package server_socket;

/**
 *
 * @author Start
 */
public class Checker {
    public static float CHECK(String original, String check){
        String [] arrOriginal = original.split("\\.");
        String [] arrCheck = check.split("\\.");
        
        float count = 0;
        for(int i = 0; i < arrCheck.length; i ++){
            for (int j = 0; j < arrOriginal.length; j++){
                
                //System.out.println(arrCheck[i].trim());
                //System.out.println(arrOriginal[j].trim());
                
                if (arrCheck[i].trim().equalsIgnoreCase(arrOriginal[j].trim())){
                    count ++;
                }        
            }
        }
        //System.out.println(count);
        //System.out.println((count/arrCheck.length) * 100);
        return  (count/arrCheck.length) * 100;
    }
}
