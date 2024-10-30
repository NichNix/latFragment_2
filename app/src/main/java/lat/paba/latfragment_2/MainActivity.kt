package lat.paba.latfragment_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private var counter = 99

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navHostFragment.navController

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_fragment1 -> {
                    counter -= 1
                    navController.navigate(R.id.fragment1, bundleOf("counter" to counter))
                    true
                }
                R.id.nav_fragment2 -> {
                    counter -= 2
                    navController.navigate(R.id.fragment2, bundleOf("counter" to counter))
                    true
                }
                R.id.nav_fragment3 -> {
                    counter -= 3
                    navController.navigate(R.id.fragment3, bundleOf("counter" to counter))
                    true
                }
                else -> false
            }
        }

        navController.navigate(R.id.fragment1, bundleOf("counter" to counter))
    }
}
