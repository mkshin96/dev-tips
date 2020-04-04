# HTTP Method

## OPTIONS
- `HTTP OPTIONS Method`는 목표 리소스와의 통신 옵션을 설명하기 위해 사용된다. 
- 서버에게 특정 리소스에 대해 어떤 메소드가 지원되는지 물어볼 수 있다.

<center><img src="https://github.com/mkshin96/dev-tips/blob/master/images/HTTP_OPTIONS.PNG?raw=true" width="550" height="300"></center>


- `CORS`요청의 종류 중 `Preflight Request`에서 사용된다.
    - `Preflight Request`는 `Simple Request`의 조건에 해당하지 않으면 브라우저가 요청하는 방식
    - `Simple Request` 조건
        1. `GET`, `POST`, `HEAD`중의 한 가지 방식을 사용해야 한다.
        2. `POST`방식일 경우 `Content-Type`이 아래 셋중의 하나여야 한다.
            - `application/x-www-form-urlencoded`
            - `multipart/form-data`
            - `text/plain`
        3. 커스텀 헤더를 전송하지 말아야 한다.
    - 따라서 `Preflight Request`는
        - `GET`, `POST`, `HEAD`외에 다른 방식으로도 요청을 보낼 수 있다.
        - `application/json`처럼 다른 `Content-Type`으로 요청을 보낼 수 있다.
        - 커스텀 헤더를 사용할 수 있다.
    - `Preflight Request`는 예비 요청과 본 요청으로 나뉘어 전송된다.
        - 먼저 서버에 예비 요청을 전송하고 서버는 예비 요청에 대해 응답하고, 다음 본 요청을 서버에 전송하고,  서버는 본 요청에 대해 응답한다.
    - 하지만 예비 요청과 본 요청에 대한 서버단의 응답을 프로그래머가 프로그램 내에서 구분하여 처리하는 것은 아니다.
    - 프로그래머가 `ACCESS-CONTROL-`계열의 `Response Header`만 적절히 정해주면 `OPTIONS`요청으로 오는 예비 요청과 `GET`, `POST`, `PUT`, `DELETE`등으로 오는 본 요청의 처리는 서버가 알아서 처리한다.
    
### 참고
- https://developer.mozilla.org/ko/docs/Web/HTTP/Methods/OPTIONS
- https://homoefficio.github.io/2015/07/21/Cross-Origin-Resource-Sharing/
- https://www.zerocho.com/category/HTTP/post/5b3723477b58fc001b8f6385