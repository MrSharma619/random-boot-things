package com.example.random_boot_things;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Endpoint(id = "allpts")
@Component
public class CustomEndpoint {

    @ReadOperation
    public String readOp(){
        return "read from allpts";
    }

    @WriteOperation
    public String writeOp(String val){
        return "write from allpts with value: " + val;
    }

}
