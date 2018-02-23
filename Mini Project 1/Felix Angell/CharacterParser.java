public class CharacterParser {

    private String input;
    private char[] raw;

    public int pos;

    public CharacterParser(String input) {
        this.input = input;
        this.raw = input.toCharArray();
        this.pos = 0;
    }

    public boolean hasNext() {
        return pos < raw.length;
    }

    public char peek() { return peek(0); }
    public char peek(int offs) {
        return raw[pos + offs];
    }

    public char consume() {
        char curr = peek();
        pos++;
        return curr;
    }

    public void jumpTo(int pos) {
        this.pos = pos;
    }

}
