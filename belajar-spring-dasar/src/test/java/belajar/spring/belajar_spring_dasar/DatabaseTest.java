package belajar.spring.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    void TestDatabaseInstance(){

        var database1 = Database.getInstance();
        var database2 = Database.getInstance();

        Assertions.assertSame(database1, database2);

    }

}