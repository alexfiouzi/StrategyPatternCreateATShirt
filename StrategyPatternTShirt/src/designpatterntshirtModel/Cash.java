
package designpatterntshirtModel;


public class Cash implements PaymentMethod {


    @Override
    public void createTshirtWithPaymentMethod(Color c, Fabric f, Size s) {
        System.out.println("The Tshirt you have ordered has color "+c.name()+" with price "+c.i+"$,size "+s.name()+" with price "
                +s.i+"$ and fabric "+f.name()+" with price "+f.i+
                "$"); 
        System.out.println("The total price is "+(c.i+f.i+s.i)+"$ with Cash");
    }
    
}
