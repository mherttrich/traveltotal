package de.traveltotal.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

@Configuration
@ComponentScan(basePackages = {"de.traveltotal"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*test.*"))
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@EnableTransactionManagement
@PropertySource("${props.path:classpath:}/application.properties")
@Import({DatabaseConfig.class})
public class MainConfig implements ResourceLoaderAware {
     private static final String USER_TEST_DATA_FILE_PATH = "classpath:user-test-data.txt";
     
    @Bean
    public Resource userTestDataResource() {
        return resourceLoader.getResource(USER_TEST_DATA_FILE_PATH);
    }
    
        
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

}
