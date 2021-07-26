package com.dicoding.picodiploma.zs_astonvillasquad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    private lateinit var rvPlayers: RecyclerView
    private var list: ArrayList<Player> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val actionbar = supportActionBar
        actionbar!!.title= "Aston Villa Players"

        rvPlayers = findViewById(R.id.rv_players)
        rvPlayers.setHasFixedSize(true)

        list.addAll(PlayersData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvPlayers.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListPlayerAdapter(list)
        rvPlayers.adapter = listHeroAdapter
    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.main_menu, menu)
//        return super.onCreateOptionsMenu(menu)
//    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        setMode(item.itemId)
//        return super.onOptionsItemSelected(item)
//    }

//    private fun setMode(selectedMode: Int) {
//        when (selectedMode) {
//            R.id.miCompose -> {
//                val iAbout = Intent(this@MainActivity,
//                    About::class.java)
//                startActivity(iAbout)
//            }
//        }
//    }
}