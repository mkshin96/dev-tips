# CPU 스케줄링 알고리즘

### Context Switching

---

- 메모리에 프로세스가 여러 개 있어도 어느 한 순간에는 CPU가 하나의 프로세스 밖에 실행하지 못함
- 그래서 하나의 프로세스를 실행하다가 다음 프로세스로 넘어가는 것을 컨텍스트 스위칭 이라고 함
- `p1` → `p2` 로 넘어가기 위해서는 현재 상태를 어딘가에 저장해야 함
    - **PCB#1에 저장함(MMU의 base register, limit register 값 등등)**
    - 그리고 **PCB#2**에 저장되어 있던 `p2` 의 값들로 복원(restore)함
    - 이런 일들은 OS안의 프로세스 관리 부서 안에 디스패쳐가 함
    - 컨텍스트 스위칭을 자주 할수록 오버헤드(오버헤드는 어떤 처리를 하기 위해 들어가는 간접적인 처리 시간) 횟수가 많아져 손해임
    - 따라서 디스패쳐같은 프로그램은 효율적이어야 한다.
    - 따라서 C와 같이 하이레벨 언어가 아닌 어셈블리어 같은 로우레벨 언어로 짬

### Preemptive(선점) vs Non-preemptive(비선점)

---

- Preemptive(선점)
    - CPU가 프로세스를 실행 중 프로세스가 끝나지도 않았고, I/O를 만난 것도 아닌데 강제로 쫓아내고 새로운 프로세스가 CPU에 의해 실행될 수 있는 것
- Non-preemptive(비선점)
    - CPU가 프로세스를 실행 중 프로세스가 끝나거나, I/O를 만나지 않으면 새로운 프로세스가 CPU에 의해 실행될 수 없는 것

### Scheduling criteria(척도, 어떤 스케줄링 방식이 더 좋은가)

---

- CPU 이용률(Utilization)
    - cpu가 쉬지 않고 일을 했는지
- Throughput(이용률)
    - 시간 당 몇개의 작업을 끝냈는가
- Turnaround Time(반환 시간)
    - 프로세스가 얼마만에 끝나는가
- Waiting Time(대기 시간)
    - 프로세스가 얼마나 기다려야 하는가
- Response Time(응답 시간)
    - 대화형 시스템에서 중요
    - 우리의 대부분의 컴퓨터는 대화형(interactive) 시스템 → 마우스 클릭하면 답하고, 키보드 누르면 답하고
    - 처음 응답이 나올 때까지 나오는 시간

### CPU Scheduling Algorithms

---

- First-Come, First-Served(FCFS)
    - 단순하고 공평하지만 좋은 성능을 나타내는 것은 아님
    - 세 개의 프로세스가 레드 큐에 있을 때, 맨 처음 실행될 프로세스가 작업 시간이 길면 나머지 두 프로세스의 대기시간은 올라감(평균 대기 시간이 올라감) →호위효과
- Shortest-Job-First(SJF)
    - 평균 대기 시간을 줄일 수 있음, 최적이 증명되었음
    - 하지만 비현실적이다. 실제로 이 프로세스가 CPU 시간을 얼마나 사용할지 모름
    - 선점 방식과 비선점 방식으로 평균 대기시간을 계산할 수 있음.
        - 선점 방식이 효율적임
- Priority
    - 우선순위, 정수값으로 나타냄
    - 숫자가 낮은 것이 우선순위가 높음
    - 우선순위를 정하는 방법
        - 내부적인 요소
            - time limit : 서비스 시간이 짧은 프로세스 우선
            - memory requirement : 메모리를 작게 차지하는 프로세스 우선
            - I/O to CPU burst : I/O가 길고 CPU를 짧게 필요로 하는 프로세스 우선
        - 외부적인 요소
            - 유료 컴퓨터의 경우 돈 많이 낸 쪽의 유저의 프로세스 우선
            - 이외에 외부적인 요소
            - 선점 비선점 방식으로 계산 가능
    - 문제점
        - 기아(Starvation)가 일어날 수 있음
        - 해결 방법 : aging(오래 기다렸으면 우선순위를 높임?)
- Round-Robin(RR)
    - 빙빙 돌면서 스케줄링
    - 시분할 시스템에서 많이 사용
    - 시간을 쪼개어 프로세스를 실행함, 쪼갠 시간(동일함)을 `Time Quantom`(△) 이라고 함.
    - 일반적으로 `Time Quantom` 은 10~100ms(1초에 10, 100번)
    - `Time Quantom` 이 지나면 다음 프로세스로 컨텍스트 스위칭됨
    - `Time Quantom` 을 얼마나 잡는지 따라 AWT(Average Waiting Time)이 달라짐, 즉 `Time Quantom` 이 핵심
    - `Time Quantom` 을 너무 빈번하게 하면 `Context Switching Overhead` 때문에 좋지 않고, `Time Quantom` 을 무한으로 하면 비선점 방식과 같음.
- Multilevel Queue
    - System processes
        - 가장 먼저 실행되어야 함
    - Interactive processes
    - Interactive editing processes
    - Batch processes
        - 컴퓨터가 알아서 하는 작업이기 때문에 우선순위가 좀 늦어도 괜찮음
    - Student processes
    - 위와 같이 성격이 다른 프로세스들을 동일한 Ready Queue에 세우는 것은 비효율적이다.
    - 여러 개의 Ready Queue를 두자 → 멀티레벨 큐
    - 큐마다 우선순위를 둠
    - 큐마다 다른 스케줄링 방법을 쓸 수 있다.(FCFS, Round Robin, Priority ...)
    - 프로세스가 들어가는 입구가 다름
- Multilevel Feedback Queue
    - 여러 개의 큐를 둠
    - 큐마다 우선순위를 둠
    - 큐마다 다른 스케줄링 방법을 쓸 수 있다.(FCFS, Round Robin, Priority ...)
    - 프로세스는 한 큐에 머물러 있는 것이 아님, 한 큐에서 프로세스가 실행이 안되거나, 비효율적이면 다른 큐로 옮길 수 있음, 기아 상태에 있는 프로세스가 있으면 우선순위가 높은 큐로 옮길 수 있음
    - 프로세스가 들어가는 입구는 같음(먼저 한 큐에 들어갔다가, 실행이 안되거나 비효율적이면 다른 큐에 들어감)