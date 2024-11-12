package Q1;
import java.text.SimpleDateFormat;
import java.util.Date;
public class LazySingletonAssignment3 {
    private static LazySingletonAssignment3 instance1; //Initialising first instance field of this class
    private static LazySingletonAssignment3 instance2; //Initialising second instance field of this class
    private static LazySingletonAssignment3 instance3; //Initialising third instance field of this class
    private int id; // field for storing the id from the user and matching with the corresponding instance of this class.
    private LazySingletonAssignment3(int id){
        this.id = id;
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
        String formattedDate = dateFormat.format(new Date());
        System.out.println("Instance created at:" +
                formattedDate);
    }
    public static LazySingletonAssignment3 getInstance(int id){
        if (id == 1){
            if(instance1 == null){ // Checking if first instance was already created or not. We only proceed to create first instance when it is null in the first place.
                instance1 = new LazySingletonAssignment3(id); // Actual first instance creation happens here.
            }
            return instance1;
        } else if (id == 2) {
            if(instance2 == null){ // Checking if second instance was already created or not. We only proceed to create second instance when it is null in the first place.
                instance2 = new LazySingletonAssignment3(id); // Actual second instance creation happens here.
            }
            return instance2;
        } else if (id == 3) {
            if (instance3 == null){ // Checking if third instance was already created or not. We only proceed to create third instance when it is null in the first place.
                instance3 = new LazySingletonAssignment3(id); // Actual third instance creation happens here.
            }
            return instance3;
        } else {
            System.out.println("Only three instances can be created not more than that.");
            return null;
        }
    }
}