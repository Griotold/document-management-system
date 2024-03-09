package com.griotold.documentmanagementsystem;

import java.io.File;
import java.io.IOException;
/**
 * strong type : 강한 형식의 원칙
 * String 대신에 File 을 파라미터로 받기 -> 오류가 발생할 범위가 줄어든다.
 * */
public interface Importer {
    Document importFile(File file) throws IOException;
}
