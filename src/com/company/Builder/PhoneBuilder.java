package com.company.Builder;

public class PhoneBuilder {

    int size;
    String Name;
    String model;
    String processor;
    String ram;


    public PhoneBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public PhoneBuilder setName(String name) {
        this.Name = name;
        return this;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public Phone getInstance(){
        return new Phone(size, Name, model,processor,ram);
    }
}
