# 문자열 계산기

- 입력
    + 올바른 입력인지 검사
        - [예외처리] 시작과 끝은 숫자 -> 다시 요청
        - [예외처리]( 숫자 - 연산자 - 숫자 .... 순서로 ) -> 다시 요청
    + 올바른 입력이면 Queue에 삽입
    
- 계산
    + Queue 처리 과정
        + 먼저 Queue에서 3개를 뽑아서 계산
        + 다음부터는 Queue가 empty할 때까지 2개씩 뽑아서 계산 처리
    + '+'일 경우 덧셈처리
    + '-'일 경우 뺄셈처리
    + '*'일 경우 곱셈처리
    + '/'일 경우 나눗셈처리   
    + [예외처리] 0으로 나눌 때 에러 메세지 전달 후 종료
 
- 결과
    + 계산한 결과 출력

# 자동차 경주 게임
[기능 구현 목록]
- 자동차 이름을 입력받는 기능
- 입력받은 이름들로 각각의 Car객체를 생성하여 Controller에 저장하는 기능
- 시도할 횟수를 받는 기능
- 각 시도별로 결과를 출력해주는 기능
    + Random값에 따라 Car의 Position을 이동해주는 기능
    + 이동한 결과를 출력해주는 기능
- 결과 출력 기능
    + maxPosition 구하는 메소드
    + maxPosition에 있는 Car 출력

[TEST목록]
- 자동차 이름이 올바르게 입력됐는지 확인(영문자,길이 제한, 중복)
- 4이상의 값이 입력됐을 때(true일 때) position++가 됐는지 확인
- CarList생성 후 특정 Car를 move(true)하여 maxPosition이  의도한바와 맞는지 확인


# java-racingcar
자동차 경주 게임 미션 저장소

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)