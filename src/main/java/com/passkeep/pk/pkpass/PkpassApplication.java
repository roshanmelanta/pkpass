package com.passkeep.pk.pkpass;

import java.util.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PkpassApplication {

  public static void main(String[] args) {
    var application = new SpringApplication(PkpassApplication.class);
    Properties properties = new Properties();
    properties.setProperty("spring.main.banner-mode", "off");
    //properties.setProperty("logging.pattern.console", "");
    application.setDefaultProperties(properties);
    application.run(args);
  }

}
