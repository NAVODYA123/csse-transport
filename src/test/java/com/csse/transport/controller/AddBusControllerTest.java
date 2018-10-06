package com.csse.transport.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
public class AddBusControllerTest {
    private MockMvc mockMvc;
    @InjectMocks
    private AddBusController addBusController;

    @Before
    public void setUp() throws Exception {
        mockMvc= MockMvcBuilders.standaloneSetup(addBusController).build();

    }

    @Test
    public void getABuses() throws Exception{
        mockMvc.perform(
                MockMvcRequestBuilders.get("/Bus_details/allbus")
        ).andExpect(MockMvcResultMatchers.status().isOk());
    }
}