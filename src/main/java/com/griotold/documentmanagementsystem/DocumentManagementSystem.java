package com.griotold.documentmanagementsystem;

import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;

/**
 * ImageImporter 등록
 * */
public class DocumentManagementSystem {
    private final Map<String, Importer> extensionToImporter = new HashMap<>();

    public DocumentManagementSystem() {
        extensionToImporter.put("letter", new LetterImporter());
        extensionToImporter.put("report", new ReportImporter());
        extensionToImporter.put("jpg", new ImageImporter());
        extensionToImporter.put("invoice", new InvoiceImporter());
    }
    // todo 맞는 답안인지 확인 필요
    void importFile(String path) throws IOException {
        // 확장자 추출
        String extension = extractExtension(path);
        Importer importer = extensionToImporter.get(extension);
        importer.importFile(new File(path));
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
