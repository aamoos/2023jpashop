package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

/**
 * packageName    : jpabook.jpashop.domain
 * fileName       : Address
 * author         : 김재성
 * date           : 2023-07-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-31        김재성       최초 생성
 */

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
