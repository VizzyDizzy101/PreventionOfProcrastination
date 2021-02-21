package e.vismay.preventionofprocrastination;

import androidx.appcompat.app.AppCompatActivity;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.ConnectionString;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientSettings;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MongoClient mongoClient = MongoClients.create("mongodb://user1:pwd1@host1/?authSource=db1&ssl=true");
    }
}
