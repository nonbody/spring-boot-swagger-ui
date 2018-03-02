package com.swagger.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ResponseMessage {
    @ApiModelProperty(notes = "my code description")
    private String code;
    @ApiModelProperty(notes = "my message description")
    private String message;

    public ResponseMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
