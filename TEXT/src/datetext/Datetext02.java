package datetext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
//SimpleDateFormat的应用
public class Datetext02 {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        SimpleDateFormat ft=new SimpleDateFormat();
        SimpleDateFormat ft1=new SimpleDateFormat("yyyy-mm-dd  hh-mm-ss");
        SimpleDateFormat ft2=new SimpleDateFormat("yyyy-mm-dd");

        System.out.println(ft.format(date));//默认格式
        System.out.println(ft1.format(date));//选定格式

        String st="2023-01-23";
        System.out.println(ft2.parse(st));//st和ft2格式相同才能输出，从字符串中解析文本以产生一个 Date
        System.out.println(ft2.format(ft2.parse(st)));//打印输入的时间
    }
}
