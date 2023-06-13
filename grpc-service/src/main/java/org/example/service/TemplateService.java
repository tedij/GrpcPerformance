package org.example.service;


import data.Data;
import data.TemplateRequest;
import data.TemplateResponse;
import data.TemplateServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class TemplateService extends TemplateServiceGrpc.TemplateServiceImplBase {

    public void getTemplate(data.TemplateRequest request, StreamObserver<TemplateResponse> responseObserver) {
        // manggil repostory
        // logic bisnis
        responseObserver.onNext(Data.getTemplate());
        responseObserver.onCompleted();
    }

    public void getTemplates(data.TemplateRequest request, StreamObserver<TemplateResponse> responseObserver) {
        Data.getTemplates().forEach(responseObserver::onNext);
        responseObserver.onCompleted();
    }
}
