package sec01;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


public class ConnectionTest {


    public static void main(String[] args) {

        // MongoDB 서버 연결 URI (로컬 서버, 기본 포트 27017)
        String uri = "mongodb://localhost:27017";

        // 접근할 데이터베이스 이름
        String db = "todo_db";

        try(MongoClient client = MongoClients.create(uri)){

            MongoDatabase database = client.getDatabase(db);

            System.out.println("MongoDB 연결 성공: " + db);

        }catch (Exception e) {
            System.err.println("MongoDB 연결 실패:");
            e.printStackTrace();
        }
    }
}