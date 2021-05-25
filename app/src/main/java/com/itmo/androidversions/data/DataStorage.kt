package com.itmo.androidversions.data

import com.itmo.androidversions.R

object DataStorage {
    fun getVersionsList(): List<Android> {
        return listOf(
            Android(
                "Cupcake",
                R.drawable.cupcake,
            ),
            Android("Donut",
                R.drawable.donut,
            ),
            Android(
                "Eclair",
                R.drawable.eclair,
            ),
            Android("Froyo",
                R.drawable.froyo,
            ),
            Android("Gingerbread",
                R.drawable.gingerbread,
            ),
            Android("Honeycomb",
                R.drawable.honeycomb,
            ),
            Android("Jelly Bean",
                R.drawable.jelly,
            ),
            Android("Kitkat",
                R.drawable.kitkat,
            ),
            Android("Lollipop",
                R.drawable.lollipop,
            ),
            Android("Marshmallow",
                R.drawable.marshmallow,
            ),
            Android("Nougat",
                R.drawable.nougat,
            ),
            Android("Oreo",
                R.drawable.oreo,
            ),
            Android("Pie",
                R.drawable.pie,
            ),
            Android("Android 10",
                R.drawable.android_ten,
            ),
            Android("Android 11",
                R.drawable.android_el,
            ),
            Android("Android 12",
                R.drawable.android_t,
            ),
        )
    }
}