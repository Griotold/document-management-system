package com.griotold.documentmanagementsystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ImageImporter 등록
 * */
public class DocumentManagementSystem {
    private final Map<String, Importer> extensionToImporter = new HashMap<>();

    public DocumentManagementSystem() {
        extensionToImporter.put("jpa", new ImageImporter());
        // todo LetterImporter, ReportImporter 설계하고 등록해줘야 함.
    }

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
