package kata5;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wwwam
 */




public class MailListReader {
    public List<String> read(String fileName) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(fileName);
        List<String> list;
        try (BufferedReader b = new BufferedReader(f)) {
            list = new ArrayList<>();
            while((cadena = b.readLine())!=null) {
                list.add(cadena);
            }
        }
        return list;
    }
}