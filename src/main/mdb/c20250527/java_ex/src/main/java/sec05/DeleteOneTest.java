package sec05;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import static com.mongodb.client.model.Filters.eq;


public class DeleteOneTest {

    public static void main(String[] args) {

        MongoCollection<Document> collection = Database.getCollection("todo");

        // 존재하는 _id 작성
        String id = "68351227799a931ebfad3049";

        Bson query = eq("_id", new ObjectId(id));

        DeleteResult result = collection.deleteOne(query);

        System.out.println("==> DeleteResult : " + result.getDeletedCount());

        Database.close();
    }
}