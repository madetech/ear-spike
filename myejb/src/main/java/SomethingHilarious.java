import javax.ejb.*;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;

@MessageDriven(name = "something", activationConfig = {
//  @ActivationConfigProperty(propertyName = "destination", propertyValue = "JMS/HearingOutcomeInputActivationSpec"),
  @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")

})
public class SomethingHilarious implements MessageDrivenBean, MessageListener {
  final static Logger logger = Logger.getLogger(SomethingHilarious.class);

  public SomethingHilarious() {
    logger.addAppender(new ConsoleAppender());
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
    logger.error("Oh DEAR!");

  }
}
