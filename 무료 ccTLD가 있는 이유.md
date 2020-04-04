# 무료 ccTLD가 있는 이유

### ccTLD란
- country code Top-Level Domain의 약자
- 말 그대로 국가 코드 최상위 도메인을 말함

### 최상위 도메인이란
- 최상위 도메인(Top-Level Domain, TLD)은 인터넷에서 도메인 네임의 가장 마지막 부분을 말한다. 예를 들어, `www.naver.com`의 최상위 도메인은 `.com`이 된다.
- 최상위 도메인은 `.com`과 같은 일반 최상위 도메인과 `.kr` 같은 국가 코드 최상위 도메인으로 나뉜다.

### 도메인 네임이란
- 넓은 의미로는 네트워크상에서 컴퓨터를 식별하는 호스트명을 의미
- 좁은 의미에서는 도메인 레지스트리에 등록된 의미
- 이를 통틀어서 '웹 주소'라고 (잘못) 부르는 경우도 있다.

### 웹 주소란?
- URL은 네트워크 상에서 자원이 어디 있는지를 알려주기 위한 규약
- 흔히 웹 사이트 주소로 알고 있지만, URL은 웹 사이트 주소뿐만 아니라 컴퓨터 네트워크 상의 자원을 모두 나타낼 수 있다.
그 주소에 접속하려면 해당 URL에 맞는 프로토콜을 알야 하고, 그와 동일한 프로토콜로 접속해야 한다.
- 문법
~~~
 scheme:[//[user:password@]host[:port]][/]path[?query][#fragment]
~~~

- URL은 제일 앞에 자원에 접근할 방법을 정의해 둔 프로토콜 이름을 적는다.
- 프로토콜 이름 다음에는 프로토콜 이름을 구분하는 구분자인 `:`을 적는다.
- 만약 `IP`혹은 Domain name 정보가 필요한 프로토콜이라면 `:` 다음에 `//`를 적는다.
- 프로토콜 구분자인 `:`혹은 다음에는 프로토콜마다 특화된 정보를 적는다.
    - 예1) http://www.example.com/a.gif - IP 혹은 Domain name 정보가 필요한 형태 ( www.example.com에 있는 a.gif를 가리키고 있음 )
    예2) ftp://id:pass@192.168.1.234/a.gif - IP 혹은 Domain name 정보가 필요한 형태 ( 192.168.1.234에 있는 a.gif를 가리키고 있음 )
    예3) mailto:somebody@mail.somehost.com - IP정보가 필요없는 프로토콜 ( mailto 프로토콜은 단지 메일을 받는 사람의 주소를 나타냄 )

### 무료 ccTLD(country code Top-Level Domain)가 있는 이유
- 인터넷이 열악한 국가들에게 최상위 도메인을 얻어 무료로 제공하고, 그로 인해서 얻는 광고수입이나 유료결제를 통한 도메인 수입을 해당 국가의 IT 발전에 큰 기여를 한다고 함

### 참고
- https://ko.wikipedia.org/wiki/%EC%B5%9C%EC%83%81%EC%9C%84_%EB%8F%84%EB%A9%94%EC%9D%B8
- https://ko.wikipedia.org/wiki/%EB%8F%84%EB%A9%94%EC%9D%B8_%EB%84%A4%EC%9E%84
- https://ko.wikipedia.org/wiki/URL
- https://studyforus.tistory.com/132