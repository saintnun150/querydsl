package study.querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication
public class QuerydslApplication {
	//제일 맨위 2020-06-18 15:27:30.543  INFO 35040 --- [           main] study.querydsl.QuerydslApplication       : The following profiles are active: local -> 로컬모드로 도는구나(application.yml)
	public static void main(String[] args) {
		SpringApplication.run(QuerydslApplication.class, args);
	}

	/*@Bean
	JPAQueryFactory jpaQueryFactory(EntityManager entityManager) {
		return new JPAQueryFactory(entityManager);
	}*/


}
