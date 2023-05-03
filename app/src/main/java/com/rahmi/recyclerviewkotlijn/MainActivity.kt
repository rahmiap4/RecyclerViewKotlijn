package com.rahmi.recyclerviewkotlijn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Ant-Man",
                "Ant-Man bisa memanipulasi ukuran tubuhnya, bukan hanya menjadi kecil namun juga menjadi raksasa dengan Pym Particle."

            ),
            Superhero(
                R.drawable.black,
                "Black Panter",
                "Black Panther adalah film superhero Amerika Serikat tahun 2018 berdasarkan karakter Marvel Comics dengan nama sama."
            ),
            Superhero(
                R.drawable.captain,
                "Captain America",
                "Captain America adalah sosok pahlawan super fiktif dari Marvel Comics. Memiliki musuh besar bernama Salwi Ackerman dan Baron Zemo, Rogers adalah tentara AS yang tidak memiliki kemampuan sama sekali."
            ),
            Superhero(
                R.drawable.doctor,
                "Doctor Strange",
                "Doctor Strange memiliki kekuatan memutar balikkan waktu, bending reality, dan membuka portal."

            ),
            Superhero(
                R.drawable.gamora,
                "Gamora",
                "Gamora adalah putri angkat Thanos, dan yang terakhir dari spesiesnya"

            ),
            Superhero(
                R.drawable.hawkeye,
                "Hawkeye",
                "Hawkeye menceritakan kisah Clint Barton (Jeremy Renner) menebus waktu yang hilang bersama keluarga tercintanya."

            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Kelemahan Hulk yang lain adalah egonya sendiri, kepribadian ganda yang dimilikinya, sosok Bruce Banner dan Adamantium atau senjata mematikan yang terbuat dari logam"

            ),
            Superhero(
                R.drawable.iron,
                "Iron-Man",
                "Iron Man memiliki armor bertenaga yang memberinya kekuatan dan daya tahan super, terbang, dan sederet senjata"

            ),
            Superhero(
                R.drawable.loki,
                "Loki",
                "Loki adalah dewa tipuan Jermanik"

            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

    }
}