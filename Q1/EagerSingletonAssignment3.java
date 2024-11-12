package Q1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EagerSingletonAssignment3 {
    private static final EagerSingletonAssignment3 instance1 = new EagerSingletonAssignment3(1); //Initialising and also creating first instance  of this class using its private constructor.
    private static final EagerSingletonAssignment3 instance2 = new EagerSingletonAssignment3(2); //Initialising and also creating second instance  of this class using its private constructor.
    private static final EagerSingletonAssignment3 instance3 = new EagerSingletonAssignment3(3); //Initialising and also creating third instance  of this class using its private constructor.
    private int id; // field for storing the id from the user and matching with the corresponding instance of this class.
    private EagerSingletonAssignment3(int id){
        this.id = id;
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
        String formattedDate = dateFormat.format(new Date());
        System.out.println("Instance created at:" +
                formattedDate);
    }
    public static EagerSingletonAssignment3 getInstance(int id){
        if(id == 1){
            return instance1; // returning instance1 if the argument passed is 1.
        } else if (id == 2) {
            return instance2; // returning instance2 if the argument passed is 2.
        } else if (id == 3) {
            return instance3; // returning instance3 if the argument passed is 3.
        } else {
            System.out.println("Only three instances can be created not more than that.");
            return null;
        }
    }
}
