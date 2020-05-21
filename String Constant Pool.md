# String Constant Pcool

- 스트링은 두 가지 생성 방식이 있고 그에 따라 차이점이 존재한다.
    1. `new`연산자를 이용한 방식
    2. 리터럴을 이용한 방식
- `new`를 통해 `String`을 생성하면 `Heap`영역에 존재하게 되고, 리터럴을 이용한 경우 `String Constant pool`이라는 영역에 존재하게 된다.
- 예제를 통해 설명하겠다.

```java
String a = "Hello";
String b = "Hello";
String c = new String("Hello");
System.out.println(a == b); // true
System.out.println(a == c); // false
```

- 알다시피 `==`연산은 값을 비교하는 것이 아니라 같은 메모리를 참조하는지 비교하는 것이다.
    - `a`의 경우 Hello라는 문자열을 `String Constant pool`에 넣게 된다.
    - `b`의 경우는 이미 같은 무자열이 `String Constant pool`에 존재하기에 같은 값을 참조하게 된다.
    - `c`의 경우에는 `new`연산자를 사용하여 새로운 객체를 명시적으로 생성하도록 했기 때문에 `String Constant pool`이 아닌 다른 주소값을 참조하게 된다.(`Heap`영역에 존재하기 때문에)

### [참고](https://inor.tistory.com/39)