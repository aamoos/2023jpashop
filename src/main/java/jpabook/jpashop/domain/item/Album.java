package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName    : jpabook.jpashop.domain
 * fileName       : Album
 * author         : 김재성
 * date           : 2023-07-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-31        김재성       최초 생성
 */

@Entity
@DiscriminatorValue("A")
@Getter
@Setter
public class Album extends Item {
    private String artist;
    private String etc;
}
