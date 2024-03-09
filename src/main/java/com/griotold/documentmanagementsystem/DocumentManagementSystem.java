package com.griotold.documentmanagementsystem;

import java.util.List;

/**
 * 초기 스냅샷 - 여기서부터 단계적으로 리팩토링
 * */
public class DocumentManagementSystem {
    void importFile(String path) {
        // 확장자 추출
        String extension = extractExtension(path);
        switch(extension) {
            case "letter":
                // 우편물 임포트 코드
                break;

            case "report":
                // 레포트 임포트 코드
                break;

            case "jpg":
                // 이미지 임포트 코드
                break;

            default:
                throw new UnknownFileTypeException("For file: " + path);
        }
    }

    private String extractExtension(String path) {
        String extension = "";

        int lastIndexOfDot = path.lastIndexOf(".");
        if (lastIndexOfDot != -1) {
            extension = path.substring(lastIndexOfDot + 1);
        }
        return extension;
    }

    List<Document> contents() { return null;}
}
