# Studying with 'Head First Object-Oriented Analysis & Design'

## 좋은 디자인 = 유연한 소프트웨어
### 인터페이스
- 구현보다는 <u>인터페이스</u>에 의존하도록 코딩하는 것이 소프트웨어를 <u>확장이 용이</u>하게 한다.
- 인터페이스에 의존하도록 코딩하면, 코드는 인터페이스의 서브 클래스 모두 - 심지어 아직 만들지 않은 클래스와도 - 와 잘 동작할 것이다.

### 캡슐화
- 캡슐화는 중복된 코드를 없애는 관점에서도 유용하지만, 복사-붙여넣기를 피하는 것 이상의 내용이 캡슐화의 개념에 있다.
- 캡슐화는 <b>클래스를 불필요한 변경으로부터 보호한다.</b>
- 변화의 가능성이 있다고 생각되는 프로그램의 기능이 있을 때, 그 기능을 자주 변하지 않을 부분과 분리해야 한다. 즉, 변경하는 것을 캡슐화하려는 노력이 항상 필요하다.
- 캡슐화는 여러분의 데이터를 여러분 애플리케이션의 행동으로부터 분리합니다. 그런 후 각 부분이 애플리케이션의 나머지 부분에서 어떻게 사용되는지 제어할 수 있습니다.

### 변경
- 소프트웨어에서 변하지 않는 진리는 소프트웨어는 변한다는 것이다. 설계가 잘 되어 있지 않은 소프트웨어는 처음 변경이 일어날 때 무너진다. 하지만 위대한 소프트웨어는 쉽게 변경될 수 있다.
- 소프트웨어를 변경에 잘 견디도록 만드는 가장 쉬운 방법은 <b>각 클래스가 변경의 이유를 하나만 갖도록 하는 것</b>이다. 다시 말해, 클래스 안의 변경 요인을 줄여 변경 가능성을 최소화하는 것이다.

### 응집도

```
Q: 응집도라는 게 프로그램이 쉽게 변경될 수 있는지 나타내는 건가요?
A: 그렇지 않아요. 응집도는 프로그램 안의 각 클래스, 객체, 그리고 패키지를 어떻게 구성했는지에 초점을 맞추고 있다. 각 클래스가 몇 가지 일만을 한다면, 그것은 아마 아주 응집도가 높은 소프트웨어일 것입니다.
하지만 하나의 클래스가 그다지 관련되지 않은 여러 졍류의 일을 한다면, 낮은 응집도의 프로그램인 것입니다.

Q: 높은 응집도의 소프트웨어는 느슨하게 결합되어 있는 것이 맞나요?
A: 맞습니다. 거의 모든 경우, 소프트웨어가 더 응집되어 있을수록, 클래스들간에 더 느슨한 결합을 갖게 됩니다.

Q: 그렇다면 소프트웨어가 더 변경하기 쉬울 거라는 거잖아요?
A: 대부분의 경우 맞습니다. 하지만 기본적으로 프로그램을 수정하면 이미 응집되어 있고 느슨하게 결합되어 있는 설계를 변경해야 할 때도 있습니다.
그래서 응집도가 언제나 소프트웨어가 변경하기 쉬운지에 대한 척도는 아닙니다. 하지만 소프트웨어의 동작 방식을 대폭 수정하는 경우아 아니라면, 응집도가 높은 소프트웨어가 대개 변경이 용이한건 맞습니다.

Q: 응집도가 높은 소프트웨어가 변경뿐만 아니라 재사용도 쉽지 않나요?
A: 맞아요. 높은 응집도와 느슨한 결합은, 소프트웨어 안의 객체들이 서로 의존하지 않게 하여, 확장하기 쉽고, 나눠서 재사용하기 쉬운 소프트웨어로 만듭니다.
이렇게 생각하세요: 프로그램에서 응집도가 높을수록, 각 객체가 할 일이 더 잘 정의된 것입니다. 그리고 객체(와 그 객체의 할 일)가 잘 정의될수록, 
그 객체를 끄집어 내어 다른 프로그램에서 같은 일을 하도록 하기 쉽습니다. 이러한 객체는 어디서 이용되더라도, 매우 기꺼이 자신이 맡은 특정한 일을 계속할 것입니다.
```

