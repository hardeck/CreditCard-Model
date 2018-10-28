package pl.jhard.creditcard;

import org.junit.Assert;
import org.junit.Test;
public class CreditCardTest {
    
    @Test
    public void allowAssignLimit() {
        CreditCard card = new CreditCard();
        card.assignLimit(2000);
        Assert.assertTrue(card.getBallance() == 2000);
    }
}