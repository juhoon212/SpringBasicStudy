package hello.coreex.discount;

import hello.coreex.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
