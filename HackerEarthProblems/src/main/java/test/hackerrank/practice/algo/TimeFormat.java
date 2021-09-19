package test.hackerrank.practice.algo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeFormat {
  public static void main(String[] args) throws ParseException {
    Scanner in = new Scanner(System.in);
    String input = in.next();
    DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
    DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
    Date date = df.parse(input);
    String output = outputformat.format(date);
    System.out.println(output);
    in.close();
  }
}
