package com.example.dino_eggs.data

import com.example.dino_eggs.R
import com.example.dino_eggs.data.Model.Dinos

class DataSource {


    fun getDinos (): List<Dinos> {
        return listOf(

            Dinos(
                "Kokettino",
                5.45,
                1.8,
                2.9,
                R.drawable.dino1,
                true

            ),
            Dinos(
                "Trampelino",
                8.25,
                1.8,
                2.9,
                R.drawable.dino2,
                false

            ),
            Dinos(
                "Kokettino",
                8.25,
                1.8,
                2.9,
                R.drawable.dino3,
                false

            ),
            Dinos(
                "Däumelino",
                5.15,
                1.8,
                1.5,
                R.drawable.dino4,
                true

            ),
            Dinos(
                "Bronto",
                8.25,
                1.8,
                2.1,
                R.drawable.dino5,
                false

            ),
            Dinos(
                "Tranquillino",
                5.05,
                1.8,
                2.7,
                R.drawable.dino6,
                true

            ),
            Dinos(
                "Hecktino",
                5.05,
                1.8,
                2.2,
                R.drawable.dino7,
                true

            ),
            Dinos(
                "Melodino",
                8.25,
                1.8,
                2.3,
                R.drawable.dino8,
                false

            ),
            Dinos(
                "Juwelina",
                8.25,
                1.8,
                2.7,
                R.drawable.dino9,
                false

            ),
            Dinos(
                "Pauline Pflaster",
                9.25,
                1.8,
                2.9,
                R.drawable.dino10,
                false

            ),
            Dinos(
                "Ritchie Richtfest",
                6.05,
                1.9,
                3.2,
                R.drawable.dino11,
                true

            ),
            Dinos(
                "Bronto Bauarbeiter",
                9.25,
                1.8,
                2.9,
                R.drawable.dino12,
                false

            ),
            Dinos(
                "Tranquillino Bauarbeiter",
                6.05,
                1.8,
                1.5,
                R.drawable.dino13,
                true

            )

        )
    }
}