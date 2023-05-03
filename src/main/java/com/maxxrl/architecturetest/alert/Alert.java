package com.maxxrl.architecturetest.alert;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Alert {
    private long id;
    private String alertMessage;

    public void enrichMessage(String message){
        this.alertMessage = message;
    }
}
