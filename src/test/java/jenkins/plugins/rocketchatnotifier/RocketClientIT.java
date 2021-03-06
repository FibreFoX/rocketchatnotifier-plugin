package jenkins.plugins.rocketchatnotifier;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by mreinhardt on 27.12.16.
 */
public class RocketClientIT {


  private RocketClient client;

  @Before
  public void setup() throws Exception {
    this.client = new RocketClientImpl("http://localhost:4443/", "admin", "supersecret", "general"); // TODO read from env
  }

  @Test
  public void shouldSendMessage() throws Exception {
    this.client.publish("test");
  }
}
