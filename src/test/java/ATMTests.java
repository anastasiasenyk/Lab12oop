import chainofresponsibility.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ATMTests {
    private Handler handler;

    @BeforeEach
    public void init() {
        this.handler = new Handler50();
        Handler handler20 = new Handler20();
        Handler handler5 = new Handler5();
        handler.setNext(handler20);
        handler20.setNext(handler5);
    }

    @Test
    public void testCorrectInputs() {
        handler.process(150);
        handler.process(100);
        handler.process(125);
        handler.process(5);
        handler.process(0);
        handler.process(15);
        handler.process(30);
        handler.process(1000);
    }

    @Test public void testWrongInputs() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{handler.process(9);});
        Assertions.assertThrows(IllegalArgumentException.class, ()->{handler.process(-5);});
        Assertions.assertThrows(IllegalArgumentException.class, ()->{handler.process(26);});
        Assertions.assertThrows(IllegalArgumentException.class, ()->{handler.process(101);});

    }
}
