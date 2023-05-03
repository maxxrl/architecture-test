package com.maxxrl.architecturetest.notification;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Notification {
    private Long id;
    private String message;
}
