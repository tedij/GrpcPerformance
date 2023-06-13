package org.example.controller;


import com.google.protobuf.Descriptors;
import data.Data;
import data.TemplateModel;
import data.TemplateResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TemplateController {


    @GetMapping(value = "template")
    public  Map<Descriptors.FieldDescriptor, Object> getSingle(
            Map<String, Object> templateRequest
    ) {
        return Data.getTemplate().getAllFields();
    }

    @GetMapping(value = "templates")
    public List<TemplateModel> getList(
            Map<String, Object> templateRequest
    ) {
        return Data.getTemplatesModel();
    }
}
