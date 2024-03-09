package com.griotold.documentmanagementsystem;

import java.util.Map;

/**
 * 문서를 HashMap으로 관리할 수도 있지만 
 * 클래스로 만들어서 관리
 * 그냥 클래스가 아니라 불변 클래스로 관리!
 * */
public class Document {
    private final Map<String, String> attributes;

    // public 생성자가 아닌 것에 주의
    Document(final Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String getAttribute(final String attributeName) {
        return attributes.get(attributeName);
    }
    
}
