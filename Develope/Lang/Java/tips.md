# JAVA Tips

## Tables

- [1) Simple Array print](#1-simple-array-print)

- [2) Simple Number Radix Change](#2-simple-number-radix-change)

- [3) Manually Change Radix](#3-manually-change-radix)

---

### [1) Simple Array print](#1-simple-array-print)

```java
int[][] ary2d = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
```

1) for iteration

```java
for (int i = 0; i < ary2d.length; i++) {
    for (int j = 0; j < ary2d[i].length; j++) {
        System.out.print(ary2d[i][j] + " ");
    }
    System.out.println();
}
System.out.println();
```

```
1 2 3 
4 5 6 
7 8 9 
```

2) for each

```java
for (int[] holder : ary2d) {
    for (int item : holder) {
        System.out.print(item + " ");
    }
    System.out.println();
}
System.out.println();
```

```
1 2 3 
4 5 6 
7 8 9 
```

3) java.util.Arrays.deepToString(Object[])

```java
System.out.println(Arrays.deepToString(ary2d));
```

```
[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
```

---


### [2) Simple number radix change](#2-simple-number-radix-change)

- Use Integer method
    - Decimal to other radix string
        - Integer.toBinaryString(int i)
        - Integer.toOctalString(int i)
        - Integer.toHexString(int i)
    - Other radix string to Decimal
        - Integer.parseInt(String s, int radix)

- Decimal to Binary String

```java
int a = 10;
System.out.println(Integer.toBinaryString(a));
```

```
1010
```

- Decimal to Octal

```java
int b = 20;
System.out.println(Integer.toOctalString(b));
```

```
24
```

- Decimal to Hex

```java
int c = 30;
System.out.println(Integer.toHexString(c));
```

```
1e
```

- Binary String to Decimal

```java
String d = "00101";
System.out.println(Integer.parseInt(d, 2));
```

```
5
```

- Octal String to Decimal

```java
String e = "765";
System.out.println(Integer.parseInt(e, 8));
```

```
501
```

- Hex String to Decimal

```java
String f = "1de";
System.out.println(Integer.parseInt(f, 16));
```

```
478
```

---

### [3) Manually change radix](#3-manually-change-radix)

- Once you convert to string than you can go back to number using `Integer.parseInt(String s, int radix)`

- Convert

```java
int a1 = 120;
String a1bi = "";

while (a1 > 0) {
    a1bi = (a1 % 2) + a1bi;
    a1 /= 2;
}

System.out.println(a1bi);
```

```
1111000
```

- Convert and Reverse order

```java
int a2 = 120;
String a2bi = "";

while (a2 > 0) {
    a2bi = a2bi + (a2 % 2);
    a2 /= 2;
}

System.out.println(a2bi);
```