package com.tef.hellworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson

class ListSuperheroesActivity : AppCompatActivity() {

    private lateinit var listSuperheroes: ArrayList<SuperheroItem>
    private lateinit var superheroesAdapter: SuperheroesAdapter
    private lateinit var superheroesRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_superheroes)

        superheroesRecyclerView = findViewById(R.id.superheroes_recycler_view)

       // listSuperheroes = createMockSuperheroes()

        listSuperheroes = laodMockSuperheroesFromJson()

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

    private fun laodMockSuperheroesFromJson(): ArrayList<SuperheroItem> {

        val superheroesString: String = applicationContext.assets.open("superheroes.json").bufferedReader().use{it.readText()}
        val gson = Gson()
        val superheroesList = gson.fromJson(superheroesString, Superhero::class.java)
        return superheroesList

    }

   /* private fun createMockSuperheroes(): ArrayList<Superhero> {
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
                occupation = "Reporter",
                urlPicture = "https://www.dccomics.com/sites/default/files/styles/character_thumb_160x160/public/Char_Profile_Superman_20190116_5c3fc2758f6a12.25513240.jpg"
            ),
            Superhero(
                name = "Batman",
                powers = "Exceptional martial artist, combat strategy, inexhaustible wealth, brilliant deductive skill, advanced technology",
                alias = "Bruce Wayne",
                city = "Gotham",
                facebook = "https://www.facebook.com/batman",
                occupation = "CEO of Wayne Enterprises",
                urlPicture = "https://www.dccomics.com/sites/default/files/styles/character_thumb_160x160/public/Char_Profile_Batman_20190116_5c3fc4b40faec2.47318964.jpg"
            ),
            Superhero(
                name = "Wonder Woman",
                powers = "Super strength, invulnerability, flight, combat skill, combat strategy, superhuman agility, healing factor, magic weaponry",
                alias = "Diana Prince",
                city = "Temiscira",
                facebook = "https://www.facebook.com/wonderwoman",
                occupation = "Secretary",
                urlPicture = "https://www.dccomics.com/sites/default/files/styles/character_thumb_160x160/public/Char_Profile_WonderWoman_20190116_5c3fc6aa51d0e3.49076914.jpg"
            ),
            Superhero(
                name = "Flash",
                powers = "Super speed, intangibility, superhuman agility",
                alias = "Barry Allen, Jay Garrick, Wally West",
                city = "Central City",
                facebook = "https://www.facebook.com/theflash",
                occupation = "Forensic scientist",
                urlPicture = "https://www.dccomics.com/sites/default/files/styles/character_thumb_160x160/public/Char_Profile_Flash_20190116_5c3fcaaa18f0e8.03668117.jpg"
            ),
            Superhero(
                name = "Green Lantern",
                powers = "Hard light constructs, instant weaponry, force fields, flight, durability, alien technology",
                alias = "Hal Jordan",
                city = "Coast City",
                facebook = "",
                occupation = "Test pilot",
                urlPicture = "https://www.dccomics.com/sites/default/files/styles/character_thumb_160x160/public/Char_Profile_GreenLantern_20200721_5f173ad01724e2.92436411.jpg"
        )

        )
    }*/
}