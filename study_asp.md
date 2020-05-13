# Study ASP

- `Dim`
    - 변수의 선언
~~~asp
DIM a, b
a = "asdf"
b = 1234
~~~

<BR>

- `Dim()`
    - 배열의 선언
~~~asp
Dim A() //A변수 언언
ReDim A(3) //A변수의 배열은 0~3 총 4개로 지정
A(0) = 0
A(1) = 1

response.write(A(0) & A(1))
~~~
> `&`는 접합을 의미한다.

<BR>

- `SET`
    - 객체의 선언
~~~asp
set asdf=Server.CreateObject("개체이름")
~~~
> asp에서 객체를 사용하려면 반드시 `set`이라는 연산자를 사용해야 한다. 그렇지 않으면 우리는 객체의 인스턴스를 생성할 수가 없으며, 그 객체의 어떠한 기능도 사용할 수 없다. 객체를 사용하고자 할 경우 `set`명령을 통해서 그 객체의 인스턴스를 생성할 수가 있다.

<br>

- `InStr("기준 문자열", "찾는 문자열")`
    - 찾는 문자열이 몇 번째에 있는지 반환한다.
    - `asp`는 보통 대소문자를 구분하지 않지만, `InStr`함수는 대소문자를 구분한다.
~~~asp
<%
    Dim Str, inStr_Str
    Str = "abcedfg"

    inStr_str = InStr(Str, "hij")

    response.write inStr_Str
%>
~~~
> 결과값 : 0

~~~asp
<%
    Dim Str, inStr_Str
    Str = "abcedfg"

    inStr_str = InStr(Str, "a")

    response.write inStr_Str
%>
~~~
> 결과값 : 1

<br>

- `Trim()`
    - **앞뒤**의 공백을 없애주는 함수
    - 중간중간의 공백은 없어지지 않는다.
    - `LTrim()`, `RTrim()` 또한 존재한다.
~~~asp
    Dim strSpace
    strSpace = "Welcome to my blog"
    strSpace = Trim(strSpace)
~~~

<br>

- `Replace()`
    - 문자를 **교체**해주는 함수

~~~asp
    Dim strReplace
    strReplace = "당신을 좋아합니다."

    Response.Write Replace(strReplace, "좋아", "사랑")
~~~

<br>

- `Request` 객체
    - 웹프로그래밍에서 `Request`라는 객체의 열할은 개인 사용자가 인터넷을 키고 인터넷 페이지에서 로그인이나 회원 가입등을 할 때 정보를 적는다.
    - 이름이나 전화번호등의 정보를 저장하기 위해 사용자가 입력한 값을 전달받아야 할 것이다.
    - 이 때, 정보를 받아오는 역할을 `Request`객체가 한다.
    - 컬렉션
        - `ClientCertificate`
            - 사용자가 전송해준 인증서 
        - `Cookies`
            - 사용자가 전송한 쿠키 값
            - 크롬 환경에서 쿠키는 암호화되어 저장된다. 따라서 사용자가 다시 풀어서 보기 힘들다.
        - `Form`
            - 사용자가 전송한 폼 요소 값 
        - `QueryString`
            - HTTP 정보를 이름별로 가져올수 있음 
        - `ServerVariables`
            - HTTP와 환경 변수값 
        - `TotalByte`
            - 사용자가 전송한 총 바이트 수 파일 업로드가 되겠내요 
        - `BinaryRead`
            - 사용자가 전송한 데이터 검색 

<BR>

- 비교연산자
    - `<>` : 같지 않다.

<BR>

- `CDATE()`
    - 날짜 관련 값을 *YYYY-MM-DD* 형식으로 보여준다.
~~~asp
    sDate = "2019년 04월 01일"
    Response.Write CDate(sDate)
~~~
> 결과 : 2019-04-01

<br>

- 제어문
    - `IF Then`, `ElseIf Then`, `END IF`
~~~asp
<%
    Dim intNum
    intNum = 8

If intNum > 10 Then
    Response.Write "변수 intNum은 10보다 큰 정수"
ElseIf intNum > 1 Then
    Response.Write "변수 intNum은 1보다 크지만 10보다 작은 정수"
ElseIf intNum = 0 Then
    Response.Write "변수 intNum은 0"
Else intNum < 0 Then
    Response.Write "변수 intNum은 0보다 작은 음의 정수"
End If
%>
~~~

<br>

- 주석
    - `'`
~~~asp
'이것은 주석입니다.
~~~

<br>

- `IsArray()`
    - `IsArray`는 입력값이 배열인지 아닌지 확인하는 함수이다.
~~~asp
    Dim arr(3)
    Dim val

    Response.Write "IsArray(arr) : " & IsArray(arr) & "<br>"
    Response.Write "IsArray(val) : " & IsArray(val) & "<br>"
~~~
> 결과값 <br> 
> IsArray(arr) : True <br>
> IsArray(val) : False

<br>

- `Ubound()`
    - 입력된 배열의 크기를 확인해주는 함수
~~~asp
    Dim arr(3)
    Dim val
    Response.Write "Ubound(val) : " & Ubound(val)
~~~
> 결과값 <br>
> 런타임 오류
> 변수 val는 배열이 아니며, Ubound는 배열이 아닌 값을 인수로 받으면 오류가 발생한다.

~~~asp
    Dim arr(3)
    Dim val
    Response.Write "Ubound(arr) : " & Ubound(arr)
~~~
> 결과값 : 3