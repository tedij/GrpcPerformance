package org.example.service;

import com.google.protobuf.Descriptors;
import data.TemplateModel;
import data.TemplateRequest;
import data.TemplateResponse;
import data.TemplateServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Service
public class TemplateRestService {

    @Value("${rest.url}")
    private String baseUrl;

    private RestTemplate webClient;

    @PostConstruct
    private void init(){
        this.webClient = new RestTemplate();
    }


    public Map<Descriptors.FieldDescriptor, Object> getTemplate() {
        return webClient.getForObject(baseUrl, Map.class);
    }

    public List<TemplateModel> getTemplates() {
        return webClient.getForObject(baseUrl + "s", List.class);
    }

}
