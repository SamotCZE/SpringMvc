package spittr.config;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import spittr.data.SpittleRepository;
import spittr.data.SpittleRepositoryImpl;

/**
 * Created by hudectom on 4.4.2015.
 */
@Configuration
@ComponentScan(basePackages={"spittr"},
        excludeFilters={
                @Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
        })
public class RootConfig {

    @Bean
    @Primary
    SpittleRepository spittleRepositoryIml() {
        return new SpittleRepositoryImpl();
    }

}
