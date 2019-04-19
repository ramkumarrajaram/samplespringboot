package com.ram.sample.sampleappparent.development.web;

import com.ram.sample.sampleappparent.development.SampleAppService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/sample")
@AllArgsConstructor
public class SampleAppController {


    private ModelMapper modelMapper;
    private SampleAppService sampleAppService;

    @PostMapping("/search")
    public String printSomething(
            HttpServletRequest servletRequest,
            @RequestBody SampleAppRequest sampleAppRequest,
            HttpServletResponse response) {

        boolean aderaDetails = sampleAppService.getAderaDetails();

        response.setContentType("application/json");

        return modelMapper.map(aderaDetails, String.class);
    }
}
