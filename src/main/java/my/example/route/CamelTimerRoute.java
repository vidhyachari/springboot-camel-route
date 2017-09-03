package my.example.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
class CamelTimerRoute extends RouteBuilder {
	    @Override
	    public void configure() throws Exception {
	        from("timer://foo?period=4000").process(new Processor() {
	            public void process(Exchange exchange) throws Exception {
	                System.out.println("Hello Camel Route :"
	                        + System.currentTimeMillis());
	            }
	        });
	    }
	}