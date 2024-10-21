package patterns.facade;

import java.util.HashMap;
import java.util.Map;

public class DBMS {
    private Map<String, Row> db = new HashMap<>();

    public DBMS() {
        db.put("cmh1", new Row("cmh1", "1990-01-01", "hji1231@naver.com"));
        db.put("cmh2", new Row("cmh2", "1990-02-02", "hji1232@naver.com"));
        db.put("cmh3", new Row("cmh3", "1990-03-03", "hji1233@naver.com"));
    }

    public Row query(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return db.get(name);
    }
}
