package com.example.idea_bug_demo;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Arrays;

import static com.example.idea_bug_demo.Foo.Bar.*;


@Service
public class Foo {

    public void foo() {
        System.out.println(Arrays.asList(GROUP_BY_YEAR, GROUP_BY_MONTH, GROUP_BY_BRAND));

    }

    /**
     * if put these static variables outer it is ok
     */
//    public static final String GROUP_BY_BRAND = "brand";
//    public static final String GROUP_BY_YEAR = "dt_year";
//    public static final String GROUP_BY_MONTH = "dt_month";
    @Data
    static class Bar{
        /**
         * but inner cause problem
          */
        public static final String GROUP_BY_BRAND = "brand";
        public static final String GROUP_BY_YEAR = "dt_year";
        public static final String GROUP_BY_MONTH = "dt_month";


    }



}
