
package designpatterntshirtModel;

public class Tshirt {
    private Color color;
    private Fabric fabric;
    private Size size;
    private PaymentMethod paymentMethod;

    public Tshirt(Color color, Fabric fabric, Size size, PaymentMethod paymentMethod) {
        this.color = color;
        this.fabric = fabric;
        this.size = size;
        this.paymentMethod = paymentMethod;
    }

    
    public Tshirt(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public void executeCreateTshirtWithPaymentmethod(){
    paymentMethod.createTshirtWithPaymentMethod(color, fabric, size);
   
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    }

