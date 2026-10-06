3주차 강의에서는 DDD의 4계층 구조를 이해하고 DIP에 관해 배웠습니다.
DDD 4계층 구조는 Presentation 계층, Application 계층, Domain 계층, infrastructure 계층으로 나뉩니다.
DIP는 기존에 서비스가 JPA에 직접 의존하는 방식으로 구성하였지만,
DIP에서는 그 연결을 끊고 Adapter를 만들어서 외부와 내부를 격리하였습니다.
Hivernate는 JPA라는 인터페이스를 구현한 ORM 프레임워크이며 자주 사용하는 기능을 Hibernate가 sql로 변환하여 DB에 반영해 주는 것이다.
오늘 배운 내용을 통해 우리가 만든 repository, service, domain이 외부의 기술에 의존하지 않도록 하는 방법을 배웠습니다.
