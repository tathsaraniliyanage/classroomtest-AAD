package lk.ijse.gdse68.classroomtest1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Prabodha Thathsarani
 * @date 9/4/24
 * @project Classroom-Test
 **/

public class Demo {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyConfig.class);
        ctx.refresh();
        ctx.close();
    }
}
