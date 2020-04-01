 # AutoHotKey

*[AutoHotKey](https://ko.wikipedia.org/wiki/%EC%98%A4%ED%86%A0%ED%95%AB%ED%82%A4)는 윈도우 응용 프로그램 및 매크로를 만드는 오픈 소스 자유 소프트웨어이자 스크립트 언어이다. 사용자가 반복작업을 자동으로 할 수 있도록 도와준다. 어떤 응용 프로그램의 사용자 인터페이스도 오토핫키로 고칠 수 있다.*

그동안 노트북의 키보드만 사용하다 보니 `← + Fn` = `Home`과 `→ + Fn` = `End`에 익숙해졌다.

그래서 [KeyTweak](https://keytweak.ko.softonic.com/)이라는 프로그램을 사용해 방향키 위의 `home`, `end`, `page up`, `page down`등의 키 값을 변경해 사용해봤는데 여전히 불편했다.

그래서 찾은 것이 [AutoHotKey](https://autohotkey.com/download/)이다. ([Editor](https://fincs.ahk4.net/scite4ahk/))

스크립트  
- `Alt + ←` = `Home`
- `Alt + Shift + ←` = `Shift + Home`
- `Alt + →` = `End`
- `Alt + Shift + →` = `Shift + End`

~~~
!Left::
Send, {Home}
return

+!Left::
Send, +{Home}
return

!Right::
Send, {End}
return

+!Right::
Send, +{End}
return
~~~

- 위의 스크립트는 .ahk 파일을 생성해 작성하면 됨

컴퓨터 재부팅 시 스크립트 시작 프로그램으로 설정하는 법(**Windows 10**)
~~~
1. Win + R 누르고 shell:startup 입력
2. 작성한 스크립트 파일(.ahk) 복사 + 붙여넣기
~~~
