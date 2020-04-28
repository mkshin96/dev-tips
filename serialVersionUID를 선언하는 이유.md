# serialVersionUID를 선언하는 이유

- JVM은 직렬화와 역직렬화를 하는 시점의 클래스에 대한 버전 번호를 부여합니다. 만약 그 시점에 클래스의 정의가 바뀌어 있다면 새로운 버전 번호를 할당합니다. 그래서 직렬화할 때의 버전 번호와 역직렬화를 할 때의 버전 번호가 다르면 역직렬화가 불가능하게 될 수도 있습니다. 이런 문제를 해결하기 위해 `SerialVersionUID`를 사용합니다. 간단명료하게 설명하자면 다음과 같습니다.
- *SerialVersionUID값을 저장할 때 클래스 버전이 맞는지 확인하기 위한 용도*
- 만약 직렬화할 때 사용한 `SerialVersionUID`의 값과 역직렬화 하기 위해 사용했던 `SerialVersionUID`값이 다르다면 `InvalidClassException`이 발생할 수 있습니다.

### 참고
- https://ktko.tistory.com/entry/JAVA-%EA%B0%9D%EC%B2%B4%EC%9D%98-%EC%A7%81%EB%A0%AC%ED%99%94Serializable-serialVersionUID