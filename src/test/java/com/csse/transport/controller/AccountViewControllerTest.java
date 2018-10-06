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
public class AccountViewControllerTest {

    private MockMvc mockMvc;
    @InjectMocks
   private AccountViewController accountViewController;


    @Before
    public void setUp() throws Exception {
        mockMvc= MockMvcBuilders.standaloneSetup(accountViewController).build();
    }

    @Test
    public void testaccountview() throws Exception{
        mockMvc.perform(
               MockMvcRequestBuilders.get("/accountview/getdata")
        ).andExpect(MockMvcResultMatchers.status().isOk());

    }
}