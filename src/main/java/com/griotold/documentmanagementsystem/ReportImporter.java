package com.griotold.documentmanagementsystem;

import java.io.File;
import java.io.IOException;
import java.util.Map;
// todo 맞는 답안인지 확인 필요
public class ReportImporter implements Importer{

    private static final String NAME_PREFIX = "Patient: ";
    @Override
    public Document importFile(File file) throws IOException {
        final TextFile textFile = new TextFile(file);

        textFile.addLineSuffix(NAME_PREFIX, Attributes.PATIENT);

        textFile.addLines(2, String::isEmpty, Attributes.BODY);

        Map<String, String> attributes = textFile.getAttributes();
        attributes.put(Attributes.TYPE, "REPORT");
        return new Document(null);
    }
}
