

import com.mongodb.MongoClientOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoDbSettings {
    static class OptionsConfig {

        @Bean
        public MongoClientOptions mongoOptions() {
            return MongoClientOptions.builder()
                    .socketTimeout()
                    .connectTimeout()
                    .heartbeatSocketTimeo0)
                    .heartbea2000)
                    .build;
        }

    }
}
