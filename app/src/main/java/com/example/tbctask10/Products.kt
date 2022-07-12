package com.example.tbctask10


data class Products(
    val image: Int,
    val title: String,
    val price: Double,
    val category: List<Category>
)

var selectedProductsList = mutableListOf<Products>()
val productsList = listOf(
    Products(
        R.drawable.jack_daniels,
        "JACK DANIELS",
        100.00,
        listOf(
            Category.ALL,
            Category.WHISKY,
            Category.TOP
        )
    ),
    Products(
        R.drawable.ballantines,
        "BALLANTINES",
        90.00,
        listOf(
            Category.ALL,
            Category.WHISKY,
        )
    ),
    Products(
        R.drawable.glenfiddich,
        "GLENFIDDICH",
        400.00,
        listOf(
            Category.ALL,
            Category.WHISKY,
            Category.TOP
        )
    ),
    Products(
        R.drawable.jameson,
        "JAMESON",
        50.00,
        listOf(
            Category.ALL,
            Category.WHISKY,
        )
    ),
    Products(
        R.drawable.wine1,
        "KONDOLI",
        50.00,
        listOf(
            Category.ALL,
            Category.WINE,
        )
    ),
    Products(
        R.drawable.wine2,
        "MILDIANI",
        60.00,
        listOf(
            Category.ALL,
            Category.WINE,
        )
    ),
    Products(
        R.drawable.wine3,
        "DUGLADZE",
        70.00,
        listOf(
            Category.ALL,
            Category.WINE,
        )
    ),
    Products(
        R.drawable.corona,
        "CORONA",
        10.00,
        listOf(
            Category.ALL,
            Category.BEER,
        )
    ),

    Products(
        R.drawable.heineken,
        "HEINEKEN",
        15.00,
        listOf(
            Category.ALL,
            Category.BEER,
            Category.TOP
        )
    ),

    Products(
        R.drawable.lowenbrau,
        "LOWENBRAU",
        15.00,
        listOf(
            Category.ALL,
            Category.BEER,
            Category.TOP
        )
    ),

    Products(
        R.drawable.stella_artois,
        "STELLA ARTOIS",
        18.00,
        listOf(
            Category.ALL,
            Category.BEER,
        )
    ),

    Products(
        R.drawable.bagration,
        "ROSE CHAMPAGNE",
        18.00,
        listOf(
            Category.ALL,
            Category.CHAMPAGNE,
        )
    ),

    Products(
        R.drawable.bagration2,
        " GOLD CHAMPAGNE",
        18.00,
        listOf(
            Category.ALL,
            Category.CHAMPAGNE,
        )
    ),

    )