package it.unimib.devproc.assignmentone;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@Category(IntegrationTest.class)
public class MainControllerTest {

    // @Autowired
    MockMvc mockMvc;

    @Autowired
    protected WebApplicationContext wac;

    @Autowired

    MainController mainController;
    
    @Before
    public void setup() throws Exception {
    	mockMvc = standaloneSetup(this.mainController).build();
    }
    
    @Test
    public void requestsTests() throws Exception {
    	mockMvc.perform(post("/demo/add").contentType(MediaType.APPLICATION_JSON).content("{'name':'test','email':'test@mail.it'}")).andReturn();
        MvcResult result = mockMvc.perform(get("/demo/all").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
        assertEquals("[{\"id\":1,\"name\":\"test\",\"email\":\"test@mail.it\"}]", result.getResponse().getContentAsString());
    }
	
}
