package union;

public class Concatenar implements Union{
    @Override
    public String union(int x, int y) {

        return String.valueOf(x)+String.valueOf(y);
    }
}
