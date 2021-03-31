package study.querydsl.dto;

import lombok.Data;

@Data
public class MemberSearchCondition {
    //회원명, 팀명, 나이(ageGoe, ageLoe)

    private String username;
    private String teamName;
    private Integer ageGoe; //Integer를 사용하는 이유는 값이 null일 수 있으니까
    private Integer ageLoe;

}
