public class Context {

    private Sequence sequence;

    Context(Sequence sequence) {
        this.sequence = sequence;
    }

    public void execute(int value) {
        long result = sequence.calculate(value);
        System.out.println("sequence = [" + sequence + "], value = [" + value + "], result = [" + result + "]");

    }
}
