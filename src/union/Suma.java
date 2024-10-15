package union;

public class Suma implements Union{


    @Override
    public String union(int x, int y) {
        int suma = x+y;
       return suma+"";
    }
}
