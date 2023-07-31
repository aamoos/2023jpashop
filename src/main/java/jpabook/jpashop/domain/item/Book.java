package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName    : jpabook.jpashop.domain
 * fileName       : Book
 * author         : 김재성
 * date           : 2023-07-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-31        김재성       최초 생성
 */

@Entity
@DiscriminatorValue("B")
@Getter
@Setter
public class Book extends Item {

    private String author;
    private String isbn;
}
