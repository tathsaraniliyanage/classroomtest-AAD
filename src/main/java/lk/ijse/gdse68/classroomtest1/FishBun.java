package lk.ijse.gdse68.classroomtest1;

import org.springframework.stereotype.Component;

/**
 * @author Prabodha Thathsarani
 * @date 9/4/24
 * @project Classroom-Test
 **/

@Component
public class FishBun implements Food{
    @Override
    public void eat() {
        System.out.println("Fish Bun");
    }
}
