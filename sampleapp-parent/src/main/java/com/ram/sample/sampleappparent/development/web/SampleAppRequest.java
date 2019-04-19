package com.ram.sample.sampleappparent.development.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SampleAppRequest {

    private RequestDetail request;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RequestDetail {

        private String name;
        private String companyType;
        private String numberOfEmployees;
    }
}
