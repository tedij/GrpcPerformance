package org.example.service;

import com.google.protobuf.Descriptors;
import data.TemplateRequest;
import data.TemplateResponse;
import data.TemplateServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class TemplateGrpcService {

    @GrpcClient("grpc-template-service")
    TemplateServiceGrpc.TemplateServiceBlockingStub templateServiceBlockingStub;

    @GrpcClient("grpc-chat-service")
    TemplateServiceGrpc.TemplateServiceStub templateServiceStub;

    public Map<Descriptors.FieldDescriptor, Object> getTemplate() {
        return templateServiceBlockingStub.getTemplate(TemplateRequest.newBuilder().setId(1).build()).getAllFields();
    }

    public List<Map<Descriptors.FieldDescriptor, Object>> getTemplates() {
        List<Map<Descriptors.FieldDescriptor, Object>> result = new ArrayList<>();
        TemplateRequest request = TemplateRequest.newBuilder().setId(1).build();
        Iterator<TemplateResponse> templateResponses = templateServiceBlockingStub.getTemplates(request);

        while (templateResponses.hasNext()) {
            result.add(templateResponses.next().getAllFields());
        }
        return result;
    }


    public List<Map<Descriptors.FieldDescriptor, Object>> getTemplatesStream() {
        List<Map<Descriptors.FieldDescriptor, Object>> result = new ArrayList<>();
        templateServiceStub.getTemplates(
                TemplateRequest.newBuilder().setId(1).build(), new StreamObserver<TemplateResponse>() {
                    @Override
                    public void onNext(TemplateResponse templateResponse) {
                        result.add(templateResponse.getAllFields());
                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onCompleted() {

                    }
                });

        return result;
    }
}
