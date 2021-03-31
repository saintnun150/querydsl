package study.querydsl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Q파일은 git에 올리면 안됨

@Entity
@Getter @Setter
public class Hello {

    @Id
    @GeneratedValue
    private Long id;
}
