package spittr.config;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import spittr.Spittle;
import spittr.data.SpittleRepository;
import spittr.data.SpittleRepositoryImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        List<Spittle> spittleList = new ArrayList<Spittle>();

        for (int i = 0; i < 10; i++) {
            Spittle spittle = new Spittle("message " + i, new Date(), 23.56, 15.34);
            spittle.setId((long)i);
            spittleList.add(spittle);
        }
        return new SpittleRepositoryImpl(spittleList);
    }

}
