package com.swagger.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RequestMessage {
    @ApiModelProperty(notes = "item1 description")
    private String item1;
    @ApiModelProperty(notes = "item2 description")
    private String item2;
}
