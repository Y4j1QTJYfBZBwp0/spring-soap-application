package com.example.soapcrud.endpoint;

import com.example.helloworld_ws.*;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Component
public class HelloWorldEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/helloworld-ws";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHelloRequest")
    @ResponsePayload
    public GetHelloResponse getHelloWorld(@RequestPayload GetHelloRequest request) {
        GetHelloResponse response = new GetHelloResponse();
        String name = request.getName();
        String greeting = "Hello " + name + "!";
        response.setGreeting(greeting);
        return response;
    }

}
