# 구현할 기능 요구사항

## 페어 컨벤션

- 모든 불변 변수에 final 키워드 추가

## 1단계 예약시 결제 단계 추가

- [x] 결제 요청 전 주문 아이디, 주문 가격 임시 저장
- [ ] 결제 승인
    - [ ] 임시 저장한 주문 아이디 & 주문 가격 비교
        - [ ] 일치하지 않을 경우 예외 응답
    - [ ] toss에 승인 요청
        - [ ] 일치하지 않을 경우 예외 응답
    - [ ] 결제 이력 저장
    - [ ] 최종 응답
