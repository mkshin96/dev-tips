# B-Tree

- 전산학에서 B-Tree는 데이터베이스와 파일 시스템에서 널리 사용되는 트리 자료구조의 일종으로, 이진 트리를 확장해 하나의 노드가 가질 수 있는 자식 노드의 최대 숫자가 2보다 큰 트리 구조이다.
- 방대한 양의 저장된 자료를 검색해야 하는 경우 검색어와 자료를 일일이 비교하는 방식은 비효율적이다.  B-Tree는 자료를 정렬된 상태로 보관하고, 삽입 및 삭제를 대수 시간으로 할 수 있다. 대부분의 이진 트리는 항목이 삽입될 때 하향식으로 구성되는 데 반해, B-Tree는 일반적으로 상향식으로 구성된다.
- n개의 키가 있는 한 노드를 생각해 보자. 키 집합은 정렬되어 있다고 한다. 그 노드는 n+1 자식 노드를 가리키는 포인터로 구성된다.
- B-Tree의 기본 개념은 내부 노드의 자식 노드의 수가 미리 정해진 범위 내에서 변경 가능하다는 것이다. 항목이 삽입되거나 삭제될 때, 내부 노드는 해당 범위의 자식 노드의 수를 만족시키기 위해 분리되거나 혹은 다른 노드와 합쳐지게 된다. 자식 노드의 수가 일정 범위 내에서만 유지되면 되므로, 분리 및 합침을 통한 재균형 과정은 다른 **자가 균형 이진 탐색 트리**만큼 자주 일어나지는 않지만, 저장 공간에서의 손실은 있게 된다. 자식 노드의 최소 및 최대수는 일반적으로 특별한 구현에 대해서 결정되어 있다. 예를 들어 2-3 B-Tree(혹은 단순히 2-3트리)에서 각 내부 노드는 2 또는 3개의 자식 노드를 가질 수 있다. 만약 허용되지 않은 수의 자식 노드를 가질 경우, 해당 노드는 부적절한 상태에 있다고 한다.
- B-Tree는 노드 접근 시간이 노드에서의 연산시간에 비해 훨씬 길 경우, 다른 구현 방식에 비해 상당한 이점을 가지고 있다. 이는 대부분의 노드가 하드디스크와 같은 2차 저장장치에 있을 때 일반적으로 일어난다. 각 내부 노드에 있는 자식 노드의 수를 최대화함으로써, 트리의 높이는 감소하며, 균형맞춤은 덜 일어나고, 효율은 증가하게 된다. 대개 이 값은 각 노드가 완전한 하나의 디스크 블록 혹은 2차 저장 장치에서의 유사한 크기를 차지하도록 정해진다.
- B-트리의 창시자인 루돌프 바이어는 'B'가 무엇을 의미하는지 따로 언급하지는 않았다. 가장 가능성 있는 대답은 리프 노드를 같은 높이에서 유지시켜주므로 균형잡혀있다(balanced)는 뜻에서의 'B'라는 것이다. '바이어(Bayer)'의 'B'를 나타낸다는 의견도, 혹은 그가 일했던 보잉 과학 연구소(Boeing Scientific Research Labs)에서의 'B'를 나타낸다는 의견도 있다.



### 참고

- [https://ko.wikipedia.org/wiki/B_%ED%8A%B8%EB%A6%AC](https://ko.wikipedia.org/wiki/B_트리)

