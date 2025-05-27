package sec02;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertManyResult;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;


public class InsertManyTest {

    public static void main(String[] args) {

        MongoCollection<Document> collection = Database.getCollection("todo");

        // 문서 리스트 객체 생성
        List<Document> insertList = new ArrayList<>();

        // 문서 객체 생성
        Document document1 = new Document();
        document1.append("title", "Dune2 영화보기");
        document1.append("desc", "이번 주말 IMAX로 Dune2 영화보기");
        document1.append("done", false);  // 미완료 상태

        // 문서 객체 생성
        Document document2 = new Document();
        document2.append("title", "Java MongoDB 연동");
        document2.append("desc", "Java로 MongoDB 연동 프로그래밍 연습하기");
        document2.append("done", false);  // 미완료 상태

        // 문서 리스트에 추가
        insertList.add(document1);
        insertList.add(document2);

        // 한 번에 Insert
        InsertManyResult result = collection.insertMany(insertList);

        System.out.println("==> InsertManyResult : " + result.getInsertedIds());

        Database.close();
    }
}