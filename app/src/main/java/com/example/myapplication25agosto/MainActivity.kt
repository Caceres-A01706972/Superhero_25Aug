package com.example.myapplication25agosto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val es inmutable
        val batman:Superhero = Superhero(
            "Batman",
            "DC",
            "Bruce Wayne",
            "https://dam.smashmexico.com.mx/wp-content/uploads/2020/04/ayuda-a-tu-pequeno-a-hacer-el-cinturon-de-batman-cover.jpg"
        )

        //Toolkit
        println(batman.superHero)
        println(batman.publisher)
        Log.d("Salida", batman.realName)
        Log.d("Salida", batman.photo)
        batman.toString()

        //Copy method, copies object but allows to change things
        val superBatman:Superhero = batman.copy(superHero = "SuperBatman")
        val newPublisher:Superhero = batman.copy(publisher = "Marvel")

        var superheros:MutableList<Superhero> = mutableListOf()
        superheros.add(Superhero("Spiderman", "Marvel", "Peter Parker", "https://encrypted-tbn0.gstatic.com/images? q=tbn:ANd9GcTlIDfIYRyHaII6Wi4yRtsEbyj25PcAbJRCcO7tfFqlnWLWgEz51sw6Z0MyRKD3y4FFe8I&usqp=C AU"))
        superheros.add(Superhero("Daredevil", "Marvel", "Matthew Michael Murdock", "https://cloudfront-us-east-1.images.arcpublishing.com/gruporepublica/XOTXKUBUOBC2FKL45A6Q6METKM.jpg"))
        superheros.add(Superhero("Wolverine", "Marvel", "James Howlett", "https://i0.wp.com/imgs.hipertextual.com/wp-content/uploads/2019/08/hipertextual- hermanos-russo-explican-que-habrian-hecho-con-x-men-peliculas-avengers-2019870936.jpg? fit=1200%2C675&quality=50&strip=all&ssl=1"))
        superheros.add(Superhero("Batman", "DC", "Bruce Wayne", "https://dam.smashmexico.com.mx/wp-content/uploads/2020/04/ayuda-a-tu-pequeno-a-hacer- el-cinturon-de-batman-cover.jpg"))
        superheros.add(Superhero("Thor", "Marvel", "Thor Odinson", "https://eloutput.com/app/uploads-eloutput.com/2022/02/thor-fuerte.jpg"))
        superheros.add(Superhero("Flash", "DC", "Jay Garrick", "https://i0.wp.com/www.lacasadeel.net/wp-content/uploads/2020/01/flash-cover- header.jpg"))
        superheros.add(Superhero("Green Lantern", "DC", "Alan Scott", "https://static.wikia.nocookie.net/batman/images/8/88/Linterna- verde.jpg/revision/latest/top-crop/width/360/height/360?cb=20170921191634&path- prefix=es"))
        superheros.add(Superhero("Wonder Woman", "DC", "Princess Diana", "https://dam.smashmexico.com.mx/wp-content/uploads/2017/04/La-historia-de-Wonder-Woman- en-anecdotas-y-curiosidades-cover.jpg"))



    }
}