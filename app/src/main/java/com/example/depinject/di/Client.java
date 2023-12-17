package com.example.depinject.di;

public class Client {

    private final Service1 service1;
    private  Service2 service2;

    // Constructor Injection - *best Injection*
    public Client(Service1 service1) {
        this.service1 = service1;
    }

    // Method Injection
    public Service2 getService2() {
        return service2;
    }

    // Field Injection
    public Service3 service3;
    public void doAnything(){
        service1.doSomething();
        service2.doSomething();
        service3.doSomething();

    }

}
