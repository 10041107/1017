package main.java.com.ohgiraffers.section04.uses2;

public class FileSaveProvider implements SaveProvider{
    @Override
    public boolean save(String data) {
        // 파일을 저장하는 경로가 변경되는 경우
        return false;
    }
}
