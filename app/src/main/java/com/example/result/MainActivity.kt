package com.example.result

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView


private const val LAST_SELECTED_ITEM = "item"

class MainActivity : AppCompatActivity() {

    private lateinit var bottomHome: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomHome = findViewById(R.id.bottom_menu)

        val fioList: List<FIO> = listOf(
            FIO("Иванов", "Б.Ю."),
            FIO("Орел", "Г.Ш." ),
            FIO("Алшкевич", "У.Н.")

        )
        bottomHome.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val homeFragment = HomeFragment()
                    replaceFragment(homeFragment)
                }
                R.id.info -> {
                    val infoFragment = InfoFragment()
                                        val fioRecyclerView : RecyclerView = findViewById(R.id.fio_recycler_view)
                    fioRecyclerView.layoutManager=
                        LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

                  //  replaceFragment(infoFragment)}
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container,infoFragment)
                        .commit()
                    fioRecyclerView.adapter=FIOAdapter(fioList)
            }}
            true
        }




        bottomHome.selectedItemId = savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.home
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, bottomHome.selectedItemId)
        super.onSaveInstanceState(outState)
    }
}
