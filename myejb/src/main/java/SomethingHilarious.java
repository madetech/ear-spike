import javax.ejb.*;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.apache.log4j.Logger;

@MessageDriven(name = "something", activationConfig = {
  @ActivationConfigProperty(propertyName = "destination", propertyValue = "JMS/myActivationSpec"),
  @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")

})
public class SomethingHilarious implements MessageDrivenBean, MessageListener {
  final static Logger logger = Logger.getLogger(SomethingHilarious.class);

  public SomethingHilarious() {
    logger.error("Oh NOOOO!");
  }

  @Override
  public void setMessageDrivenContext(MessageDrivenContext ctx) throws EJBException {

  }

  @Override
  public void ejbRemove() throws EJBException {

  }

  @Override
  public void onMessage(Message message) {

  }
}
