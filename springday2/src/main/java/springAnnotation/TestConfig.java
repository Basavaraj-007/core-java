package springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//rather than xml file to configure spring bean we are using TestConfig class to configure beans.
@Configuration
public class TestConfig {

	
	
		
		@Bean("XUV700")
		public Engine getEngine() {
			
			Engine engine = new Engine();
			engine.setModel("2022");
			engine.setHorsepower("7000");
			
			
			return engine;
		}
		@Bean
		public Car getCar() {
			
		return new Car();	
		}
	}


