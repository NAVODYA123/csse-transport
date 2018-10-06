package com.csse.transport.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class PassengerControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private PassengerController passengerController;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(passengerController).build();
    }

    @Test
    public void getPassengersByPid() throws Exception{
        mockMvc.perform(
                MockMvcRequestBuilders.get("/passenger/getSpecPassenger?pid=a")
        ).andExpect(MockMvcResultMatchers.status().isOk());
    }
}