package mx.com.randyfull8.facebook2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import mx.com.randyfull8.facebook2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;

private List<Renglon> renglones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
renglones = new ArrayList<>();
        renglones.add(new Renglon("Randy Flores","30 min"));
        renglones.add(new Renglon("Job Melendez","40 min"));
        renglones.add(new Renglon("César Eduardo","1 hr"));


        binding.recycle1.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recycle1.setLayoutManager(layoutManager);
RenglonesAdapter adapter = new RenglonesAdapter(renglones);
binding.recycle1.setAdapter(adapter);

    }





}