package com.example.methodsandclasses;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String username; //Burda tanımlanan değişkenlere tüm metodlar içerisinde ulaşılabilir
   /* String Musician1;
    String Musician2;
    int age1;
    int age2;
    String instrument1;
    String instrument2;*/ //Tek tek burada tanımlamak karmaşaye sebebiyet verecektir. bu durumda sınıflar kullanılır.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        System.out.println("Call On Create Method");

        testMetod();
       // System.out.println(math(7,3));

        System.out.println(newMetod("Burak"));

        username = "James";
        makeMusicians();
        makeSimpsons();
    }
    public void makeSimpsons(){
        Simpsons Homer = new Simpsons("Homer",50,"Nuclear");
        System.out.println(Homer.getName());
        Homer.setName("Homer Simpson");
        System.out.println(Homer.getName());//getter setter kullanarak private değerleri değiştirip çağırma işlemi yaptık
    }

    public void makeMusicians(){
        Musicians James = new Musicians("James","Guitar",50);
    //Sınır oluşturup ilk nesneyi tanımladık.
        System.out.println(James.instrument);


    }

    public void testMetod(){

        username = "Burak";
        int x = 4+4;
        x = 9;
        System.out.println("value of x : " + x);

    }
    public int math(int a, int b){

        username = "Uzun";
        int x = 10;

        System.out.println("value of x in math :"+ x); //int döndüren metod
        return a+b;
    }
    public String newMetod(String string){

        return string + " " + "new Metod"; //string döndüren metod
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }
}