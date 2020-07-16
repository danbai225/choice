# choice

一个类似switch的选择器。支持表达式和多选择。

# 用法

```
int a = 1, b = 2, c = 3, d = 4;
        //true表示支持表达式
        new Choice(true).add(1L, () -> {
            System.out.println("这里是1");
        }).add(a < b ? c : d > a ? b : c, () -> {
            System.out.println("这里是2");
        }).add(3.0f, () -> {
            System.out.println("这里是3");
        }).add(Color.BLUE, () -> {
            System.out.println("这里是4");
        }).add(() -> {
  //方法在前可支持多个匹配值
            System.out.println("多个匹配");
        }, 1, 2, 3, 4, 5, 6, 7, 8, 9).Default(() -> {
            System.out.println("这里是默认方法");
        }).execute(4);
```
