package decorators;

public class TimedDocument implements Document{
    Document document;

    public TimedDocument(Document document) {
        this.document = document;
    }

    @Override
    public String parse() {
        document.parse();
        return null;
    }

    public long timeForParsing(){
        long startTime = System.nanoTime();
        parse();
        return (System.nanoTime() - startTime)/ 1_000_000_000;
    }


}
