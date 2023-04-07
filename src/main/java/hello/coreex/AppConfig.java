package hello.coreex;

import hello.coreex.Order.OrderService;
import hello.coreex.Order.OrderServiceImpl;
import hello.coreex.discount.DiscountPolicy;
import hello.coreex.discount.FixDiscountPolicy;
import hello.coreex.discount.RateDiscountPolicy;
import hello.coreex.member.MemberRepository;
import hello.coreex.member.MemberService;
import hello.coreex.member.MemberServiceImpl;
import hello.coreex.member.MemoryMemberRepository;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
