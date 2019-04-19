package com.ram.sample.sampleappparent.development;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SampleAppServiceTest {

    @InjectMocks
    private SampleAppService subject;

    @Test
    public void getDetails_returnsDetails() {
        boolean actual = subject.getAderaDetails();

        assertThat(actual).isEqualTo(true);
    }
}