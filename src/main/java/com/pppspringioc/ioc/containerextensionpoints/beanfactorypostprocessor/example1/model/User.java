package com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example1.model;

import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor // 디폴트 컨스트럭터 만드는 어노테이션
@AllArgsConstructor
@ToString
public class User {
    // 필드
    private int id;
    private String name;
    private String email;
    private Integer age;
    private String gender;
    private String address;
    private String job;
    private boolean isAdmin;
    
    // 빌더 패턴을 안쓰면 일일히 이렇게 생성자를 작성할때 써야한다
//    User user = new User(1,
//    		"john",
//    		"hello@gamil.com",
//    		20,
//    		"male",
//    		"korea",
//    		"doctor",
//    		false);

    // private 생성자
//    private User(Builder builder) {
//        this.id = builder.id;
//        this.name = builder.name;
//        this.email = builder.email;
//        this.age = builder.age;
//        this.isAdmin = builder.isAdmin;
//    }

    // 정적 내부 Builder 클래스
//    public static class Builder {
//        private int id;
//        private String name;
//        private String email;
//        private Integer age;
//        private boolean isAdmin;
//
//        public Builder setId(int i) {
//            this.id = i;
//            return this;
//        }
//
//        public Builder setName(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public Builder setEmail(String email) {
//            this.email = email;
//            return this;
//        }
//
//        public Builder setAge(Integer age) {
//            this.age = age;
//            return this;
//        }
//
//        public Builder setIsAdmin(boolean isAdmin) {
//            this.isAdmin = isAdmin;
//            return this;
//        }
//
//        public User build() {
//            return new User(this);
//        }
//    }

    // Getter 메서드들
//    public int getId() { return id; }
//    public String getName() { return name; }
//    public String getEmail() { return email; }
//    public Integer getAge() { return age; }
//    public boolean isAdmin() { return isAdmin; }

//    @Override
//    public String toString() {
//        return "User{" +
//            "id=" + id +
//            ", name='" + name + '\'' +
//            ", email='" + email + '\'' +
//            ", age=" + age +
//            ", isAdmin=" + isAdmin +
//            '}';
//    }
}