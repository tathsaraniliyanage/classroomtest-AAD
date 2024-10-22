package lk.ijse.gdse68.classroomtest1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Prabodha Thathsarani
 * @date 9/4/24
 * @project Classroom-Test
 **/

@Component
@Primary
public class FishPastry implements Food{
    @Override
    public void eat() {
        System.out.println("Fish pastry");
    }
}
