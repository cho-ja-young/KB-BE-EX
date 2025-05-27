package sec04;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import static com.mongodb.client.model.Filters.eq;

public class UpdateOneTest {

    public static void main(String[] args) {

        MongoCollection<Document> collection = Database.getCollection("todo");

        // 실제 존재하는 _id 작성
        String id = "68353d28970d3a2b9f4a4094";

        // Filters.eq() : 같음 조건
        Bson query = eq("_id", new ObjectId(id));
        // -> {"_id" : ObjectId("68353de71d306d381ef3846f") }

        //  Updates.combine() : 업데이트할 내용을 묶는 메서드
        // Updates.set("name", "modify name") : name 필드 값을 "modify name" 으로 설정

        // Updates.currentTimestamp("lastUpdated") :
        //   lastUpdated 필드 값으로 현재 시간(currentTimestamp) 설정
        Bson updates = Updates.combine(
                Updates.set("name", "modify name"),
                Updates.currentTimestamp("lastUpdated")
        );

        UpdateResult result = collection.updateOne(query, updates);

        // 수정된 문서 개수 반환
        System.out.println("==> UpdateResult : " + result.getModifiedCount());

        Database.close();
    }
}