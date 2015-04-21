package de.traveltotal.config;

import de.traveltotal.service.UserRepository;
import de.traveltotal.service.UserRepositoryMock;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.*;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

@Configuration
@ComponentScan(basePackages = {"de.traveltotal"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*test.*"))
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@EnableTransactionManagement
@PropertySource("${props.path:classpath:}/application.properties")
@Import({DatabaseConfig.class})
public class MainConfig implements ResourceLoaderAware {


    private ResourceLoader resourceLoader;

    private static final String USER_TEST_DATA_FILE_PATH = "classpath:user-test-data.csv";

    @Bean
    public Resource testDataResource() {
        return resourceLoader.getResource(USER_TEST_DATA_FILE_PATH);
    }

    @Bean
    public UserRepository userRepository(Resource testdata) throws IOException {
        //return real Repo later
        return new UserRepositoryMock(testdata);
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

}
