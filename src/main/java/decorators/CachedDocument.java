package decorators;

public class CachedDocument implements Document{
    Document document;

    public CachedDocument(Document document) {
        this.document = document;
    }

    @Override
    public String parse() {
        document.parse();
        return null;
    }

    

}
