package com.company.Builder;

public class PhoneClient {

    public static void main(String[] args) {

        Phone phone = new PhoneBuilder().
                setName("Samsung").
                setSize(20).
                getInstance();

        System.out.println(phone.size);
    }
}
