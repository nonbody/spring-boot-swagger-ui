package com.swagger.controller;

import com.swagger.bean.RequestMessage;
import com.swagger.bean.ResponseMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "RestfulController and my description")
public class RestfulController {

    @ApiOperation(value = "message restful and my description")
    @GetMapping("message")
    public ResponseMessage message(){
        return new ResponseMessage("hello","world");
    }

    @ApiOperation(value = "postdata restful and my description")
    @PostMapping("postdata")
    public ResponseMessage postdata(@RequestBody RequestMessage requestMessage){
        return new ResponseMessage("hello",requestMessage.toString());
    }

}
