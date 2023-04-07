package hello.coreex.order;

import hello.coreex.Order.Order;
import hello.coreex.Order.OrderService;
import hello.coreex.Order.OrderServiceImpl;
import hello.coreex.member.Grade;
import hello.coreex.member.Member;
import hello.coreex.member.MemberService;
import hello.coreex.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class OrderServiceTest {

    MemberService  memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        assertThat(order.getDiscountPrice()).isEqualTo(1000);
        

    }
}
