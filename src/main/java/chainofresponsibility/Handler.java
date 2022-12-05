package chainofresponsibility;

import lombok.Setter;

public class Handler {
    @Setter
    private Handler next;
    private final int quantity;

    public Handler(int quantity) {
        this.quantity = quantity;
    }

    public  void  process(int amount) {
        if (amount % quantity > 0){
            throw new IllegalArgumentException();
        } else if (next != null) {
            next.process(amount % quantity);
        }
        
        System.out.println(amount / quantity + " * " + quantity);

    }

}
