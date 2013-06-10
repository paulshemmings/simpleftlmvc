package com.razor.controllers;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;

import com.razor.utils.TemplateHelper;

@SuppressWarnings("serial")
public class HomeController extends Controller {
    
    public static final String ctrlName = "/home";
    
    public void index() throws IOException, ServletException
    {
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("signedrequest","example signed request");
        TemplateHelper.callTemplate(configuration,response, ctrlName + "/index.ftl",root);        
    }
    
}