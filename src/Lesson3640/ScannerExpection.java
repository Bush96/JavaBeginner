package Lesson3640;

public class ScannerExpection extends Exception {
    public ScannerExpection(String description){            //тупо доносим что работать будем со словами
        super(description);                                 //библиотека Expection позволяет примениться к ней своим исключением таким образом
    }
}
