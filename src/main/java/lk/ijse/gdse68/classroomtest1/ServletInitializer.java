package lk.ijse.gdse68.classroomtest1;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Prabodha Thathsarani
 * @date 9/4/24
 * @project Classroom-Test
 **/

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ClassroomTest1Application.class);
    }

}
