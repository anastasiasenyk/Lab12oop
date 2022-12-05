package decorators;

import decorators.Document;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://testoop/Screenshot 2022-12-05 at 09.15.04.png");
        document = TimedDocument(document);
//        document = CashedDocument(document);
        System.out.println(document.parse());


    }

    private static Document CashedDocument(Document document) {
//        document;
        return document;
    }

    private static Document TimedDocument(Document document) {
        document.parse();
        return document;
    }
}
