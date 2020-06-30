# Mac Terminal에서 인텔리제이 간편하게 실행하기

1. 인텔리제이 실행

2. [Tools] / [Create Command-line Launcher...] 클릭

3. 아마`/usr/local/bin/idea`경로가 나올거임

4. `terminal` 실행

5. `cd ~` 입력

6. `vim .bash_profile` 입력

7. `alias {인텔리제이를 실행할 명령어}=/usr/local/bin/idea` 입력 후 `esc` 입력, `:wq`로 저장, 나가기

8. `source .bash_profile` 입력

9. `{인텔리제이를 실행할 명령어}` 입력

10. 실행 확인

    