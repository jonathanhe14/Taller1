package writer;

public class SimpleWriterImpl implements Writer{
    @Override
    public void writer(String s) {
        System.out.println("+++++-->" + s);
    }
}
