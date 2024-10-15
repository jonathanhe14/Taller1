package writer;

public class NiceWriterImpl implements Writer{
    @Override
    public void writer(String s) {
        System.out.println("The String is " + s);
    }
}
