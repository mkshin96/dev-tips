## Tag

- `git tag` : 이미 만들어진 태그가 있는지 확인
- `git tag -l` 옵션을 사용해서 태그를 검색할 수 있다. 예를 들어 1.8.5 버전의 태그들만 검색하고 싶으면 다음과 같이 실행한다.
~~~bash
$ git tag -l "1.8.5*"
~~~

### 태그 붙이기
- Git의 태그는 **LightWeight** 태그와 **Anotated** 태그로 두 종류가 있다.
- **LightWeight** 태그는 브랜치와 비슷한데 브랜치처럼 가리키는 지점을 최신 커밋으로 이동시키지 않는다. 단순히 특정 커밋에 대한 포인터일 뿐이다.
- **Anotated** 태그는 Git 데이터베이스에 태그를 만든 사람의 이름, 이메일과 태그를 만든 날짜, 그리고 태그 메시지도 저장한다. GPG(GNU Privacy Guard)로 서명할 수도 있다. 일반적으로 **Anotated** 태그를 만들어 이 모든 정보를 사용할 수 있도록 하는 것이 좋다. 하지만 임시로 생성하는 태그거나 이러한 정보를 유지할 필요가 없는 경우에는 **LightWeight** 태그를 사용할 수도 있다.

#### Anotated 태그
- **Anotated** 태그를 만드는 방법은 간단하다. `tag`명령을 실행할 때 `-a` 옵션을 추가한다.

~~~bash
$ git tag -a v1.0.0 -m "This version is 1.0.0"
$ git tag
v1.0.0
~~~
- `-m` 옵션으로 태그를 저장할 때 메시지를 함께 저장할 수 있다. 명령을 실행할 때 메시지를 입력하지 않으면 Git은 편집기를 실행시킨다.

- `git show` 명령으로 태그 정보와 커밋 정보를 모두 확인할 수 있다.

#### Lightweight 태그
- **LightWeight** 태그는 기본적으로 파일에 커밋 체크섬을 저장하는 것뿐이다. 다른 정보는 저장하지 않는다. **LightWeight** 태그를 만들 때는 `-a`, `-s`, `-m` 옵션을 사용하지 않는다. 이름만 달아줄 뿐이다.

~~~bash
$ git tag v1.0.0
$ git tag
v1.0.0
~~~
- 이 태그에 `git show`를 실행하면 별도의 태그 정보를 확인할 수 없다. 이 명령은 단순히 커밋 정보만을 보여준다.

#### 태그 공유하기
- `git push` 명령은 자동으로 리모트 서버에 태그를 전송하지 않는다. 태그를 만들었으면 서버에 별도로 Push 해야한다. 브랜치를 공유하는 것과 같은 방법으로 할 수 있다. `git push origin <태그 이름>`을 실행한다.

~~~bash
$ git push origin v1.0.0
~~~

- 만약에 한 번에 태그를 여러 개 Push 하고 싶으면 `--tags` 옵션을 추가하여 `git push` 명령을 실행한다. 이 명렁으로 리모트 서버에 없는 태그를 모두 전송할 수 있다.

~~~bash
git push origin --tags
~~~
- 이제 누군가 저장소에서 Clone 하거나 Pull을 하면 모든 태그 정보도 함께 전송된다.

#### 태그를 Checkout 하기
- 예를 들어 태그가 특정 버전을 가리키고 있고, 특정 버전의 파일을 체크아웃 해서 확인하고 싶다면 다음과 같이 실행한다. 단 태그를 체크아웃하면(브랜치를 체크아웃 하는 것이 아니라면) `detached HEAD(떨어져 나온 HEAD)` 상태가 되며 일부 Git 관련 작업이 브랜치에서 작업하는 것과 다르게 동작할 수 있다.

~~~bash
$ git checkout v1.0.0
~~~
- `detached HEAD(떨어져 나온 HEAD)` 상태에서는 작업을 하고 커밋을 만들면, 태그는 그대로 있으나 새로운 커밋이 하나 쌓인 상태가 되고 새 커밋에 도달할 수 있는 방법이 따로 없게 된다. 물론 커밋의 해시값을 정확히 기억하고 있으면 가능하긴 하다. 특정 태그의 상태에서 새로 작성한 커밋이 버그 픽스와 같이 의미있도록 하려면 반드시 브랜치를 만들어서 작업하는 것이 좋다.

~~~bash
$ git checkout -b version2 v1.0.0
~~~

### 참고
- [링크](https://git-scm.com/book/ko/v2/Git%EC%9D%98-%EA%B8%B0%EC%B4%88-%ED%83%9C%EA%B7%B8)

#### 설정 해제
- `git config --unset ~~~~`
- ex) git bash에 등록되어있는 `user.name`, `user.email` 해제
	- `git config --unset --global user.name`
	- `git config --unset --global user.email`

