package com.passkeep.pk.pkpass.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.passkeep.pk.pkpass")
@EntityScan("com.passkeep.pk.pkpass")
public class ConfigJpaRepo {

}
