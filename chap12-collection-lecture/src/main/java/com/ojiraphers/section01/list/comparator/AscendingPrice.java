package main.java.com.ojiraphers.section01.list.comparator;

import main.java.com.ojiraphers.section01.list.dto.BookDTO;

import java.util.Comparator;

    public class AscendingPrice implements Comparator<BookDTO> {

        int result = 0;

        @Override
        public int compare(BookDTO o1, BookDTO o2) {
            if (o1.getPrice() > o2.getPrice()) {
                result = 1;
            } else if (o1.getPrice() < o2.getPrice()) {
                result = -1;
            } else {
                result = 0;
            }
            return 0;
        }
    }
