public class BaseCalClass{

    interface Operation {
        int operate(int a, int b);
    }

    public int calculate(int a, int b, Operation o) {
        System.out.println(o.toString());
        return o.operate(a,b);
    }
}
