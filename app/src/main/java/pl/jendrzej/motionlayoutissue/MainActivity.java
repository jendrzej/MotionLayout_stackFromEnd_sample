package pl.jendrzej.motionlayoutissue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        RecyclerAdapter adapter = new RecyclerAdapter(getItems(1));
        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setStackFromEnd(true);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);
    }

    private List<Integer> getItems(int startNumber) {
        List<Integer> items = new ArrayList<>();
        for (int i = startNumber; i < startNumber + 10; i++) {
            items.add(i);
        }
        return items;
    }
}