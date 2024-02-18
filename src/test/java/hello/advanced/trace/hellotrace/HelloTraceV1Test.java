package hello.advanced.trace.hellotrace;

import hello.advanced.app.v0.OrderRepositoryV0;
import hello.advanced.app.v0.OrderServiceV0;
import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTraceV1Test {

    @Test
    void begin_end(){
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.end(status);

    }

    @Test
    void bigin_exception(){
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.exeption(status, new IllegalStateException());
    }



}