### 정리
1. 변하는 것을 캠슐화하여 프로그램을 더 유연하고 변경하기 쉽게 만든다.
2. 구현에 맞추어 코딩하는 것보다 인터페이스에 맞추어 코딩하면 소프트웨어의 확장이 더 쉬워진다.
3. 좋은 요구사항을 얻는 가장 좋은 방법은 시스템이 해야할 일을 이해하는 것이다.
4. 분석은 시스템이 실세계에서 잘 동작하도록 만드는 데 도움이 된다.
5. 위대한 소프트웨어는 변경과 확장이 쉽고 고객이 원하는 일을 한다.

## 디자인 원리
1. OCP(Open-Closed Principle) : 개방-폐쇄의 원리
- OCP는 기존 코드를 변경하지 않으면서 코드의 수정을 허용하는 것에 관한 원리이다.
- 클래스는 확장에는 열려있고, 수정에는 닫혀 있어야 한다.
- ex) private 변수와 setter, 클래스 상속
2. DRY(Don't Repeat Yourself) : 반복 금지의 원리
- 공통되는 부분을 추출하여 추상화하고 한 곳에 두어 중복 코드를 피하라.
- 하나의 요구사항은 한 곳에 두어야 한다.
3. SRP(Single Responsibility Principle) : 단일 책임의 원리
- 시스템의 모든 객체는 하나의 책임만을 가지며, 객체가 제공하는 모든 서비스는 그 하나의 책임을 수행하는 데 집중되어 있어야 한다.
4. LSP(Liskov Substitution Principle) : 리스코프 치환 원리
- 자식 타입들은 부모 타입들이 사용되는 곳에 대체될 수 있어야 한다. 그렇지 않다면, 상속을 잘못 사용하고 있는 것이다.
- LSP를 위반하는 코드를 발견하면, 위임(Delegation), 구성(Composition), 또는 집합(Aggregation)을 사용하여
  상속을 이용하지 않고 다른 클래스의 행동을 사용하는 것을 고려해보라.

#### 위임(Delegation)
- 다른 클래스의 행동이 필요한데 그 행동을 바꿀 필요가 없으면, 원하는 행동을 사용하기 위해 그 클래스에게 위임할 수 있다.

#### 구성(Composition)
- 인터페이스의 여러 구현을 통해 만들어진 비슷한 여러 행동으로부터 하나의 행동을 선택할 수 있게 한다.
- 구성을 사용하면 사용하는 객체가 자신이 사용하는 행동을 소유하고, 구성하는 객체가 사라지면 구성에 참여한 객체도 사라진다.

#### 집합(Aggregation)
- 다른 클래스의 생존에 영향을 미치지 않으면서 그 행동을 사용할 수 있게 한다.
- 집합에 참여한 클래스의 행동은 자신을 사용했던 집합 클래스가 사라진 후에도 계속 존재한다.

### 유스케이스 주도 개발과 특징 주도 개발
1. 유스케이스 주도 개발
- 유스케이스 주도 개발은 애플리케이션의 유스케이스에서 한 번에 하나의 시나리오에 집중합니다.
- 그러나 대부분 하나의 유스케이스의 모든 시나리오를 코딩 작업한 이후에 또 다른 유스케이스의 시나리오로 이동합니다.
2. 특징 주도 개발
- 특징 주도 개발은 하나의 특징을 완전히 코딩 작업한 후에 다른 특징으로 이동합니다.
- 한 번에 하나의 특징을 선택하는 한, 특징 주도 개발에서는 크거나 작은 특징 중에서 한가지로 작업할 수 있습니다.
- 소프트웨어 개발은 항상 반복 작업입니다. 큰 그림을 살펴보고, 그 다음 작은 단위의 기능을 반복 작업합니다.

3. 하나의 새로운 특징이나 유스케이스를 가지고 작업을 시작하는 것을 포함해서, 개발 주기의 모든 단계마다 분석과 설계를 해야 합니다.

### 테스트
- 테스트를 통해서 소프트웨어가 어떠한 버그도 가지고 있지 않다는 것을 확인하고, 고객에게 소프트웨어가 작동하고 있다는 것을 입증할 수 있습니다.
- 좋은 테스트 케이스는 오직 기능의 특정 부분 하나만 테스트합니다.
- 테스트 케이스는 하나의 클래스에 하나 혹은 서너개의 메소드를 포함할 수 있고, 또는 여러 개의 클래스를 포함할 수 있습니다.

### 테스트 주도 개발
- 테스트를 먼저 작정하고 이 테스트를 통과할 수 있도록 소프트웨어를 개발한다는 생각에 기반하고 있습니다.
  결과는 모든 기능을 갖추어 동작하는 소프트웨어입니다.

### 약정에 의한 프로그래밍 환경, 방어적 프로그래밍 환경
1. 약정에 의한 프로그래밍
- 약정에 의한 프로그래밍은 트랜잭션의 양쪽 대상이 무슨 행동이 무슨 행위를 발생시키는지 알고있다는 가정하에 약정을 지키는 것입니다.
- 메소드는 대부분 오류가 발생할 때 null이나 점검이 필요 없는 예외 상황을 반환합니다.
2. 방어적 프로그래밍
- 방어적 프로그래밍은 잘못될 것들을 찾아서, 문제 상황을 회피할 수 있도록 폭넓게 테스트합니다.
- 메소드는 대부분 빈 객체나 혹은 점검이 필요한 예외 상황을 반환합니다.

### OOA&D 프로젝트 생명주기
```
 특징 리스트 => 유스케이스 다이어그램 => 문제점 분해하기 => 요구사항 => 도메인 분석 => 사전 설계 => 구현 => 출하
```

1. 특징 리스트
- 상위 수준에서 애플리케이션이 어떻게 동작되어야 하는지 이해하기
2. 유스케이스 다이어그램
- 애플리케이션이 수행할 프로세스와 관련된 외부 영향을 결정하기
3. 문제점 분해하기
- 애플리케이션을 기능 단위의 모듈들로 분해하여, 각 모듈 중 어떤 것을 먼저 다룰지 순서를 결정하기
4. 요구사항(요구사항 리스트, 본문 해석)
- 각 모듈에 대한 개별적 요구사항을 이해하고 큰 그림에 부합하도록 만들기
5. 도메인 분석
- 어떻게 유스케이스들이 애플리케이션의 객체들로 사상되는지를 이해하고, 고객과 공감대 형성하기
6. 사전 설계
- 객체들에 대한 세부 내용을 채워넣고, 객체들 사이의 관계를 정의하며, 원리와 패턴을 적용하기
7. 구현
- 코드를 작성하고, 테스트하여, 동작하는 것을 확인하기. 완성할 때까지 각 행위, 각 특징, 각 유스케이스, 각 문제점에 대해 반복.
8. 완성!

#### 특징과 유스케이스
- 시스템에서 특징은 시스템이 해야하는 것이며, 시스템이 어떻게 사용되어야 하는지 보여 주는 유스케이스에 항상 반영되지는 않습니다.
- 특징과 유스케이스는 함께 작업합니다. 그러나 그것들이 같은 것은 아닙니다.

### 다형성
- 다형성은 서브 클래스가 슈퍼 클래스를 "대신해서 사용될" 때를 지칭합니다.
- 다형성은 여러분의 애플리케이션을 좀 더 유연하고, 좀 더 변화하기 쉽게 합니다.
 
