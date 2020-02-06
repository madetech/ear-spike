import javax.ejb.*;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;

import java.io.PrintStream;

@MessageDriven(name = "something", activationConfig = {
//  @ActivationConfigProperty(propertyName = "destination", propertyValue = "JMS/HearingOutcomeInputActivationSpec"),
  @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")

})
public class SomethingHilarious implements MessageDrivenBean, MessageListener {
  final static Logger logger = Logger.getLogger(SomethingHilarious.class);

  public SomethingHilarious() {
    BasicConfigurator.configure();
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
    try {
      logger.info(message.getBody(String.class));
    } catch (JMSException e) {
      e.printStackTrace();
    }

  }
}
