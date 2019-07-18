package java8Date;

import org.junit.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class DateTest {

    /**
     * 测试LocalDate
     */
    @Test
    public void LocalDateTest() {

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalTime time = LocalTime.now();
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
    }

    /**
     * instant
     */
    @Test
    public  void instantTest() {
        //时间戳
        Instant now = Instant.now();
        System.out.println("niuyue:"+now);
        //修改成北京时间时区
        Instant beijing = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
        System.out.println("beijing:"+beijing);
        //获取秒数、毫秒数
        System.out.println("秒数:"+beijing.getEpochSecond());
        System.out.println("毫秒数:"+beijing.toEpochMilli());

        //LocalDateTime输出毫秒数的方式，比Instant多一步转换
        LocalDateTime localDateTime = LocalDateTime.now();
        //LocalDateTime转Instant
        Instant localDateTime2Instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        System.out.println("LocalDateTime 毫秒数:"+localDateTime2Instant.toEpochMilli());
    }

    /**
     * period 两个日期间隔
     */
    @Test
    public void periodTest()  {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);
        LocalDate birthDate = LocalDate.of(1993, Month.OCTOBER, 19);
        System.out.println("BirthDate : " + birthDate);
        Period p = Period.between(birthDate, today);
        System.out.printf("年龄 : %d 年 %d 月 %d 日", p.getYears(), p.getMonths(), p.getDays());
    }

    /**
     * duration 可以处理 lacalTime LocalDateTime Instant
     * 不能处理LocalDate
     */
    @Test
    public void durationTest()  {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);
        LocalDate birthDate = LocalDate.of(1993, Month.OCTOBER, 19);
        System.out.println("BirthDate : " + birthDate);
        Duration d = Duration.between(birthDate, today);
        System.out.println(d.getNano());
    }

    /**
     * duration 可以处理 lacalTime LocalDateTime Instant
     * 不能处理LocalDate
     */
    @Test
    public void durationTest2()  {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today : " + today);
        LocalDateTime birthDate = LocalDateTime.of(1993, Month.OCTOBER, 19, 10,10,10);
        System.out.println("BirthDate : " + birthDate);
        Duration d = Duration.between(birthDate, today);
        System.out.println(d.getNano());
    }



    /**
     * 两个日期间的天数
     */
    @Test
    public void chronoUtilTest() {
        LocalDate startDate = LocalDate.of(1993, Month.OCTOBER, 19);
        System.out.println("开始时间  : " + startDate);

        LocalDate endDate = LocalDate.of(2017, Month.JUNE, 16);
        System.out.println("结束时间 : " + endDate);

        long daysDiff = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("两天之间的差在天数   : " + daysDiff);
    }

    /**
     * 不同日期格式转化
     * 01. java.util.Date --> java.time.LocalDateTime
     */
    @Test
    public void UDateToLocalDateTime() {
        java.util.Date date = new java.util.Date();
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
    }

    /**
     * 不同日期格式转化
     * 02. java.util.Date --> java.time.LocalDate
     */
    @Test
    public void UDateToLocalDate() {
        java.util.Date date = new java.util.Date();
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        LocalDate localDate = localDateTime.toLocalDate();
    }

    // 03. java.util.Date --> java.time.LocalTime
    @Test
    public void UDateToLocalTime() {
        java.util.Date date = new java.util.Date();
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        LocalTime localTime = localDateTime.toLocalTime();
    }


    // 04. java.time.LocalDateTime --> java.util.Date
    @Test
    public void LocalDateTimeToUdate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        java.util.Date date = Date.from(instant);
    }


    // 05. java.time.LocalDate --> java.util.Date
    @Test
    public void LocalDateToUdate() {
        LocalDate localDate = LocalDate.now();
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
        java.util.Date date = Date.from(instant);
    }

    // 06. java.time.LocalTime --> java.util.Date
    @Test
    public void LocalTimeToUdate() {
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        java.util.Date date = Date.from(instant);
    }


}
