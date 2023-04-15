package com.microservices.urlservicesclient_01.model;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Client01 {
    private String environment;
    private String dataTransfer;
}
