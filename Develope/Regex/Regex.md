# 정규표현식 관련 팁

- Java 8 기준
- [테스트 사이트](https://regex101.com/)

## 목차

- [1) 문자열에서 특정 길이만 골라내기](#1-문자열에서-특정-길이만-골라내기-문자열에서-특정-길이만-골라내기)

- [2) 특정 자리수만 남기고 변환](#2-특정-자리수만-남기고-변환)

## [1) 문자열에서 특정 길이만 골라내기](#1-문자열에서-특정-길이만-골라내기-문자열에서-특정-길이만-골라내기)

- [link](https://regex101.com/r/BfDhDc/1)
- 예를 들어 범위(range)가 아닌 특정 길이(specific length)만 골라내는 법

```
/^(?:.{4}|.{6})$
```

![특정길이문자열골라내기](Image/PIC_001_%ED%8A%B9%EC%A0%95%EA%B8%B8%EC%9D%B4%EB%AC%B8%EC%9E%90%EC%97%B4%EA%B3%A8%EB%9D%BC%EB%82%B4%EA%B8%B0.png)

<details>
<summary>자세한 설명</summary>


- ``` ^ ``` 문자열 시작 지칭
- Non Capturing 그룹 사용 ``` (?:) ``` [자세한 내용은 여기](https://stackoverflow.com/questions/3512471/what-is-a-non-capturing-group-in-regular-expressions)
- ``` . ``` 특정 문자 대처
- ``` {n} ``` 횟수 반복
- ``` | ``` or
- ``` $ ``` 문자열 끝 지칭

</details>


## [2) 특정 자리수만 남기고 변환](#2-특정-자리수만-남기고-변환)

- [link](https://regex101.com/r/zLmEtm/1)
- 예를 들어 뒤에 4자리만 숫자로 남기고 나머지를 *로 바꾼다고 했을 때

```
/.(?=.{4})
```

![특정자리수1](Image/%EC%9E%90PIC_002_01_%ED%8A%B9%EC%A0%95%EC%9E%90%EB%A6%AC%EC%88%98%EB%A7%8C%EB%82%A8%EA%B8%B0%EA%B8%B0.png)

![특정자리수2](Image/%EC%9E%90PIC_002_02_%ED%8A%B9%EC%A0%95%EC%9E%90%EB%A6%AC%EC%88%98%EB%A7%8C%EB%82%A8%EA%B8%B0%EA%B8%B0.png)

<details>
<summary>자세한 설명</summary>


- ``` . ``` 아무 문자 대응
- Positive Lookahead ``` (?=) ``` 사용 [자세한 설명](https://elvanov.com/2388)
- ``` . ``` 특정 문자 대처
- ``` {n} ``` 횟수 반복

</details>
