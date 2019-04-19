package com.ram.sample.sampleappparent.development.web;

import com.ram.sample.sampleappparent.BaseMockMvcIntegrationTest;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


public class SampleAppControllerTest extends BaseMockMvcIntegrationTest {

    @Test
    public void printSomeThing_returnsString() throws Exception {
        mvc
                .perform(
                        post(
                                "/sample/search")
                                .contentType(MediaType.APPLICATION_JSON)
                                //language=json
                                .content("{\n" +
                                        "  \"request\" : {\n" +
                                        "    \"name\" : \"ADERA\",\n" +
                                        "    \"companyType\" : \"FINTECH\",\n" +
                                        "    \"numberOfEmployees\" : 25\n" +
                                        "  }\n" +
                                        "}")
                )

                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").value(true));
    }
}