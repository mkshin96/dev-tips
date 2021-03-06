# aws ec2 timezone 변경

~~~bash
date // 서버 시간의 날짜, 시간 확인
sudo rm /etc/localtime // 서버가 사용중인 표준시 삭제
sudo ln -s /usr/share/zoneinfo/Asia/Seoul /etc/localtime // KST를 서버의 표준시로 설정
date // 확인
~~~

### ln 명령어
- `ln`은 Link의 약어로서 리눅스 파일시스템에서 링크파일을 만드는 명령어이다. 리눅스에서는 **심볼릭링크**와 **하드링크**의 두 가지 링크 파일이 존재한다.

### 심볼링 링크(Symbolic Link)
- 단순히 원본파일을 가리키도록 링크만 시켜둔 것으로 MS의 윈도우 시스템에서 흔히 사용하는 **바로가기**같은 것이며, 원본파일을 가리키고만 있으므로 원본파일의 크기와는 무관하다. 그리고 심볼릭링크에서는 원본파일이 삭제되어 존재하지 않을 경우에 링크파일의 우너본파일이 없다는 것을 알려준다.

### 하드 링크(Hard Link)
- 원본파일과 다른이름으로 존재하는 동일한 파일이며 원본파일과 동일한 내용의 다른파일이라고 할 수 있다. 그리고 하드링크에서는 원본파일과 링크파일 두 개가 서로 다른파일이기 때문에 둘 중 하나를 삭제하더라도 나머지 하나는 그대로 남아있다. 또한 하드링크에서는 원본파일의 내용이 변경될 겨우 링크파일의 내용 또한 자동으로 변경된다.

### 하드링크 파일 생성

~~~bash
ln hard_source hard_link
~~~

### 심볼릭 링크 파일 생성

~~~bash
ln -s /symbolic_source /symbolic_link
~~~

### 옵션
- -s : 심볼릭 링크파일을 생성
- **더 많은 옵션은 참고 블로그에 있음.**

### 참고
- https://webdir.tistory.com/148
- https://ora-sysdba.tistory.com/entry/Cloud-Computing-Amazon-EC2-%EC%9D%B8%EC%8A%A4%ED%84%B4%EC%8A%A4%EC%9D%98-TIMEZONE-%EB%B3%80%EA%B2%BD