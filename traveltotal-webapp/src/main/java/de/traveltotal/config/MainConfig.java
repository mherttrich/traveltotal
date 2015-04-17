package de.traveltotal.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"de.traveltotal"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*test.*"))
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@EnableTransactionManagement
@PropertySource("${props.path:classpath:}/application.properties")
@Import({DatabaseConfig.class})
public class MainConfig {
}
