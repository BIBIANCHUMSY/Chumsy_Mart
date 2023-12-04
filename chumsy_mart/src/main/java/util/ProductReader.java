package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductReader {
    public static void main(String[] args) {

        ArrayList newList = new ArrayList();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/mac/Desktop/Product.csv"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }
            }catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

