package com.tef.hellworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListSuperheroesActivity : AppCompatActivity() {

    private lateinit var listSuperheroes: ArrayList<Superhero>
    private lateinit var superheroesAdapter: SuperheroesAdapter
    private lateinit var superheroesRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_superheroes)

        superheroesRecyclerView = findViewById(R.id.superheroes_recycler_view)

        listSuperheroes = createMockSuperheroes()

        superheroesAdapter = SuperheroesAdapter(listSuperheroes)

      /*  superheroesRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
       superheroesRecyclerView.adapter = superheroesAdapter */

        superheroesRecyclerView.apply{
            layoutManager = LinearLayoutManager(context)
            adapter = superheroesAdapter
            setHasFixedSize(false)
        }
    }

    private fun createMockSuperheroes(): ArrayList<Superhero> {
       /* var list: ArrayList<Superhero> = arrayListOf()
        var superhero = Superhero(
            name = "Superman",
            powers = "Super strength, flight, invulnerability, super speed, heat vision, freeze breath, x-ray vision, superhuman hearing, healing factor",
            alias = "Clark Kent, Kal-El",
            city = "Metropolis",
            facebook = "https://www.facebook.com/superman",
            occupation = "Reporter"
        )
        list.add(superhero)
        return list
        */

        return arrayListOf(

            Superhero(
                name = "Superman",
                powers = "Super strength, flight, invulnerability, super speed, heat vision, freeze breath, x-ray vision, superhuman hearing, healing factor",
                alias = "Clark Kent, Kal-El",
                city = "Metropolis",
                facebook = "https://www.facebook.com/superman",
                occupation = "Reporter"
            ),
            Superhero(
                name = "Batman",
                powers = "Exceptional martial artist, combat strategy, inexhaustible wealth, brilliant deductive skill, advanced technology",
                alias = "Bruce Wayne",
                city = "Gotham",
                facebook = "https://www.facebook.com/batman",
                occupation = "CEO of Wayne Enterprises"
            ),
            Superhero(
                name = "Wonder Woman",
                powers = "Super strength, invulnerability, flight, combat skill, combat strategy, superhuman agility, healing factor, magic weaponry",
                alias = "Diana Prince",
                city = "Temiscira",
                facebook = "https://www.facebook.com/wonderwoman",
                occupation = "Secretary"
            ),
            Superhero(
                name = "Flash",
                powers = "Super speed, intangibility, superhuman agility",
                alias = "Barry Allen, Jay Garrick, Wally West",
                city = "Central City",
                facebook = "https://www.facebook.com/theflash",
                occupation = "Forensic scientist"
            ),
            Superhero(
                name = "Green Lantern",
                powers = "Hard light constructs, instant weaponry, force fields, flight, durability, alien technology",
                alias = "Hal Jordan",
                city = "Coast City",
                facebook = "",
                occupation = "Test pilot"
        )

        )
    }
}