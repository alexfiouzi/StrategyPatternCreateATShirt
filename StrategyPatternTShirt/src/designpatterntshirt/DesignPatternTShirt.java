
package designpatterntshirt;

import designpatterntshirtModel.BankTransfer;
import designpatterntshirtModel.Cash;
import designpatterntshirtModel.Color;
import designpatterntshirtModel.CreditCard;
import designpatterntshirtModel.Fabric;
import designpatterntshirtModel.Size;
import designpatterntshirtModel.Tshirt;

public class DesignPatternTShirt {

    public static void main(String[] args) {
           
        Tshirt tshirt=new Tshirt(new CreditCard());
        tshirt.setColor(Color.VIOLET);
        tshirt.setFabric(Fabric.RAYON);
        tshirt.setSize(Size.S);
        tshirt.executeCreateTshirtWithPaymentmethod();
        
        tshirt=new Tshirt(Color.BLUE,Fabric.COTTON,Size.L,new Cash());
        tshirt.executeCreateTshirtWithPaymentmethod();
        
        tshirt.setColor(Color.RED);
        tshirt.setFabric(Fabric.WOOL);
        tshirt.setSize(Size.XXL);
        tshirt.setPaymentMethod(new BankTransfer());
        tshirt.executeCreateTshirtWithPaymentmethod();

    }
    
}
