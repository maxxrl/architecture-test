package com.maxxrl.architecturetest.investigation;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Investigation {
    private long id;
    private String investigationMessage;

    public void enrichMessage(String message){
        this.investigationMessage = message;
    }
}
