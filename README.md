# 숫자 야구 게임

### 요구사항 분석

1. 서로 다른 수로 이루어진 3자리 수를 맞추는 게임입니다.

2. 상대방(컴퓨터)은 1~9까지 서로 다른 임의의 수 3개를 선택합니다.

3. 게임 플레이어는 상대방(컴퓨터)이 생각하는 3가지의 숫자를 입력합니다.

   1. 사용자가 3자리 혹은 잘못된 값을 입력할 경우 IllegalArgumentException발생하여 게임이 종료 됩니다.

4. 게임플레이어와 상대방(컴퓨터)의 수를 비교합니다.

   1. 같은수가 같은자리에 있는 경우 : 스트라이크
   2. 같은수는 존재하지만 다른 자리에 있는 경우 : 볼
   3. 같은 수가 전혀 없는 경우 : 낫싱

   ```
   ex) 상대방(425) , 플레이어 입력 수(456) 인경우 -> 1볼 1스트라이크
   ```

5. 플레이어가 상대방(컴퓨터)의 수를 완벽하게 맞히게 되면 게임은 종료가 됩니다.

   1.  게임 종료 후에는 다시 반복시작을 하거나 , 완전하게 종료 되어야 합니다.



### 구현할 기능 목록

#### 볼(BALL)

- 해당 객체는 내부적 으로 ballNumber 숫자 리스트를 가지고 있습니다.
- ballNumber는 숫자로 이루어진 리스트 입니다.

#### 상대방(Opponent)

- 외부로 부터 받은 1~9 숫자 리스트를 가지고 Ball객체를 생성합니다.

#### 플레이어(User)

- 입력 받은 String으로 Ball 객체를 생성합니다.

#### 심판

- 상대방(컴퓨터) 및 플레이어의 난수를 비교하여 볼 , 스트라이크 , 낫싱에 대한 결과 판단
  - 숫자일치 , 자리 불일치  : 볼
  - 숫자일치 , 자리 일치 : 스트라이크
  - 일치하는게 없는 경우 : 낫싱

