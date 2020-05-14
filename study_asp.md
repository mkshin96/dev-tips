# Study ASP

- `Dim`
    - 변수의 선언
~~~vbnet
DIM a, b
a = "asdf"
b = 1234
~~~

<BR>

- `Dim()`
    - 배열의 선언
~~~vbnet
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
~~~vbnet
set asdf=Server.CreateObject("개체이름")
~~~
> asp에서 객체를 사용하려면 반드시 `set`이라는 연산자를 사용해야 한다. 그렇지 않으면 우리는 객체의 인스턴스를 생성할 수가 없으며, 그 객체의 어떠한 기능도 사용할 수 없다. 객체를 사용하고자 할 경우 `set`명령을 통해서 그 객체의 인스턴스를 생성할 수가 있다.

<br>

- `InStr("기준 문자열", "찾는 문자열")`
    - 찾는 문자열이 몇 번째에 있는지 반환한다.
    - `asp`는 보통 대소문자를 구분하지 않지만, `InStr`함수는 대소문자를 구분한다.
~~~vbnet
<%
    Dim Str, inStr_Str
    Str = "abcedfg"

    inStr_str = InStr(Str, "hij")

    response.write inStr_Str
%>
~~~
> 결과값 : 0

~~~vbnet
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
~~~vbnet
    Dim strSpace
    strSpace = "Welcome to my blog"
    strSpace = Trim(strSpace)
~~~

<br>

- `Replace()`
    - 문자를 **교체**해주는 함수

~~~vbnet
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
~~~vbnet
    sDate = "2019년 04월 01일"
    Response.Write CDate(sDate)
~~~
> 결과 : 2019-04-01

<br>

- 제어문
    - `IF Then`, `ElseIf Then`, `END IF`
~~~vbnet
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
~~~vbnet
'이것은 주석입니다.
~~~

<br>

- `IsArray()`
    - `IsArray`는 입력값이 배열인지 아닌지 확인하는 함수이다.
~~~vbnet
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
~~~vbnet
    Dim arr(3)
    Dim val
    Response.Write "Ubound(val) : " & Ubound(val)
~~~
> 결과값 <br>
> 런타임 오류
> 변수 val는 배열이 아니며, Ubound는 배열이 아닌 값을 인수로 받으면 오류가 발생한다.

~~~vbnet
    Dim arr(3)
    Dim val
    Response.Write "Ubound(arr) : " & Ubound(arr)
~~~
> 결과값 : 3

- 기존 크기가 정해지지 않은 배열변수를 만들고 배열에 갯수를 재할당하는 방법

```vbnet
Dim 변수명()
ReDim 변수명(크기)
```

- 변수 선언 시 주의 사항

    1. 변수이름에는 마침표를 사용할 수 없습니다.

    2. 256자를 초과할 수 없습니다.

    3. 변수이름은 프로그램내에서 유일해야 합니다.

    4. 알파벳문자로 시작해야 합니다.

    - **참고**
        - asp는 변수를 선언하지 않아도 자동으로 변수로 인식합니다.

```vbnet
Dim myvar
myvar = "변수"
\\\\\\\\\\\\\
myvar = "변수" 'Dim을 사용하지 않아도 된다.
```

- 다만 이렇게 하지 않는 경우는 서버측 자원소모가 많기 때문입니다.
- 그래서 프로그램 최상단에 `option explicit`라는 문장을 넣어 변수가 자동생성되지 않도록 옵션을 붙이기도 합니다.

- `UCase()`
    - `UCase()`는 입력받은 영문자를 모두 대문자로 변경하는 함수이다.

```vbnet
UCase("Ucase 예제")
```

- 결과값 : UCASE 예제

- `LCase()`
    - `LCase()`는 입력받은 영문자를 모두 대문자로 변경하는 함수이다.

```vbnet
LCase("Lcase 예제")
```

- 결과값 : LCASE 예제

- `DATEDIFF()`
    - 특정일을 기준으로 남은 날짜를 구하기 위해 사용

```vbnet
<%
Dim fromDate, toDate
fromDate= "2019-04-25"
toDate= "2019-05-16"
response.write DateDiff("d", fromDate, toDate)
%>
```

- 결과값 : 21
    - `toDate`에서 `fromDate`를 뺀 값을 일자로 표현하기 때문에 결과값은 **21**이 나온다.
    - 맨 앞에 나오는 `d`는 날짜형태 중 하나이고, 두 날짜의 차이 일 수를 보여준다.
    - 사용할 수 있는 날짜 형태
        - yyyy : 년
        - q : 분기
        - m : 월
        - d : 일
        - w : 주
        - h : 시
        - n : 분
        - s : 초

- `콜론 연산자(:)`
    - 콜론 연산자는 단지 여러줄에 걸려첫 사용해야하는 ASP구문들이 한 줄에 사용되도록 해준다.

```vbnet
Dim a, b
a = 10
b = 20
'으로 사용해야 하는 asp구문은 다음과 같이 될 수 있다.

Dim a, b : a = 10 : b = 20
```

- `분할 연산자(_)`
    - 분할 연산자는 한줄에 사용해야만 하는 ASP구문이 여러줄에 걸쳐서 사용할 수 있도록 해준다.

```vbnet
Dim greeting, name
greeting = "hello"
name = "my name is mugon"
response.write "<script> document.write('" & greeting & "<br>" & name & "'); </script>"
'위와 같은 구조를

Dim greeting, name
greeting = "hello"
name = "my name is mugon"
response.write "<script> document.write('"_
								& greeting & "<br>"_
								& name & "'); </script>"
'와 같이 여러줄로 쓸 수 있다.
```

- 단 따옴표로 이루어진 String문장이나, 예약어, 상수, 변수명은 중간에 _를 이용하여 여러줄로 표시할 수 없다.
- 예를 들어,

```vbnet
response.write "hello"
'를
resp_
onse_write "hel_
lo"
'로 표현할 수 없다.
```

- `<%= %>`
    - 데이터를 나타날 때 사용

- `<!--#include virtual="/config/dbcon.asp"-->` vs `<!--#include file="./include/DBFunction.asp"-->`
    - `virtual`은 절대경로
    - `file`은 상대경로

- `Call`
    - `Sub`, `Function`을 호출할 때 사용한다.

- `Function`
    - 리턴값이 있는 함수

```vbnet
Function aa(str)
	aa = str
End Function

Response.Write(aa("aa"))
```

- 결과값 : aa

- `Sub`
    - 리턴값이 없는 함수

```vbnet
Sub bb(str)
	if str == "bb" then
		Response.Write("bb")
	Else
		Response.Write("not bb")
	End if
End Sub

Call bb("bb")
'또는
bb "bb"
```