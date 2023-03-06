package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    private static final String CHARSET = "UTF-8";
    private static final String FILE_NAME = "ltos.txt";
    private static final String URL = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=";

    public static void main(String[] args) {

        for (int i = 1; i <= 1000; ++i) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
                URL url = new URL(URL + i);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                String content = new java.util.Scanner(conn.getInputStream(), CHARSET).useDelimiter("\\A").next();
                writer.write(content);
                writer.newLine();

                conn.disconnect();

                writer.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
