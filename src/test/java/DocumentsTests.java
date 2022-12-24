import decorators.CachedDocument;
import decorators.Document;
import decorators.SmartDocument;
import decorators.TimedDocument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DocumentsTests {

    @Test
    public void testTimedDocument(){
        Document document = new SmartDocument("gs://testoop/Screenshot 2022-12-05 at 09.15.04.png");
        TimedDocument tdoc = new TimedDocument(document);
        Assertions.assertTrue(tdoc.timeForParsing()>0);
    }

    @Test
    public void testCachedDocument(){
        Document document = new SmartDocument("gs://testoop/Screenshot 2022-12-05 at 09.15.04.png");
        CachedDocument cdoc = new CachedDocument(document);

    }

}
