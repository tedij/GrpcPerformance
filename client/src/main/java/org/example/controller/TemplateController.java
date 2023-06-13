package org.example.controller;


import com.google.protobuf.Descriptors;
import data.TemplateModel;
import data.TemplateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.service.TemplateGrpcService;
import org.example.service.TemplateRestService;

import java.util.List;
import java.util.Map;

@RestController
public class TemplateController {

    @Autowired
    private TemplateGrpcService grpcService;

    @Autowired
    private TemplateRestService restService;

    @GetMapping(value = "rpc/template")
    public Map<Descriptors.FieldDescriptor, Object> getRpc(
            Map<String, Object> templateRequest
    ) {
        return grpcService.getTemplate();
    }

    @GetMapping(value = "rpc/templates")
    public List<Map<Descriptors.FieldDescriptor, Object>> getRpcTemplate(
            Map<String, Object> templateRequest
    ) {
        return grpcService.getTemplates();
    }

    @GetMapping(value = "rpc/templates-stream")
    public List<Map<Descriptors.FieldDescriptor, Object>> getRpcTemplateStream(
            Map<String, Object> templateRequest
    ) {
        return grpcService.getTemplatesStream();
    }

    @GetMapping(value = "rest/template")
    public Map<Descriptors.FieldDescriptor, Object>  getRest(
            Map<String, Object> templateRequest
    ) {
        return restService.getTemplate();
    }

    @GetMapping(value = "rest/templates")
    public List<TemplateModel> getRestTemplates(
            Map<String, Object> templateRequest
    ) {
        return restService.getTemplates();
    }
}
