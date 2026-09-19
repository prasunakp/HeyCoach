package stacks;

public class TestCustomStack {
    public static void main(String[] args){
        CustomStack cs = new CustomStack(3);
        cs.push(1);
        cs.push(2);
        cs.pop();
        cs.push(2);
        cs.push(3);
        cs.push(4);

        cs.increment(5,100);
        cs.increment(2,100);

    }
}
