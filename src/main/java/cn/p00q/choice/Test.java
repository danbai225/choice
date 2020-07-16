package cn.p00q.choice;

/**
 * @program: swich
 * @description: 测试
 * @author: DanBai
 * @create: 2020-07-16 16:05
 **/
public class Test {
    enum Color {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;
        int y;
        y = a < b ? c : d > a ? b : c;
        new Choice(true).add(1L, () -> {
            System.out.println("这里是1");
        }).add(a < b ? c : d > a ? b : c, () -> {
            System.out.println("这里是2");
        }).add(3.0f, () -> {
            System.out.println("这里是3");
        }).add(Color.BLUE, () -> {
            System.out.println("这里是4");
        }).add(() -> {
            System.out.println("多个匹配");
        }, 1, 2, 3, 4, 5, 6, 7, 8, 9).Default(() -> {
            System.out.println("这里是默认方法");
        }).execute(4);
    }
}
