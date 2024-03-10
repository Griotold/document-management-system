package com.griotold.documentmanagementsystem;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class DocumentManagementSystemTest {

    private static final String RESOURCES
            = "src" + File.separator + "test" + File.separator + "resources" + File.separator;
    private static final String LETTER = RESOURCES + "patient.letter";
    private static final String REPORT = RESOURCES + "patient.report";
    private static final String XRAY = RESOURCES + "xray.jpg";
    private static final String INVOICE = RESOURCES + "patient.invoice";
    private static final String JOE_BLOGGS = RESOURCES + "Joe Bloggs";

    DocumentManagementSystem system = new DocumentManagementSystem();

    /**
     * 좋은 테스트 이름은 동작을 묘사한다.
     * 도메인 용어 사용, 자연어 사용, 서술적
     * */
    @Test
    void shouldImportFile() throws Exception {
        // given
        system.importFile("letter");

        // when
        // 행위

        // then
        // 결과
    }

}