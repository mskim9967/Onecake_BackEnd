package refresh.onecake.modelmapper.adapter.infra

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ModelMapperConfig {

    @Bean
    fun modelMapper() = ModelMapper().apply {
        configuration.isFieldMatchingEnabled = true
        configuration.fieldAccessLevel = org.modelmapper.config.Configuration.AccessLevel.PRIVATE
    }

}