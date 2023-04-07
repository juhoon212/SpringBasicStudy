package hello.coreex;

import hello.coreex.Order.Order;
import hello.coreex.Order.OrderService;
import hello.coreex.Order.OrderServiceImpl;
import hello.coreex.member.Grade;
import hello.coreex.member.Member;
import hello.coreex.member.MemberService;
import hello.coreex.member.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);



    }
}
