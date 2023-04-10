package hello.coreex.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class StatefulServiceTest {

    @Test
    void statefulServiceTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        // A사용자
        int userA = statefulService1.order("userA", 10000);
        // B사용자
        int userB = statefulService2.order("userA", 20000);

        // A가 주문금액 조회
//        int price = statefulService1.getPrice();
        System.out.println("price = " + userA);


        // 공유되는 필드라 B사용자가(멀티스레드) 가 값을 변경해버릴수 있음
//        Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);


    }

    static class TestConfig{
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}
