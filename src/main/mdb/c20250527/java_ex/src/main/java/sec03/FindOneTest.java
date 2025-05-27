package sec03;

import app.Database;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public class FindOneTest {

    public static void main(String[] args) {

        // todo 컬렉션 객체 얻어오기
        MongoCollection<Document> collection = Database.getCollection("todo");

        // 존재하는 _id 작성
        String id = "683569e4e8e4e06e7711e2c4";

        // Filters.eq()
        Bson query = eq("_id", new ObjectId(id));
        // -> {"_id" : ObjectId("683569e4e8e4e06e7711e2c4") }

        // 조건을 만족하는 결과 중 1행(문서 1개)만 조회
        Document doc = collection.find(query).first();
        // db.todo.find({"_id" : ObjectId("683569e4e8e4e06e7711e2c4") })


        System.out.println("==> findByIdResult : " + doc);

        Database.close();
    }
}