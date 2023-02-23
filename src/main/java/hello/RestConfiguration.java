package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class RestConfiguration {

    @Bean
    public CorsFilter corsFilter() {

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        configllowCredentials(rue); // you USUALLY want this
        config.addAllowedOrigin(;
        configAllowedHeader("*");
        config.addAllowedMethod("*");
        confierCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
