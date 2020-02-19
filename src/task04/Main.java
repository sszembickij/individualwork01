/*4. Есть документ со списком URL:
https://drive.google.com/open?id=1wVBKKxpTKvWwuCzqY1cVXCQZYCsdCXTl
Вывести топ 10 доменов которые встречаются чаще всего.
В документе могут встречатся пустые и недопустимые строки.*/

package task04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Main {
    private static final String URL_REGEX;

    static {
        URL_REGEX = "^(http:/\\/|https:\\/\\/)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?$";
    }

    private static Map<String, Integer> domenList = new HashMap<>();

    public static void main(String[] args) {
        String domen;
        String nameFale = "urls.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(nameFale))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                if (currentLine.contains("://")) {
                    domen = currentLine.substring(0, currentLine.indexOf('/', 3)).trim();
                } else if (currentLine.contains("/")) {
                    domen = currentLine.substring(0, currentLine.indexOf('/')).trim();
                } else {
                    domen = currentLine.trim();
                }

                if (domen.matches(URL_REGEX)) {
                    if (domenList.containsKey(domen)) {
                        domenList.put(domen, domenList.get(domen) + 1);
                    } else {
                        domenList.put(domen, 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Integer> entry : domenList.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
