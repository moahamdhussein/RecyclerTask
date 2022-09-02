package com.example.recyclertask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rec = findViewById<RecyclerView>(R.id.testRecyclerView)
        rec.layoutManager = GridLayoutManager(this, 1)

        val movielist = mutableListOf<movie>()
        movielist.add(
            movie(
                "captain america",
                "The story of the film deals with the attempt of government organizations to control the activities of the superheroes and come face to face against the Avengers team, so (Captain America) finds himself in conflict with his former allies, led by (Iron Man) with the aim of dividing and weakening them to control them",
                R.drawable.captain
            )
        )
        movielist.add(
            movie(
                "don't breath",
                "Norman, a visually challenged navy veteran, lives in quiet solace with his foster daughter, Phoenix. However, he is forced to tap into his darker instincts when Phoenix is abducted.",
                R.drawable.dont
            )
        )
        movielist.add(
            movie(
                "fantastic beasts",
                "In 1926, inside the secret society of wizards in New York City, writer (Newt Scamander) attends a meeting in the United States with an official to discuss the repercussions of several magical creatures emerging from a magical bag, threatening the wizarding world and the plebeians with him. Those serious threats and the preservation of public security for the two communities.",
                R.drawable.fantastic
            )
        )
        movielist.add(
            movie(
                "expendables",
                "Barney Ross (Sylvester Stallone) leads a gang of highly skilled mercenaries, always enthusiastic fighter Lee (Jason Statham), martial arts expert Yang Yin (Jet Li), heavy weapons expert Hill Caesar (Terry Crews), and road expert Toll (Mickey Rourke). ), professional sniper Jensen (Dolph Lundgren); To assassinate a ruthless dictator ruling a small fake island in South America. First travels (Barney and Lee) to meet the dictator's opponents and learn about the nature of the place",
                R.drawable.expendables
            )
        )
        movielist.add(
            movie(
                "harry potter",
                "He tries to achieve (Harry Potter), tries to achieve the goal of (Hogwarts) Voldemort, as he uses a demonic fire spell, watching causes the destruction of the Sixth Horcrux.",
                R.drawable.harry
            )
        )
        movielist.add(
            movie(
                "Iron Man",
                "Tony Stark encounters a formidable foe called the Mandarin. After failing to defeat his enemy, Tony embarks on a journey of self-discovery as he fights against the powerful Mandarin.",
                R.drawable.iron
            )
        )
        movielist.add(
            movie(
                "John Wick",
                "The film revolves around the hired killer (John Wick), who continues one of his new adventures full of deadly dangers and many rivalries from all sides, as he returns to the world of crime again to pay off a debt owed by him, and discovers that there is a financial reward in place for those who succeed in eliminating on him.",
                R.drawable.john
            )
        )
        movielist.add(
            movie(
                "Mission impossible Fallout",
                "The film revolves around a mission by the Mission Impossible team led by Ethan Hunt, in which they are racing against time after one of their missions goes wrong, as they try to prevent the use of three nuclear warheads by Solomon Lane and an extremist group called (The Messengers).",
                R.drawable.mission
            )
        )
        movielist.add(
            movie(
                "No Time To Die",
                "Central Intelligence Agency (CIA) Felix Leiter appears to his long-serving friend Bond and asks him for help to confront a mysterious villain armed with dangerous new technology.",
                R.drawable.notime
            )
        )
        movielist.add(
            movie(
                "Sonic",
                "A cop in the rural town of Green Hills helps Sonic the Hedgehog escape from the government that is looking to capture him, but does this have a natural cause? Wasn't the government chasing him in the first place?",
                R.drawable.sonic
            )
        )
        movielist.add(
            movie(
                "Spider Man Far From Home",
                "Peter Parker and his friends go on summer vacation to Europe, where Peter finds himself trying to save his friends from the hands of a villain known as Mysterio.",
                R.drawable.spider
            )
        )
        movielist.add(
            movie(
                "The Conjuring",
                "Paranormal investigators Ed and Lorraine Warren work to help a family terrorized by a dark presence in their farmhouse.",
                R.drawable.the_conjuring
            )
        )
        movielist.add(
            movie(
                "The NUN",
                "A priest and a novice arrive in Romania to investigate the death of a young nun. However, things take an ugly turn after they encounter a supernatural force.",
                R.drawable.the_nun
            )
        )
        movielist.add(
            movie(
                "Thor RagnaRok",
                "Thor is imprisoned on the other side of the universe and finds himself in a frantic race against time, retracing his travels with Asgard and trying to stop Ragnarok... while the ruthless Hela threatens his homeland and the Asgardian civilization with vandalism and destruction with her superpowers, and upon him To enter into a battle in which he faces (Hulk) to save the situation.",
                R.drawable.thor
            )
        )
        movielist.add(
            movie(
                "Tom And Jerry",
                " In the world of Tom and Jerry, the events focus on the first time a cat meets a mouse, and how their relationship between friendship and enmity is formed with a long history of adventures and pranks between the pair.",
                R.drawable.tom_and_jerry
            )
        )
        movielist.add(
            movie(
                "Wrath Of Men",
                "The work deals with the story of a man who drives money trucks, carrying billions of cash daily in the suburbs of Los Angeles, and faces many dangers and difficulties on his way.",
                R.drawable.wrath_of_man
            )
        )
        val myAdapter = CustomAdapter(movielist)
        rec.adapter = myAdapter

    }
}